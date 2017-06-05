package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.repository.AwardRepository;

@Service
@Transactional
public class AwardService {
	
	private final Logger log = LoggerFactory.getLogger(AwardService.class);
	
	private final AwardRepository awardRepository;
	
	public AwardService(AwardRepository awardRepository) {
		this.awardRepository = awardRepository;
	}

}
