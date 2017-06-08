package com.wondertek.baiying.marketing.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.Award;
import com.wondertek.baiying.marketing.service.AwardService;

@RestController
@RequestMapping("/award")
public class AwardController {
	
	@Autowired
	private AwardService awardService;
	
	@RequestMapping("/save")
    public Award save(Award award){
		Award Activities =  awardService.save(award);
		return Activities;
    }
	
	@RequestMapping("/findOneByName")
    public Award findOneByName(String name){
		Award Activities = awardService.findOneByName(name);
		return Activities;
    }
	
	@RequestMapping("/findOneById")
    public Award findOneById(String id){
		Award Activities = awardService.findOneById(id);
		return Activities;
    }
	
	@RequestMapping("/findAll")
    public Page<Award> findAll(int page,int size,String direction,String property){
		Page<Award> ActivitiesPage = awardService.findAll(page,size,direction,property);
		return ActivitiesPage;
    }

	@RequestMapping("/findAllList")
    public List<Award> findAllList(){
		return awardService.findAll();
    }
	
	@RequestMapping("/deleteOneById")
    public void deleteOneById(String id ){
		awardService.deleteById(id);;
    }
}
