package com.wondertek.baiying.marketing.web.rest;

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
	
	@RequestMapping("/findOneById")
    public Award findOneById(long id){
		Award Activities = awardService.findOneById(id);
		return Activities;
    }
	
	
	/**
     * 分页查询
     * @param page 第几页
     * @param size 一页多少条
     * @param direction 排序方式 降序还是升序
     * @param property  按哪个属性排序
     * @return
     */
	@RequestMapping("/findAll")
    public Page<Award> findAll(int page,int size,String direction,String property){
		Page<Award> ActivitiesPage = awardService.findAll(page,size,direction,property);
		return ActivitiesPage;
    }
	
	@RequestMapping("/deleteOneById")
    public void deleteOneById(long id ){
		awardService.deleteById(id);;
    }
}
