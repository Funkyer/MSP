package com.funkyer.msm.content.api;

import com.funkyer.msm.content.api.domain.Vod;

import java.util.List;

/**
 * Created by liushi on 17/10/6.
 */
public interface VodManage
{
    public void add(Vod vod);
    public void delete(Vod vod);
    public List<Object> query(Vod vod);
    public void update(Vod vod);
}
