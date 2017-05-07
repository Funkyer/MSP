package com.funkyer.content.spi;

import com.funkyer.content.spi.convert.VodConvert;
import com.funkyer.jdbc.service.VodManage;
import com.funkyer.content.api.VodService;
import com.funkyer.content.domain.ContentFilter;
import com.funkyer.content.domain.Vod;
import com.funkyer.redis.RedisClient;
import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by dell on 2017/5/7.
 */
public class VodServiceSpi implements VodService {

    private static Logger logger = Logger.getLogger(VodServiceSpi.class);

    private RedisClient redisClient;
    private VodManage vodManage;
    @Override
    public Vod getVodById(String id) {

        if(logger.isDebugEnabled())
        {
            logger.debug("getVodById id = "+id);
        }
        Vod vod = (Vod)redisClient.get(id);

        if(null == vod)
        {
            com.funkyer.jdbc.domain.Vod v = new com.funkyer.jdbc.domain.Vod();
            v.setId(id);
            List<Object> vods  = vodManage.query(v);
            if(CollectionUtils.isEmpty(vods))
            {
                return null;
            }
            else
            {
                v = (com.funkyer.jdbc.domain.Vod)vods.get(0);
                vod = VodConvert.convert2ServiceDomain(v);

                redisClient.set(id,vod);
            }
        }
        return vod;
    }

    @Override
    public Vod[] queryVod(ContentFilter[] filter) {
        return new Vod[0];
    }

    public void setRedisClient(RedisClient redisClient) {
        this.redisClient = redisClient;
    }

    public void setVodManage(VodManage vodManage) {
        this.vodManage = vodManage;
    }
}
