package com.wondertek.baiying.marketing.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.MeetingActivities;
import com.wondertek.baiying.marketing.service.MeetingActivitiesService;

/**
 * Resource to return information about the currently running Spring profiles.
 */
@RestController
@RequestMapping("/meetingActivities")
public class MeetingActivitiesController {

	@Autowired
	private MeetingActivitiesService  meetingActivitiesService;  
	
	@RequestMapping("/save")
    public MeetingActivities save(MeetingActivities meetingActivities){
		MeetingActivities Activities =  meetingActivitiesService.save(meetingActivities);
		return Activities;
    }
	
	@RequestMapping("/findOneByTitle")
    public MeetingActivities findOneByTitle(String title){
		MeetingActivities Activities = meetingActivitiesService.findOneByTitle(title);
		return Activities;
    }
	@RequestMapping("/findOneById")
    public MeetingActivities findOneById(Long id){
		MeetingActivities Activities = meetingActivitiesService.findOneById(id);
		return Activities;
    }
	@RequestMapping("/findAllPage")
    public Page<MeetingActivities> findAllPage(int page,int size,String direction,String property){
		Page<MeetingActivities> ActivitiesPage = meetingActivitiesService.findAll(page,size,direction,property);
		return ActivitiesPage;
    }
	@RequestMapping("/findAllList")
    public List<MeetingActivities> findAllList(){
		return meetingActivitiesService.findAll();
    }
}

