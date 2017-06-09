package com.wondertek.baiying.marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wondertek.baiying.marketing.domain.MeetingActivities;

/**
 * Spring Data JPA repository for the MeetingActivities entity.
 */
public interface MeetingActivitiesRepository  extends JpaRepository<MeetingActivities, Long>{

	MeetingActivities findOneByTitle(String title); 
	MeetingActivities findOneById(Long id);
}

