package com.wondertek.baiying.marketing.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
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
    
    public  List<QuestionAnswer> findAllQuestionAnswer(int onlineStatus,int questionStatusA,int questionStatusB,String appId,String questionTime,int page,int size,String direction,String property){
    	Pageable pageable = null;
    	if("asc".equals(direction)){
    		pageable = new PageRequest(page, size, Direction.ASC, property);
    	}else{
    		pageable = new PageRequest(page, size, Direction.DESC, property);
    	}
    	SimpleDateFormat fm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Date date=null;
		try {
			date = fm.parse(questionTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fm.format(date));
    	return questionAnswerRepository.findAllByOnlineStatusAndQuestionStatusOrQuestionStatusAndAppIdAndQuestionTime(onlineStatus,questionStatusA, questionStatusB, appId, date, pageable);
    }
    
    public QuestionAnswer findOneById(Long id){
    	return questionAnswerRepository.findOne(id);
    }
    
    public void deleteOneById(Long id){
    	questionAnswerRepository.delete(id);
    }
    
    
}
