package com.wondertek.baiying.marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wondertek.baiying.marketing.domain.LotteryEvent;

public interface LotteryEventRepository extends JpaRepository<LotteryEvent, String> {
	
	 LotteryEvent findById (String id);
}
