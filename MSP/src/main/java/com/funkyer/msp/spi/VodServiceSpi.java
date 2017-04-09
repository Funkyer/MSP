package com.funkyer.msp.spi;

import java.util.List;

import javax.annotation.Resource;

import com.funkyer.jdbc.domain.Vod;
import com.funkyer.msp.api.content.VodService;
import com.funkyer.msp.api.dto.PlayVodRequest;
import com.funkyer.msp.api.dto.PlayVodResponse;


import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
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
	@Resource(name="jdbc.vodService")
	private com.funkyer.jdbc.service.VodService vodManage;
	
    @RequestMapping(value="/PlayVod/{id}",method=RequestMethod.GET)
    @ResponseBody
    @Override
    public PlayVodResponse play(@PathVariable("id") String id)
    {
    	
    	PlayVodResponse response = new PlayVodResponse();
    	Vod vod = new Vod();
    	vod.setId(id);
    	List<Object> vs = vodManage.query(vod);
    	if(CollectionUtils.isEmpty(vs))
    	{
    		return response;
    	}
        
    	Vod v = (Vod)vs.get(0);
        response.setArtist(v.getArtist());
        response.setDuration(v.getVodType());
        response.setName(v.getName());
        response.setPlayUrl(v.getPoster());
        return response;
    }

	public void setVodManage(com.funkyer.jdbc.service.VodService vodManage) {
		this.vodManage = vodManage;
	}

	public com.funkyer.jdbc.service.VodService getVodManage() {
		return vodManage;
	}
}
