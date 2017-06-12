package com.wondertek.baiying.marketing.repository;

import java.util.List;

import com.wondertek.baiying.marketing.domain.Notice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoticeRepository extends MongoRepository<Notice, Long> {

	List<Notice> findByAppId(String appId);

}
