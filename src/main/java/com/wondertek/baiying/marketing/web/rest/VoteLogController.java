package com.wondertek.baiying.marketing.web.rest;

import com.wondertek.baiying.marketing.domain.VoteLog;
import com.wondertek.baiying.marketing.service.VoteLogService;
import com.wondertek.baiying.marketing.web.rest.util.getSysTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/voteLog")
public class VoteLogController {

	@Autowired
	private VoteLogService voteLogService;

	@RequestMapping("/save")
    public VoteLog save(HttpServletRequest request){
        String voteId= request.getParameter("voteId");
        String userName= request.getParameter("userName");
        String userId= request.getParameter("userId");
        String option= request.getParameter("option");



		VoteLog log=  voteLogService.save(new VoteLog( voteId,  userName,  userId,  option, getSysTime.getTimestamp()));
		return new VoteLog();
    }

	@RequestMapping("/findAll")
    public Page<VoteLog> findAll(String pageNum,String pageSize){
        Page<VoteLog> pageLog=  voteLogService.findAll(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        return pageLog;
    }
    public String findVoteResult(){



        return   "";
    }


}
