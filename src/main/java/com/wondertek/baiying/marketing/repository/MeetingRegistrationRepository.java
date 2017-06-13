package com.wondertek.baiying.marketing.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.MeetingRegistration;

/**
 * Spring Data JPA repository for the ModelContentRule entity.
 */
public interface MeetingRegistrationRepository extends MongoRepository<MeetingRegistration, String> {

	List<MeetingRegistration> findAllByActivityId(String activityId);
	
	MeetingRegistration findOneByUserIdAndActivityId(String userId,String activityId);
	
	List<MeetingRegistration> findAllByUserId(String userId);
}
