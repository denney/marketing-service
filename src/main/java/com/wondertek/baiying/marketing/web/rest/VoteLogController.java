package com.wondertek.baiying.marketing.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
	
	@RequestMapping("/findAll")
    public Page<VoteLog> findAll(int page,int size,String direction,String property){
		Page<VoteLog> pageLog=  voteLogService.findAll(page, size, direction, property);
		return pageLog;
    }
}
