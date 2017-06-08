package com.wondertek.baiying.marketing.service;

import com.wondertek.baiying.marketing.domain.Notice;
import com.wondertek.baiying.marketing.repository.NoticeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class NoticeService {

    private final Logger log = LoggerFactory.getLogger(NoticeService.class);

    private final NoticeRepository adsRepository;


    public NoticeService(NoticeRepository adsRepository) {
        this.adsRepository = adsRepository;
    }

    //保存更新操作
    public Notice save(Notice ads) {
        return adsRepository.save(ads);
    }

    //根据id查一条记录
    public Notice findById(String id) {
        return adsRepository.findOne(id);
    }


    //分页查询公告list
    public Page<Notice> fingAllAds(int pageNum, int pageSize) {

        Pageable pageable = new PageRequest(pageNum, pageSize);
        return adsRepository.findAll(pageable);

    }


}
