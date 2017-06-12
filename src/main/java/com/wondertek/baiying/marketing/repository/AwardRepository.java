package com.wondertek.baiying.marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wondertek.baiying.marketing.domain.Award;

public interface AwardRepository extends JpaRepository<Award, String> {
	
	Award findOneByName(String name);
	
	Award findOneById(String id);

}
