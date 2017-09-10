package com.funkyer.content.api.dto;
import com.funkyer.content.domain.Vod;
/**
 * Created by dell on 2017/5/14.
 */
public class GetVodByIdResponse extends BaseResponse
{
    private Vod vod;

    public Vod getVod() {
        return vod;
    }

    public void setVod(Vod vod) {
        this.vod = vod;
    }
}
