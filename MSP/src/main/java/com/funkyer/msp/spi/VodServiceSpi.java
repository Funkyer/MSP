package com.funkyer.msp.spi;

import com.funkyer.msp.api.content.VodService;
import com.funkyer.msp.api.dto.PlayVodRequest;
import com.funkyer.msp.api.dto.PlayVodResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liushi on 17/4/8.
 */
@Controller
public class VodServiceSpi implements VodService
{
    @RequestMapping("/PlayVod")
    @ResponseBody
    public PlayVodResponse play(PlayVodRequest request)
    {

        PlayVodResponse response = new PlayVodResponse();
        return response;
    }

}
