package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Persist AuditEvent managed by the Spring Boot actuator
 * @see org.springframework.boot.actuate.audit.AuditEvent
 */
@Entity
@Table(name= "question_answer")
public class QuestionAnswer implements Serializable {
	
	private static final long serialVersionUID = 231274384729379840L;
	
	
	
	/**
	 * 问答表自增ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    /**
     * 区分app类型
     */
    private int appId;
    
    /**
     * 提问者id
     */
    private String userId;
    /**
     * 提问者姓名
     */
    private String  userName;
    
    /**
     * 回答者id
     */
    private String answerId;
    /**
     * 回答者姓名
     */
    private String  answerName;
    
    
    /**
     * 提问时间
     */
    private String questionTime;
    
    /**
     * 回答时间
     */
    private String answerTime;
    
    /**
     * 问题详情
     */
    private String questionInfo;
    
    /**
     * 回答详情
     */
    private String answerInfo;
    
    /**
     * 问题在线状态(0：上线，1：下线)
     */
    private int onlineStatus;
    /**
     *问题状态（0：未回答，1：已回答 2 已忽略）
     */
    private int questionStatus;
    /**
     * 点赞次数
     */
//    private String praiseTimes;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "app_id")
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	@Column(name = "user_id")
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "answer_id")
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	@Column(name = "answer_name")
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	@Column(name = "question_time")
	public String getQuestionTime() {
		return questionTime;
	}
	public void setQuestionTime(String questionTime) {
		this.questionTime = questionTime;
	}
	@Column(name = "answer_time")
	public String getAnswerTime() {
		return answerTime;
	}
	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}
	@Column(name = "question_info")
	public String getQuestionInfo() {
		return questionInfo;
	}
	public void setQuestionInfo(String questionInfo) {
		this.questionInfo = questionInfo;
	}
	@Column(name = "answer_info")
	public String getAnswerInfo() {
		return answerInfo;
	}
	public void setAnswerInfo(String answerInfo) {
		this.answerInfo = answerInfo;
	}
	@Column(name = "online_status")
	public int getOnlineStatus() {
		return onlineStatus;
	}
	public void setOnlineStatus(int onlineStatus) {
		this.onlineStatus = onlineStatus;
	}
	@Column(name = "question_status")
	public int getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(int questionStatus) {
		this.questionStatus = questionStatus;
	}
	@Override
	public String toString() {
		return "QuestionAnswer [id=" + id + ", appId=" + appId + ", userId="
				+ userId + ", userName=" + userName + ", answerId=" + answerId
				+ ", answerName=" + answerName + ", questionTime="
				+ questionTime + ", answerTime=" + answerTime
				+ ", questionInfo=" + questionInfo + ", answerInfo="
				+ answerInfo + ", onlineStatus=" + onlineStatus
				+ ", questionStatus=" + questionStatus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((answerId == null) ? 0 : answerId.hashCode());
		result = prime * result
				+ ((answerInfo == null) ? 0 : answerInfo.hashCode());
		result = prime * result
				+ ((answerName == null) ? 0 : answerName.hashCode());
		result = prime * result
				+ ((answerTime == null) ? 0 : answerTime.hashCode());
		result = prime * result + appId;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + onlineStatus;
		result = prime * result
				+ ((questionInfo == null) ? 0 : questionInfo.hashCode());
		result = prime * result + questionStatus;
		result = prime * result
				+ ((questionTime == null) ? 0 : questionTime.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionAnswer other = (QuestionAnswer) obj;
		if (answerId == null) {
			if (other.answerId != null)
				return false;
		} else if (!answerId.equals(other.answerId))
			return false;
		if (answerInfo == null) {
			if (other.answerInfo != null)
				return false;
		} else if (!answerInfo.equals(other.answerInfo))
			return false;
		if (answerName == null) {
			if (other.answerName != null)
				return false;
		} else if (!answerName.equals(other.answerName))
			return false;
		if (answerTime == null) {
			if (other.answerTime != null)
				return false;
		} else if (!answerTime.equals(other.answerTime))
			return false;
		if (appId != other.appId)
			return false;
		if (id != other.id)
			return false;
		if (onlineStatus != other.onlineStatus)
			return false;
		if (questionInfo == null) {
			if (other.questionInfo != null)
				return false;
		} else if (!questionInfo.equals(other.questionInfo))
			return false;
		if (questionStatus != other.questionStatus)
			return false;
		if (questionTime == null) {
			if (other.questionTime != null)
				return false;
		} else if (!questionTime.equals(other.questionTime))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
}
