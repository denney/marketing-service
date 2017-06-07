package com.wondertek.baiying.marketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.Award;

public interface AwardRepository extends MongoRepository<Award, String> {
	
	Award findOneByName(String name);

}
