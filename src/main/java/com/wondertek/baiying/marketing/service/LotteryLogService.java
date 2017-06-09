package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.LotteryLog;
import com.wondertek.baiying.marketing.repository.LotteryLogRepository;

@Service
@Transactional
public class LotteryLogService {
	
	@SuppressWarnings("unused")
	private final Logger log = LoggerFactory.getLogger(LotteryLogService.class);
	
	private final LotteryLogRepository lotteryLogRepository;
	
	public LotteryLogService(LotteryLogRepository lotteryLogRepository) {
		this.lotteryLogRepository = lotteryLogRepository;
	}
	
	public LotteryLog save(LotteryLog lotteryLog){ 
	    return lotteryLogRepository.save(lotteryLog);
	}
	
	public LotteryLog findOneById(String id) {
	    return lotteryLogRepository.findOne(id);
	}
	
	 public Page<LotteryLog> findAll(int page,int size,String direction,String property) {
	    Pageable pageable = null;
	    if("asc".equals(direction)){
	    	pageable = new PageRequest(page, size, Direction.ASC, property);
	    }else{
	    	pageable = new PageRequest(page, size, Direction.DESC, property);
	    }
	    return lotteryLogRepository.findAll( pageable);
	 }

}
