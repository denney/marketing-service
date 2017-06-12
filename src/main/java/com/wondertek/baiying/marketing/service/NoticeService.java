package com.wondertek.baiying.marketing.service;

import java.util.List;

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

	/**
	 * 新增
	 * 
	 * @param notice
	 * @return
	 */
	public Notice save(Notice notice) {
		return noticeRepository.save(notice);
	}

	/**
	 * 根据id查找一个公告
	 * 
	 * @param id
	 * @return
	 */
	public Notice findOneById(Long id) {
		return noticeRepository.findOne(id);
	}

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param size
	 * @param direction
	 * @param property
	 * @return
	 */
	public Page<Notice> findAllByPaging(int page, int size, String direction,
			String property) {
		Pageable pageable = null;
		if ("asc".equals(direction)) {
			pageable = new PageRequest(page, size, Direction.ASC, property);
		} else {
			pageable = new PageRequest(page, size, Direction.DESC, property);
		}
		return noticeRepository.findAll(pageable);

	}

	/**
	 * 根据id删除公告
	 * 
	 * @param id
	 */
	public void deleteById(Long id) {
		noticeRepository.delete(id);
	}

	/**
	 * 根据所属的appid查询公告
	 * 
	 * @param appId
	 * @return
	 */
	public List<Notice> findByAppId(String appId) {
		List<Notice> listOfAppId = null;
		if (appId != null) {
			listOfAppId =  noticeRepository.findByAppId(appId);
		}
		return listOfAppId;
	}

}
