package com.wondertek.baiying.marketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wondertek.baiying.marketing.domain.ModelContentRule;

/**
 * Spring Data JPA repository for the ModelContentRule entity.
 */
public interface ModelContentRuleRepository extends MongoRepository<ModelContentRule, String> {

	ModelContentRule findOneByNodeId(String nodeId);
	
	ModelContentRule findOneByNodeIdAndModelId(String nodeId,String modelId);
}
