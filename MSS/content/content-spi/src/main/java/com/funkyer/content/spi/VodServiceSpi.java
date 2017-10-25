package com.funkyer.content.spi;

import com.funkyer.common.domain.Result;
import com.funkyer.content.api.dto.GetVodByIdRequest;
import com.funkyer.content.api.dto.GetVodByIdResponse;
import com.funkyer.content.spi.convert.VodConvert;
import com.funkyer.content.api.VodService;
import com.funkyer.content.domain.ContentFilter;
import com.funkyer.content.domain.Vod;
import com.funkyer.msm.api.VodManage;
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
    public GetVodByIdResponse getVodById(GetVodByIdRequest request) {

        GetVodByIdResponse response = new GetVodByIdResponse();
        Result result = new Result();
        response.setResult(result);
        Vod vod = (Vod)redisClient.get(request.getId());

        if(null == vod)
        {
            com.funkyer.msm.api.domain.Vod v = new com.funkyer.msm.api.domain.Vod();
            v.setId(request.getId());
            List<Object> vods  = vodManage.query(v);
            if(CollectionUtils.isEmpty(vods))
            {
                return response;
            }
            else
            {
                v = (com.funkyer.msm.api.domain.Vod)vods.get(0);
                vod = VodConvert.convert2ServiceDomain(v);

                redisClient.set(request.getId(),vod);
            }
        }
        response.setVod(vod);
        return response;
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
