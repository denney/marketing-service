package com.wondertek.baiying.marketing.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.MeetingActivities;
import com.wondertek.baiying.marketing.domain.MeetingRegistration;
import com.wondertek.baiying.marketing.repository.MeetingActivitiesRepository;
import com.wondertek.baiying.marketing.repository.MeetingRegistrationRepository;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class MeetingRegistrationService {

    private final Logger log = LoggerFactory.getLogger(MeetingRegistrationService.class);

    private final MeetingRegistrationRepository meetingRegistrationRepository;
    
    private final MeetingActivitiesRepository meetingActivitiesRepository;
    
    public MeetingRegistrationService(MeetingRegistrationRepository meetingRegistrationRepository, MeetingActivitiesRepository meetingActivitiesRepository) {
        this.meetingRegistrationRepository = meetingRegistrationRepository;
        this.meetingActivitiesRepository=meetingActivitiesRepository;
    }

    public MeetingRegistration save(MeetingRegistration meetingRegistration){
    	MeetingActivities meetingActivities= meetingActivitiesRepository.findOne(Long.valueOf(meetingRegistration.getActivityId()));
    	if(meetingActivities!=null){
    		int remaining=meetingActivities.getRemaining();
    		int max=meetingActivities.getAppliantsMax();
    		if(remaining<max){
    			remaining=remaining++;
    			meetingActivities.setRemaining(remaining);
    			meetingActivitiesRepository.save(meetingActivities);
    		}else{
    			return null;
    		}
    	}
		return meetingRegistrationRepository.save(meetingRegistration);
    }
    
    public List<MeetingRegistration> findByActivityId(String activityId){
 	   return meetingRegistrationRepository.findAllByActivityId(activityId);
     }
    
    public Page<MeetingRegistration> findAll(int page,int size,String direction,String property){
    	Pageable pageable = new PageRequest(page, size, Direction.DESC, property);
    	if("asc".equals(direction)){
    		pageable = new PageRequest(page, size, Direction.ASC, property);
    	}
    	return meetingRegistrationRepository.findAll(pageable);
    }
    
    public List<MeetingRegistration> findByUserId(String userId){
    	return meetingRegistrationRepository.findAllByUserId(userId);
    }

    public MeetingRegistration findByUserIdAndActivityId(String userId,String activityId){
	   return meetingRegistrationRepository.findOneByUserIdAndActivityId(userId, activityId);
    }


    
}
