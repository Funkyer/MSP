package com.funkyer.msp.api.dto;

/**
 * Created by liushi on 17/4/8.
 */
public class PlayVodRequest extends BaseRequest
{

    private String vodId;

    public String getVodId() {
        return vodId;
    }

    public void setVodId(String vodId) {
        this.vodId = vodId;
    }
}
