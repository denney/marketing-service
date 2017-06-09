package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Persist AuditEvent managed by the Spring Boot actuator
 * @see org.springframework.boot.actuate.audit.AuditEvent
 */
@Document(collection = "QUESTION_ANSWER")
public class QuestionAnswer implements Serializable {
	
	private static final long serialVersionUID = 231274384729379840L;
	
	
	
	/**
	 * 问答表自增ID
	 */
    @Id
    @Field("ID")
    private String id;
    
    /**
     * 区分app类型
     */
    private String appId;
    
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
    private String questionInfo;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public String getQuestionTime() {
		return questionTime;
	}
	public void setQuestionTime(String questionTime) {
		this.questionTime = questionTime;
	}
	public String getAnswerTime() {
		return answerTime;
	}
	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}
	public String getQuestionInfo() {
		return questionInfo;
	}
	public void setQuestionInfo(String questionInfo) {
		this.questionInfo = questionInfo;
	}
	public String getAnswerInfo() {
		return answerInfo;
	}
	public void setAnswerInfo(String answerInfo) {
		this.answerInfo = answerInfo;
	}
	public int getOnlineStatus() {
		return onlineStatus;
	}
	public void setOnlineStatus(int onlineStatus) {
		this.onlineStatus = onlineStatus;
	}
	public int getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(int questionStatus) {
		this.questionStatus = questionStatus;
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
		result = prime * result + ((appId == null) ? 0 : appId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (appId == null) {
			if (other.appId != null)
				return false;
		} else if (!appId.equals(other.appId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
	
}
