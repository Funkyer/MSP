package com.funkyer.content.api;

import com.funkyer.content.api.dto.GetVodByIdRequest;
import com.funkyer.content.api.dto.GetVodByIdResponse;
import com.funkyer.content.domain.ContentFilter;
import com.funkyer.content.domain.Vod;

/**
 * Created by dell on 17-4-4.
 */
public interface VodService
{
    public GetVodByIdResponse getVodById(GetVodByIdRequest request);

    public Vod[] queryVod(ContentFilter[] filter);
}
