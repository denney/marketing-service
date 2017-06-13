package com.wondertek.baiying.marketing.web.rest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		voteLog.setCreateTime(new Date());
		VoteLog vote=  voteLogService.save(voteLog);
		return vote;
    }

	@RequestMapping("/findPage")
    public List<VoteLog> findPage(int page,int size,Long voteId){
		List<VoteLog> pageLog=  voteLogService.findPage(page, size, voteId);
        return pageLog;
    }
	
	@RequestMapping("/findCount")
	public Map<String, Object> findCount(Long voteId){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("resCode", "0000");
		map.put("resMessage", "success");
		List<Object[]> optionCount=voteLogService.findCount(voteId);
		Map<Object, Object> option=new HashMap<Object, Object>();
		for (Object[] objects : optionCount) {
			option.put(objects[0], objects[1]);
		}
		map.put("options", option);
		return map;
	}

}
