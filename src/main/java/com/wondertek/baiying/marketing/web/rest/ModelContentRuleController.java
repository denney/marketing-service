package com.wondertek.baiying.marketing.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.ModelContentRule;
import com.wondertek.baiying.marketing.service.ModelContentRuleService;

/**
 * Resource to return information about the currently running Spring profiles.
 */
@RestController
@RequestMapping("/modelContentRule")
public class ModelContentRuleController {

	@Autowired
    private ModelContentRuleService modelContentRuleService;

	@RequestMapping("/save")
	@ResponseBody
    public ResponseEntity<ModelContentRule> save(ModelContentRule modelContentRule){
		ModelContentRule contentRule =  modelContentRuleService.save(modelContentRule);
		return new ResponseEntity<>(contentRule,null,HttpStatus.OK);
    }
	
	@RequestMapping("/findByNodeIdAndModelId")
	@ResponseBody
    public ResponseEntity<ModelContentRule> findByNodeIdAndModelId(String nodeId,String modelId){
		ModelContentRule contentRule = modelContentRuleService.findByNodeIdAndModelId(nodeId, modelId);
		return new ResponseEntity<>(contentRule,null,HttpStatus.OK);
    }
}
