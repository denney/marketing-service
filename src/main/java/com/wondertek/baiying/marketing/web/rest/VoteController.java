package com.wondertek.baiying.marketing.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.Vote;
import com.wondertek.baiying.marketing.service.VoteService;

@RestController
@RequestMapping("/vote")
public class VoteController {

	@Autowired
	private VoteService voteService;

	@RequestMapping("/save")
	public Vote save(Vote vote) {
		Vote saveVote = voteService.save(vote);
		return saveVote;
	}

	@RequestMapping("/findAll")
	public Page<Vote> findAll(int page, int size, String direction,
			String property) {
		Page<Vote> votePage = voteService.findAll(page, size, direction,
				property);
		return votePage;
	}

	@RequestMapping("/findOneByTitle")
	public Vote findOneById(String id) {
		Vote voteTitle = voteService.findOneByTitle(Long.parseLong(id));
		return voteTitle;
	}

	@RequestMapping("/delete")
	public void deleteById(String id) {
		voteService.deleteById(Long.parseLong(id));
	}

}