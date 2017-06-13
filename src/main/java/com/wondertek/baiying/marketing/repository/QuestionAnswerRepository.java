package com.wondertek.baiying.marketing.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wondertek.baiying.marketing.domain.QuestionAnswer;

/**
 * Spring Data JPA repository for the ModelContentRule entity.
 */
public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Long> {

	
	List<QuestionAnswer> findAllByQuestionStatusAndAppIdAndOnlineStatus(int questionStatus,String appId,int onlineStatus);
	
//	@Query("select q from QuestionAnswer q where q.questionStatus = ?1 or  q.questionStatus = ?2 and q.appId = ?3")
//	List<QuestionAnswer> findAllQuestionAnswer(int questionStatus,int Status,String appId,String questionTime,Pageable pageable);
	
	List<QuestionAnswer> findAllByOnlineStatusAndQuestionStatusOrQuestionStatusAndAppIdAndQuestionTime(int onlineStatus,int questionStatusA,int questionStatusB,String appId,Date questionTime,Pageable pageable);
	
	List<QuestionAnswer> findAllByUserIdAndAppId(String userId,String appId);
	
	List<QuestionAnswer> findAllByAnswerIdAndAppId(String answerId,String appId);
	
	
}
