package com.funkyer.mss.content.spi.convert;

import com.funkyer.mss.content.domain.Dialect;
import com.funkyer.mss.content.domain.Vod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2017/5/7.
 */
public class VodConvert {

    public static  Vod convert2ServiceDomain(com.funkyer.msm.content.api.domain.Vod vod)
    {
        Vod v = new Vod();
        v.setArtist(vod.getArtist());
        v.setDetailType(vod.getDetailType());
        v.setDuration(vod.getDuration());
        v.setParticularDate(vod.getParticularDate());
        v.setPoster(vod.getPoster());
        v.setVodType(vod.getVodType());
        v.setId(vod.getId());
        Map<String,Dialect> dialectMap = new HashMap<>();
        Dialect dialect = new Dialect();
        dialect.setIntroduce(vod.getIntroduce());
        dialect.setKey("cn");
        dialect.setName(vod.getName());
        dialectMap.put("cn",dialect);
        v.setDialectMap(dialectMap);
        return v;
    }
}
