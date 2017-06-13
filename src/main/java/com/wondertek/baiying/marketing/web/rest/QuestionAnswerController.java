package com.wondertek.baiying.marketing.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wondertek.baiying.marketing.domain.QuestionAnswer;
import com.wondertek.baiying.marketing.service.QuestionAnswerService;

/**
 * Resource to return information about the currently running Spring profiles.
 */
@RestController
@RequestMapping("/QuestionAnswer")
public class QuestionAnswerController {

	@Autowired
    private QuestionAnswerService questionAnswerService;
	//
	@RequestMapping("/save")
    public QuestionAnswer save(QuestionAnswer QuestionAnswer){
		QuestionAnswer registration =  questionAnswerService.save(QuestionAnswer);
		return registration;
    }
	
	@RequestMapping("/findAllQuestionAnswer")
    public List<QuestionAnswer> findAllQuestionAnswer(int onlineStatus,int questionStatusA,int questionStatusB,String appId,String questionTime,int page,int size,String direction,String property){
		return questionAnswerService.findAllQuestionAnswer(onlineStatus,questionStatusA, questionStatusB, appId, questionTime, page, size, direction, property);
    }
	
	
	@RequestMapping("/findOneById")
	public QuestionAnswer findOneById(Long id){
	    	return questionAnswerService.findOneById(id);
	}
	
	@RequestMapping("/deleteOneById")
	public void deleteOneById(Long id){
	    	 questionAnswerService.deleteOneById(id);
	}
}
