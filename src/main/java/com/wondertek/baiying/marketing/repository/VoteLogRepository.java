package com.wondertek.baiying.marketing.repository;

import com.wondertek.baiying.marketing.domain.VoteLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public abstract interface  VoteLogRepository extends JpaRepository<VoteLog, Long>,JpaSpecificationExecutor<VoteLog> {
}
