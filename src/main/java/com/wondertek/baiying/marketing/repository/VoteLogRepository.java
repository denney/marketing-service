package com.wondertek.baiying.marketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.VoteLog;

public interface VoteLogRepository extends MongoRepository<VoteLog, Long> {
}
