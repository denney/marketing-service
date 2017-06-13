package com.wondertek.baiying.marketing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wondertek.baiying.marketing.domain.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long> {

	List<Notice> findByAppId(String appId);

}
