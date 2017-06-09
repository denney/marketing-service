package com.wondertek.baiying.marketing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wondertek.baiying.marketing.domain.QuestionAnswer;

/**
 * Spring Data JPA repository for the ModelContentRule entity.
 */
public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, String> {

	List<QuestionAnswer> findAllByQuestionStatus(String questionStatus);
	
	List<QuestionAnswer> findAllByQuestionStatusAndAppId(String questionStatus,String appId);
	
	List<QuestionAnswer> findAllByQuestionStatusOrQuestionStatusAndAppId(String questionStatus,String Status,String appId);
	
	QuestionAnswer findOneById(String id);
	
	List<QuestionAnswer> findAllByUserIdAndAppId(String userId,String appId);
	
	List<QuestionAnswer> findAllByAnswerIdAndAppId(String answerId,String appId);
	
	List<QuestionAnswer>  findAllByQuestionStatusAndQuestionTimeAfter(String questionStatus,String questionTime);
	
	List<QuestionAnswer>  findAllByQuestionStatusAndAppIdAndQuestionTimeAfter(String questionStatus,String appId,String questionTime);
}
