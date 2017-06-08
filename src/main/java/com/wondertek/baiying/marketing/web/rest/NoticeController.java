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
@RequestMapping("/Ads")
public class NoticeController {

    @Autowired
    private NoticeService adsService;

    @RequestMapping("/save")
    public String save() {
        for (int i = 0; i < 100; i++) {
            adsService.save(new Notice(i + "id", i + "appId", i + "content", i + "createTime", i + "creatorId", i + "creatorName", i + "onlineStatus"));
        }


        return "success";
    }

    @RequestMapping("/findOneById")
    public Notice findOneByid(String id) {

        return adsService.findById(id);
    }

    @RequestMapping("/pagefindAll")
    public Page<Notice> pagefindAll(int pageNum, int pageSize) {
        return adsService.fingAllAds(pageNum, pageSize);

    }

}

