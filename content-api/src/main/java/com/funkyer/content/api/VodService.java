package com.funkyer.content.api;

import com.funkyer.content.domain.ContentFilter;
import com.funkyer.content.domain.Vod;

/**
 * Created by dell on 17-4-4.
 */
public interface VodService
{
    public Vod getVodById(String id);

    public Vod[] queryVod(ContentFilter[] filter);
}
