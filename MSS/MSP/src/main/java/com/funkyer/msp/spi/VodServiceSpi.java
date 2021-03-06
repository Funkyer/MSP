package com.funkyer.msp.spi;

import com.funkyer.mss.content.api.dto.GetVodByIdRequest;
import com.funkyer.mss.content.api.dto.GetVodByIdResponse;
import com.funkyer.msp.api.dto.PlayVodResponse;


import com.funkyer.mss.content.domain.Vod;
import org.apache.log4j.Logger;
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
    private static Logger logger = Logger.getLogger(VodServiceSpi.class);

    @Resource(name = "funkyer.vodService")
	private com.funkyer.mss.content.api.VodService vodService;
	
    @RequestMapping(value="/PlayVod/{id}",method=RequestMethod.GET)
    @ResponseBody
    @Override
    public PlayVodResponse play(@PathVariable("id") String id)
    {
        if(logger.isDebugEnabled())
        {
            logger.debug("play id="+id);
        }

        logger.info("play------------");
    	PlayVodResponse response = new PlayVodResponse();

        GetVodByIdRequest request = new GetVodByIdRequest();
        request.setId(id);
        GetVodByIdResponse resp = vodService.getVodById(request);
        Vod v = resp.getVod();
        response.setResult(resp.getResult());
		if(null != v)
        {
            response.setArtist(v.getArtist());
            response.setDuration(v.getVodType());
            response.setName(v.getDialectMap().get("cn").getName());
            response.setPlayUrl(v.getPoster());

        }
        return response;
    }

	public void setVodService(com.funkyer.mss.content.api.VodService vodService) {
		this.vodService = vodService;
	}
}
