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
	
	@RequestMapping("/save")
    public QuestionAnswer save(QuestionAnswer QuestionAnswer){
		QuestionAnswer registration =  questionAnswerService.save(QuestionAnswer);
		return registration;
    }
	
	@RequestMapping("/findAllByQuestionStatusAndAppId")
    public List<QuestionAnswer> findAllByQuestionStatusAndAppId(String questionStatus,String appId){
		return questionAnswerService.findAllByQuestionStatusAndAppId(questionStatus, appId);
    }
	
//	@RequestMapping("/findAll")
//	@ResponseBody
//	public ResponseEntity<Page<QuestionAnswer>> findAll(int page,int size,String direction,String property){
//		Page<QuestionAnswer> QuestionAnswerPage = QuestionAnswerService.findAll(page,size,direction,property);
//		return new ResponseEntity<>(QuestionAnswerPage,null,HttpStatus.OK);
//	}
	
	@RequestMapping("/findOneById")
	public QuestionAnswer findOneById(Long id){
	    	return questionAnswerService.findOneById(id);
	}
	
	@RequestMapping("/findAllByQuestionStatusOrQuestionStatusAndAppId")
	public List<QuestionAnswer> findAllByQuestionStatusOrQuestionStatusAndAppId(String questionStatus,String Status,String appId){
 	   return questionAnswerService.findAllByQuestionStatusOrQuestionStatusAndAppId(questionStatus,Status,appId);
    }
	
	@RequestMapping("/findAllByQuestionStatusAndAppIdAndQuestionTimeAfter")
    public List<QuestionAnswer> findAllByQuestionStatusAndAppIdAndQuestionTimeAfter(String questionStatus,String appId,String questionTime){
    	return questionAnswerService.findAllByQuestionStatusAndAppIdAndQuestionTimeAfter(questionStatus,appId,questionTime);
    }
}
