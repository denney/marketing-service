package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wondertek.baiying.marketing.repository.LotteryLogRepository;

public class LotteryLogService {
	
	public final Logger log = LoggerFactory.getLogger(LotteryLogService.class);
	
	public final LotteryLogRepository lotteryLogRepository;
	
	public LotteryLogService(LotteryLogRepository lotteryLogRepository) {
		this.lotteryLogRepository = lotteryLogRepository;
	}

}
