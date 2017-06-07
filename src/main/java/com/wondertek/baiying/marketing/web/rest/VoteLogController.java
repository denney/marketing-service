package com.wondertek.baiying.marketing.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.VoteLog;
import com.wondertek.baiying.marketing.service.VoteLogService;

@RestController
@RequestMapping("/voteLog")
public class VoteLogController {
	
	@Autowired
	private VoteLogService voteLogService;
	
	@RequestMapping("/save")
    public VoteLog save(VoteLog voteLog){
		VoteLog log=  voteLogService.save(voteLog);
		return log;
    }
}
