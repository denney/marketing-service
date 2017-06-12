package com.wondertek.baiying.marketing.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wondertek.baiying.marketing.domain.VoteLog;

public abstract interface  VoteLogRepository extends JpaRepository<VoteLog, Long> {
	
	Page<VoteLog> findAllByVoteId(Long voteId,Pageable pageable);
	
	@Query("select v.options,count(*) as count from VoteLog v where v.voteId=:voteId group by v.options")
	List<Object[]> findCount(@Param("voteId") Long voteId);
}
