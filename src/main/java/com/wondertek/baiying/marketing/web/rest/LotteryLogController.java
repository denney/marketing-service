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
    public LotteryLog findOneById(Long id){
		LotteryLog log	 = lotteryLogService.findById(id);
		return log;
    }
	@RequestMapping("/findOneByUserId")
    public String findOneByUserId(Long userId){
		LotteryLog log	 = lotteryLogService.findOneByUserId(userId);
		if("0".equals(log.getGetStatus())){
			log.setGetStatus("1");
			lotteryLogService.save(log);
			return "success";
		}else{
			return "failure";
		}
		
    }
	
	@RequestMapping("/findAll")
    public Page<LotteryLog> findAll(int page,int size,String direction,String property){
		Page<LotteryLog> logsPage = lotteryLogService.findAll(page,size,direction,property);
		return logsPage;
    }
}
