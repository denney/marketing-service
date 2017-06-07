package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.LotteryEvent;
import com.wondertek.baiying.marketing.repository.LotteryEventRepository;

@Service
@Transactional
public class LotteryEventService {
	
	private final Logger log = LoggerFactory.getLogger(LotteryEventService.class);
	
	private final LotteryEventRepository lotteryEventRepository;

	public LotteryEventService(LotteryEventRepository lotteryEventRepository) {
		this.lotteryEventRepository = lotteryEventRepository;
	}
	
	 /**
     * 分页查询
     * @param page 第几页
     * @param size 一页多少条
     * @param direction 排序方式 降序还是升序
     * @param property  按哪个属性排序
     * @return
     */
    public Page<LotteryEvent> findAll(int page, int size, String direction, String property) {
        Pageable pageable = new PageRequest(page, size, Sort.Direction.DESC, property);
        if(Sort.Direction.ASC.toString().equals(direction.toUpperCase())){
            pageable = new PageRequest(page, size, Sort.Direction.ASC, property);
        }
        return lotteryEventRepository.findAll(pageable);
    }

    /**
     * 新增操作
     * @param lotteryEvent 需要保存的信息
     * @return  返回保存后的信息
     */
    public LotteryEvent save (LotteryEvent lotteryEvent) {
        return lotteryEventRepository.save(lotteryEvent);
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public LotteryEvent findById (String id) {
        return lotteryEventRepository.findById(id);
    }

}
