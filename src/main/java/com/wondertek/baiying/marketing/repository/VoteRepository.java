package com.wondertek.baiying.marketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.Vote;

public interface VoteRepository extends MongoRepository<Vote, String> {

	public Vote findOneByTitle(String title);
	
}
