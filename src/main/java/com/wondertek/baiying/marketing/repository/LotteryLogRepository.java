package com.wondertek.baiying.marketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.LotteryLog;

public interface LotteryLogRepository extends MongoRepository<LotteryLog, String> {
	
}
