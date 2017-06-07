package com.wondertek.baiying.marketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.LotteryEvent;

public interface LotteryEventRepository extends MongoRepository<LotteryEvent, String> {
	
	 LotteryEvent findById (String id);
}
