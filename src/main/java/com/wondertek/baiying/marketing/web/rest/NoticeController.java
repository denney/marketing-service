package com.wondertek.baiying.marketing.web.rest;

import java.util.List;

import com.wondertek.baiying.marketing.domain.Notice;
import com.wondertek.baiying.marketing.service.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Resource to return information about the currently running Spring profiles.
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	/**
	 * 新增
	 * 
	 * @param notice
	 * @return
	 */
	@RequestMapping("/save")
	public Notice save(Notice notice) {
		return noticeService.save(notice);
	}

	/**
	 * 根据id查找一个公告
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOneById")
	public Notice findOneByid(Long id) {
		Notice resultOfId = noticeService.findOneById(id);
		return resultOfId;
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
	@RequestMapping("/findAllByPaging")
	public Page<Notice> findAllByPaging(int page, int size, String direction,
			String property) {
		Page<Notice> resultOfPage = noticeService.findAllByPaging(page, size,
				direction, property);
		return resultOfPage;
	}

	/**
	 * 根据id删除公告
	 * 
	 * @param id
	 */
	@RequestMapping("/delete")
	public void deleteById(Long id) {
		noticeService.deleteById(id);
	}

	/**
	 * 根据所属的appid查询公告
	 * 
	 * @param appId
	 * @return
	 */
	@RequestMapping("/findByAppId")
	public List<Notice> findByAppId(String appId) {
		List<Notice> listsOfAppId = noticeService.findByAppId(appId);
		return listsOfAppId;
	}

	/**
	 * 发布公告
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/publishNotice")
	public String publishNotice(Long id) {
		Notice notice = noticeService.findOneById(id);
		if (notice.getOnlineStatus().equals("0")) {
			notice.setOnlineStatus("1");
			noticeService.save(notice);
			return "success";
		} else {
			return "failure";
		}

	}
}
