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
import com.wondertek.baiying.marketing.repository.MeetingActivitiesRepository;
/**
 * Service class for managing users.
 */
@Service
@Transactional
public class MeetingActivitiesService {
	private final Logger log = LoggerFactory.getLogger(MeetingActivitiesService.class); 

    private final MeetingActivitiesRepository meetingActivitiesRepository;
    public MeetingActivitiesService(MeetingActivitiesRepository meetingActivitiesRepository){
    	this.meetingActivitiesRepository = meetingActivitiesRepository; 
    }
    public MeetingActivities save(MeetingActivities meetingActivities){ 
    	return meetingActivitiesRepository.save( meetingActivities);
    }
    public Page<MeetingActivities> findAll(int page,int size,String direction,String property) {
    	Pageable pageable = null;
    	if("asc".equals(direction)){
    		pageable = new PageRequest(page, size, Direction.ASC, property);
    	}else{
    		pageable = new PageRequest(page, size, Direction.DESC, property);
    	}
    	return meetingActivitiesRepository.findAll( pageable);
    }
    public MeetingActivities findOneByTitle(String title) {
    	return meetingActivitiesRepository.findOneByTitle(title);
    }
    public MeetingActivities findOneById(Long id) {
    	return meetingActivitiesRepository.findOneById(id);
    }
    public List<MeetingActivities> findAll() {
    	return meetingActivitiesRepository.findAll();
    }
}

