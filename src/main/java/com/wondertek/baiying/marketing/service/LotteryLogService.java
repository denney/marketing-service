package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.repository.LotteryLogRepository;

@Service
@Transactional
public class LotteryLogService {
	
	private final Logger log = LoggerFactory.getLogger(LotteryLogService.class);
	
	private final LotteryLogRepository lotteryLogRepository;
	
	public LotteryLogService(LotteryLogRepository lotteryLogRepository) {
		this.lotteryLogRepository = lotteryLogRepository;
	}

}
