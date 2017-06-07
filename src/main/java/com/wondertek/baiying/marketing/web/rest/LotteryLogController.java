package com.wondertek.baiying.marketing.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.LotteryLog;

import com.wondertek.baiying.marketing.service.LotteryLogService;

@RestController
@RequestMapping("/lotteryLog")
public class LotteryLogController {
	
	@Autowired
	private LotteryLogService lotteryLogService;
	@RequestMapping("/save")
    public LotteryLog save(LotteryLog lotteryLog){
		LotteryLog log =  lotteryLogService.save(lotteryLog);
		return log;
    }
	
	@RequestMapping("/findOneById")
    public LotteryLog findOneById(String id){
		LotteryLog log	 = lotteryLogService.findOneById(id);
		return log;
    }
	
	@RequestMapping("/findAll")
    public Page<LotteryLog> findAll(int page,int size,String direction,String property){
		Page<LotteryLog> logsPage = lotteryLogService.findAll(page,size,direction,property);
		return logsPage;
    }
}
