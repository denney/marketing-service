package com.wondertek.baiying.marketing.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.Vote;
import com.wondertek.baiying.marketing.domain.VoteLog;
import com.wondertek.baiying.marketing.repository.VoteLogRepository;

@Service
@Transactional
public class VoteLogService {
	private final VoteLogRepository voteLogRepository;

	public VoteLogService(VoteLogRepository voteLogRepository) {
		this.voteLogRepository = voteLogRepository;
	}
	
	/**保存VoteLog信息 */
	public VoteLog save(VoteLog voteLog) {
		return voteLogRepository.save(voteLog);
	}

	/** 分页查询投票日志信息*/
	public Page<VoteLog> findAll (int page,int size,String direction,String property){
		Pageable pageable = null;
    	if("asc".equals(direction)){
    		pageable = new PageRequest(page, size, Direction.ASC, property);
    	}else{
    		pageable = new PageRequest(page, size, Direction.DESC, property);
    	}
    	return voteLogRepository.findAll( pageable);
	}
	
}
