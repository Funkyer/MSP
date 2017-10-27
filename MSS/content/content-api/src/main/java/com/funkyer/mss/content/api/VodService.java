package com.funkyer.mss.content.api;

import com.funkyer.mss.content.api.dto.GetVodByIdRequest;
import com.funkyer.mss.content.api.dto.GetVodByIdResponse;
import com.funkyer.mss.content.domain.ContentFilter;
import com.funkyer.mss.content.domain.Vod;

/**
 * Created by dell on 17-4-4.
 */
public interface VodService
{
    public GetVodByIdResponse getVodById(GetVodByIdRequest request);

    public Vod[] queryVod(ContentFilter[] filter);
}
