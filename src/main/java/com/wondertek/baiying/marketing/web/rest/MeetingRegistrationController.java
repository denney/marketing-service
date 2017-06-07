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
import com.wondertek.baiying.marketing.domain.MeetingRegistration;
import com.wondertek.baiying.marketing.domain.ModelContentRule;
import com.wondertek.baiying.marketing.service.MeetingActivitiesService;
import com.wondertek.baiying.marketing.service.MeetingRegistrationService;

/**
 * Resource to return information about the currently running Spring profiles.
 */
@RestController
@RequestMapping("/meetingRegistration")
public class MeetingRegistrationController {

	@Autowired
    private MeetingRegistrationService meetingRegistrationService;
	@Autowired
	private MeetingActivitiesService meetingActivitiesService;
	@RequestMapping("/save")
	@ResponseBody
    public ResponseEntity<MeetingRegistration> save(MeetingRegistration meetingRegistration){
		MeetingRegistration registration =  meetingRegistrationService.save(meetingRegistration);
		return new ResponseEntity<>(registration,null,HttpStatus.OK);
    }
	
	@RequestMapping("/findByUserIdAndActivityId")
	@ResponseBody
    public ResponseEntity<MeetingRegistration> findByUserIdAndActivityId(String userId,String activityId){
		MeetingRegistration registration = meetingRegistrationService.findByUserIdAndActivityId(userId, activityId);
		return new ResponseEntity<>(registration,null,HttpStatus.OK);
    }
	
	@RequestMapping("/findAll")
	@ResponseBody
	public ResponseEntity<Page<MeetingRegistration>> findAll(int page,int size,String direction,String property){
		Page<MeetingRegistration> meetingRegistrationPage = meetingRegistrationService.findAll(page,size,direction,property);
		return new ResponseEntity<>(meetingRegistrationPage,null,HttpStatus.OK);
	}
	
	@RequestMapping("/findByActivityId")
	@ResponseBody
	public List<MeetingRegistration> findByActivityId(String activityId){
 	   return meetingRegistrationService.findByActivityId(activityId);
    }
	
	@RequestMapping("/findByUserId")
	@ResponseBody
    public List<MeetingRegistration> findByUserId(String userId){
    	return meetingRegistrationService.findByUserId(userId);
    }
}
