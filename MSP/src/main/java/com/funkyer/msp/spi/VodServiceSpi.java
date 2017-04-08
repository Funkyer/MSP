package com.funkyer.msp.spi;

import com.funkyer.msp.api.content.VodService;
import com.funkyer.msp.api.dto.PlayVodRequest;
import com.funkyer.msp.api.dto.PlayVodResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liushi on 17/4/8.
 */
@Controller
public class VodServiceSpi implements VodService
{
    @RequestMapping(value="/PlayVod",method=RequestMethod.POST)
    @ResponseBody
    @Override
    public PlayVodResponse play(@RequestBody PlayVodRequest request)
    {
         System.out.println("----enter playvod----------");
        PlayVodResponse response = new PlayVodResponse();
        return response;
    }

    @RequestMapping(value="/Test",method=RequestMethod.GET)
    @ResponseBody
	@Override
	public String test() {
		return "test spring mvc";
	}

}
