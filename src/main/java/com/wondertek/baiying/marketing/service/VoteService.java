package com.wondertek.baiying.marketing.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.Vote;
import com.wondertek.baiying.marketing.repository.VoteRepository;

@Service
@Transactional
public class VoteService {
	private final VoteRepository voteRepository;

	public VoteService(VoteRepository voteRepository) {
		this.voteRepository = voteRepository;
	}

	/**
	 * 保存vote信息
	 */
	public Vote save(Vote vote) {
		return voteRepository.save(vote);
	}

	
	/**分页查询所有投票
	 * @param page
	 * @param size
	 * @param direction
	 * @param property
	 * @return Page
	 */
	public Page<Vote> findAll (int page,int size,String direction,String property){
		Pageable pageable = new PageRequest(page, size, Direction.DESC, property);
		if("asc".equals(direction)){
    		pageable = new PageRequest(page, size, Direction.ASC, property);
    	}
    	return voteRepository.findAll( pageable);
		
	}
	
	/**根据标题查投票活动
	 * @param title
	 * @return
	 */
	public Vote findByTitle(String title){
		return voteRepository.findByTitle(title);
		
	}
	
	/**根据id删除投票活动
	 * @param id
	 */
	public void deleteById(Long id) {
		voteRepository.delete(id);
	}
	
	
}
