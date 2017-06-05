package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wondertek.baiying.marketing.repository.AwardRepository;


public class AwardService {
	
	public final Logger log = LoggerFactory.getLogger(AwardService.class);
	
	public final AwardRepository awardRepository;
	
	public AwardService(AwardRepository awardRepository) {
		this.awardRepository = awardRepository;
	}

}
