package com.wondertek.baiying.marketing.service;

import com.wondertek.baiying.marketing.domain.Ads;
import com.wondertek.baiying.marketing.repository.AdsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class AdsService {

    private final Logger log = LoggerFactory.getLogger(AdsService.class);

    private final AdsRepository adsRepository;

    public AdsService(AdsRepository adsRepository) {
        this.adsRepository = adsRepository;
    }

    public Ads save(Ads ads){
    	return adsRepository.save(ads);
    }

    public Ads findById(String id){
 	   return adsRepository.findOne(id);
     }







}
