package com.funkyer.msp.api.dto;

/**
 * Created by liushi on 17/4/8.
 */
public class PlayVodResponse extends BaseResponse
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String playUrl;

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }
}
