package com.wondertek.baiying.marketing.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.MeetingActivities;
import com.wondertek.baiying.marketing.domain.ModelContentRule;
import com.wondertek.baiying.marketing.repository.MeetingActivitiesRepository;
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
    public ResponseEntity<MeetingActivities> save(MeetingActivities meetingActivities){
		MeetingActivities Activities =  meetingActivitiesService.save(meetingActivities);
		return new ResponseEntity<>(Activities,null,HttpStatus.OK);
    }
	
	@RequestMapping("/findOneByTitle")
	@ResponseBody
    public MeetingActivities findOneByTitle(String title){
		MeetingActivities Activities = meetingActivitiesService.findOneByTitle(title);
		return Activities;
    }
	@RequestMapping("/findAll")
	@ResponseBody
    public ResponseEntity<Page<MeetingActivities>> findAll(Pageable pageable){
		Page<MeetingActivities> ActivitiesPage = meetingActivitiesService.findAll(pageable);
		return new ResponseEntity<>(ActivitiesPage,null,HttpStatus.OK);
    }
}
