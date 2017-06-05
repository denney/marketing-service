package com.wondertek.baiying.marketing.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.service.LotteryLogService;

@RestController
@RequestMapping("/lotteryLog")
public class LotteryLogController {
	
	@Autowired
	private LotteryLogService lotteryLogService;

}
