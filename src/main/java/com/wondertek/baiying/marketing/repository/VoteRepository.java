package com.wondertek.baiying.marketing.repository;

import com.wondertek.baiying.marketing.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VoteRepository extends JpaRepository<Vote, Long>,JpaSpecificationExecutor<Vote> {



}
