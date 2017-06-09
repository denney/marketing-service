package com.wondertek.baiying.marketing.service;

import com.wondertek.baiying.marketing.domain.VoteLog;
import com.wondertek.baiying.marketing.repository.VoteLogRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public Page<VoteLog> findAll (int page,int size){
		Pageable pageable = new PageRequest(page, size);

    	return voteLogRepository.findAll( pageable);
	}

}
