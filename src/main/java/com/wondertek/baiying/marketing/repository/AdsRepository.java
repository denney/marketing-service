package com.wondertek.baiying.marketing.repository;

import com.wondertek.baiying.marketing.domain.Ads;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdsRepository extends MongoRepository<Ads, String> {

}
