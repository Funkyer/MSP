package com.funkyer.msm.content.api;

import com.funkyer.msm.content.api.domain.Media;
import com.funkyer.msm.content.api.domain.Vod;

import java.util.List;

/**
 * Created by liushi on 17/10/6.
 */
public interface MediaManage
{
    public void add(Media media);
    public void delete(Media media);
    public List<Object> query(Media media);
    public void update(Media media);
}
