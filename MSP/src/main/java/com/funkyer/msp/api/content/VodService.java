package com.funkyer.msp.api.content;

import com.funkyer.msp.api.dto.PlayVodRequest;
import com.funkyer.msp.api.dto.PlayVodResponse;

/**
 * Created by dell on 17-4-3.
 */
public interface VodService
{
    /**
     * 根据内容id,查询播放url
     * @param request
     * @return PlayVodResponse
     */
    public PlayVodResponse play(String id);
    
}
