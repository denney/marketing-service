package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.Notice;
import com.wondertek.baiying.marketing.repository.NoticeRepository;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class NoticeService {

    private final Logger log = LoggerFactory.getLogger(NoticeService.class);

    private final NoticeRepository noticeRepository;


    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    public Notice save(Notice notice) {
        return noticeRepository.save(notice);
    }

    public Notice findById(Long id) {
        return noticeRepository.findOne(id);
    }


    public Page<Notice> findAll (int page,int size,String direction,String property){
		Pageable pageable = null;
    	if("asc".equals(direction)){
    		pageable = new PageRequest(page, size, Direction.ASC, property);
    	}else{
    		pageable = new PageRequest(page, size, Direction.DESC, property);
    	}
    	return noticeRepository.findAll( pageable);

	}

	/**根据id删除投票活动
	 * @param id
	 */
	public void deleteById(Long id) {
		noticeRepository.delete(id);
	}


}
