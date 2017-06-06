package com.wondertek.baiying.marketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.Vote;

public interface VoteRepository extends MongoRepository<Vote, Long> {
	public Vote findByTitle(String title);//根据标题查投票活动
	
}
