package com.wondertek.baiying.marketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.MeetingActivities;

/**
 * Spring Data JPA repository for the MeetingActivities entity.
 */
public interface MeetingActivitiesRepository  extends MongoRepository<MeetingActivities, String>{

	MeetingActivities findOneByTitle(String title);   
}

