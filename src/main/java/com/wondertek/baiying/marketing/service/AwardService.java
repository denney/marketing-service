package com.wondertek.baiying.marketing.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.Award;
import com.wondertek.baiying.marketing.repository.AwardRepository;

@Service
@Transactional
public class AwardService {
	
	private final Logger log = LoggerFactory.getLogger(AwardService.class);
	
	private final AwardRepository awardRepository;
	
	public AwardService(AwardRepository awardRepository) {
		this.awardRepository = awardRepository;
	}
	
	public Award save(Award award){ 
    	return awardRepository.save( award);
    }
    public Page<Award> findAll(int page,int size,String direction,String property) {
    	Pageable pageable = null;
    	if("asc".equals(direction)){
    		pageable = new PageRequest(page, size, Direction.ASC, property);
    	}else{
    		pageable = new PageRequest(page, size, Direction.DESC, property);
    	}
    	return awardRepository.findAll( pageable);
    }

    public Award findOneById(long id) {
    	return awardRepository.findOneById(id);
    }
    
    public List<Award> findAll() {
    	return awardRepository.findAll();
    }

    public void deleteById(long id) {
    	awardRepository.deleteById(id);;
    }

}
