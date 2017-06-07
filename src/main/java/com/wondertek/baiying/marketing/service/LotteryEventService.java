package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.repository.LotteryEventRepository;

@Service
@Transactional
public class LotteryEventService {
	
	private final Logger log = LoggerFactory.getLogger(LotteryEventService.class);
	
	private final LotteryEventRepository lotteryEventRepository;

	public LotteryEventService(LotteryEventRepository lotteryEventRepository) {
		this.lotteryEventRepository = lotteryEventRepository;
	}
	
	

}
