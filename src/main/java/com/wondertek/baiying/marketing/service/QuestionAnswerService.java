package com.wondertek.baiying.marketing.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wondertek.baiying.marketing.domain.QuestionAnswer;
import com.wondertek.baiying.marketing.repository.QuestionAnswerRepository;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class QuestionAnswerService {

    private final Logger log = LoggerFactory.getLogger(QuestionAnswerService.class);

    private final QuestionAnswerRepository questionAnswerRepository;
    
    public QuestionAnswerService(QuestionAnswerRepository questionAnswerRepository) {
        this.questionAnswerRepository = questionAnswerRepository;
    }
    
    public QuestionAnswer save(QuestionAnswer questionAnswer){
    	return questionAnswerRepository.save(questionAnswer);
    }
    
    public  List<QuestionAnswer> findAllByQuestionStatusAndAppId(String questionStatus,String appId){
    	return questionAnswerRepository.findAllByQuestionStatusAndAppId(questionStatus, appId);
    }
    
    public QuestionAnswer findOneById(String id){
    	return questionAnswerRepository.findOne(id);
    }
    
    public List<QuestionAnswer> findAllByQuestionStatusOrQuestionStatusAndAppId(String questionStatus,String Status,String appId){
    	return 	questionAnswerRepository.findAllByQuestionStatusOrQuestionStatusAndAppId(questionStatus, Status, appId);
    }
    
    public  List<QuestionAnswer>  findAllByQuestionStatusAndAppIdAndQuestionTimeAfter(String questionStatus,String appId,String questionTime){
    	return 	questionAnswerRepository.findAllByQuestionStatusAndAppIdAndQuestionTimeAfter(questionStatus, appId, questionTime);
    }
    
    
}
