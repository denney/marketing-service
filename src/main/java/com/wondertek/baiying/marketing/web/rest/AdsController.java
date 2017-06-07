package com.wondertek.baiying.marketing.web.rest;

import com.wondertek.baiying.marketing.domain.Ads;
import com.wondertek.baiying.marketing.service.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Resource to return information about the currently running Spring profiles.
 */
@RestController
@RequestMapping("/Ads")
public class AdsController {

	@Autowired
	private AdsService adsService;

	@RequestMapping("/save")
    public String save(){
        for (int i = 0; i <100 ; i++) {
            adsService.save(new Ads(i+"id",i+"appId",i+"content",i+"createTime",i+"creatorId",i+"creatorName",i+"onlineStatus"));
        }


		return "success";
    }

	@RequestMapping("/findOneById")
    public Ads findOneByid(String id){

		return adsService.findById(id);
    }


}

