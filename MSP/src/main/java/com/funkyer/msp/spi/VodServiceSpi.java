package com.funkyer.msp.spi;

import com.funkyer.content.api.dto.GetVodByIdRequest;
import com.funkyer.content.api.dto.GetVodByIdResponse;
import com.funkyer.msp.api.dto.PlayVodResponse;


import com.funkyer.content.domain.ContentFilter;
import com.funkyer.content.domain.Vod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by liushi on 17/4/8.
 */
@Controller
public class VodServiceSpi implements com.funkyer.msp.api.content.VodService
{
    @Resource(name = "funkyer.vodService")
	private com.funkyer.content.api.VodService vodService;
	
    @RequestMapping(value="/PlayVod/{id}",method=RequestMethod.GET)
    @ResponseBody
    @Override
    public PlayVodResponse play(@PathVariable("id") String id)
    {
    	
    	PlayVodResponse response = new PlayVodResponse();

        GetVodByIdRequest request = new GetVodByIdRequest();
        request.setId(id);
        GetVodByIdResponse resp = vodService.getVodById(request);
        Vod v = resp.getVod();
		if(null != v)
        {
            response.setArtist(v.getArtist());
            response.setDuration(v.getVodType());
            response.setName(v.getDialectMap().get("cn").getName());
            response.setPlayUrl(v.getPoster());

        }
        return response;
    }

	public void setVodService(com.funkyer.content.api.VodService vodService) {
		this.vodService = vodService;
	}
}
