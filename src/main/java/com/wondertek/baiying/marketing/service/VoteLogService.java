package com.wondertek.baiying.marketing.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.VoteLog;
import com.wondertek.baiying.marketing.repository.VoteLogRepository;

@Service
@Transactional
public class VoteLogService {

	private final VoteLogRepository voteLogRepository;

	public VoteLogService(VoteLogRepository voteLogRepository) {
		this.voteLogRepository = voteLogRepository;
	}

	public VoteLog save(VoteLog voteLog) {
		return voteLogRepository.save(voteLog);
	}

	public List<VoteLog> findPage (int page,int size,Long voteId){
		Pageable pageable = new PageRequest(page, size);
		Page<VoteLog> pageVoteLogs=voteLogRepository.findAllByVoteId(voteId, pageable);
    	return pageVoteLogs.getContent();
	}

	public List<Object[]> findCount(Long voteId){
		List<Object[]> objLogs=voteLogRepository.findCount(voteId);
		return objLogs;
	}
}
