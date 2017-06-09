package com.wondertek.baiying.marketing.web.rest;

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

    @RequestMapping("/save")
    public Notice save(Notice notice) {
        return noticeService.save(notice);
    }

    @RequestMapping("/findOneById")
    public Notice findOneByid(Long id) {
    	Notice resultOfId = noticeService.findById(id);
        return resultOfId;
    }

    @RequestMapping("/pagefindAll")
    public Page<Notice> pagefindAll(int page, int size, String direction,
			String property) {
    	Page<Notice> resultOfPage=noticeService.findAll(page, size, direction,
				property);
        return resultOfPage;
    }

    @RequestMapping("/delete")
	public void deleteById(Long id) {
		noticeService.deleteById(id);
	}
}

