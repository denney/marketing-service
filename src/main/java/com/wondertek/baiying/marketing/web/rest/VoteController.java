package com.wondertek.baiying.marketing.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.Vote;
import com.wondertek.baiying.marketing.repository.VoteRepository;
import com.wondertek.baiying.marketing.service.VoteService;

@RestController
@RequestMapping("/vote")
public class VoteController {
	
	@Autowired
	private VoteService voteService;
	@Autowired
	private VoteRepository voteRespository;
	
	@RequestMapping("/save")
    public Vote save(Vote vote){
		return voteService.save(vote);
    }
	
	@RequestMapping("/findAll")
	public Page<Vote> findAll(int page,int size,String direction,String property){
		return voteService.findAll(page, size, direction, property);
		
	}
	
	@RequestMapping("/findByTitle")
	public Vote findByTitle(String title){
		return voteService.findByTitle(title);
	}
	
	@RequestMapping("/delete")
	public void deleteById(Long id){
		voteService.deleteById(id);
	}
	
}
