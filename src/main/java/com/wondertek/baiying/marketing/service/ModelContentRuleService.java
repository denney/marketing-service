package com.wondertek.baiying.marketing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.ModelContentRule;
import com.wondertek.baiying.marketing.repository.ModelContentRuleRepository;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class ModelContentRuleService {

    private final Logger log = LoggerFactory.getLogger(ModelContentRuleService.class);

    private final ModelContentRuleRepository modelContentRuleRepository;

    public ModelContentRuleService(ModelContentRuleRepository modelContentRuleRepository) {
        this.modelContentRuleRepository = modelContentRuleRepository;
    }

    public ModelContentRule save(ModelContentRule modelContentRule){
    	return modelContentRuleRepository.save(modelContentRule);
    }
    
    public ModelContentRule findByNodeId(String nodeId){
 	   return modelContentRuleRepository.findOneByNodeId(nodeId);
     }
    

    public ModelContentRule findByNodeIdAndModelId(String nodeId,String modelId){
	   return modelContentRuleRepository.findOneByNodeIdAndModelId(nodeId, modelId);
    }

   

    
}
