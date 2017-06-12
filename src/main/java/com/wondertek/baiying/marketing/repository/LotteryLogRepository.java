package com.wondertek.baiying.marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wondertek.baiying.marketing.domain.LotteryLog;

public interface LotteryLogRepository extends JpaRepository<LotteryLog, String> {
	LotteryLog findOneById(String id);
	
	LotteryLog findOneByUserId(String userId);
}
