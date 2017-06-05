package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "lottery_log")
public class LotteryLog implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 唯一标识
	 */
	@Id
    @Field("id")
	private Long id;
	
	/**
     * 用户ID
     */
    @Field("user_id")
    private Long userId;
    
    /**
	 * 用户名称
	 */
    @Field("user_name")
	private String usreName;
    
    /**
	 * 抽奖时间
	 */
    @Field("create_time")
	private Date createTime;
    
    /**
	 * 奖品ID
	 */
    @Field("award_id")
	private Long awardId;
    
    /**
	 * 奖品名称
	 */
    @Field("avwrd_name")
	private String awardName;
    
    /**
	 * 活动ID
	 */
    @Field("event_id")
	private Long eventId;
    
    /**
	 * 用户是否领奖    0，未领；1，已领
	 */
    @Field("get_status")
	private String getStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsreName() {
		return usreName;
	}

	public void setUsreName(String usreName) {
		this.usreName = usreName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getAwardId() {
		return awardId;
	}

	public void setAwardId(Long awardId) {
		this.awardId = awardId;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getGetStatus() {
		return getStatus;
	}

	public void setGetStatus(String getStatus) {
		this.getStatus = getStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awardId == null) ? 0 : awardId.hashCode());
		result = prime * result
				+ ((awardName == null) ? 0 : awardName.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result
				+ ((getStatus == null) ? 0 : getStatus.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((usreName == null) ? 0 : usreName.hashCode());
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
		LotteryLog other = (LotteryLog) obj;
		if (awardId == null) {
			if (other.awardId != null)
				return false;
		} else if (!awardId.equals(other.awardId))
			return false;
		if (awardName == null) {
			if (other.awardName != null)
				return false;
		} else if (!awardName.equals(other.awardName))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (getStatus == null) {
			if (other.getStatus != null)
				return false;
		} else if (!getStatus.equals(other.getStatus))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (usreName == null) {
			if (other.usreName != null)
				return false;
		} else if (!usreName.equals(other.usreName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LotteryLog [id=" + id + ", userId=" + userId + ", usreName="
				+ usreName + ", createTime=" + createTime + ", awardId="
				+ awardId + ", awardName=" + awardName + ", eventId=" + eventId
				+ ", getStatus=" + getStatus + "]";
	}
    
}
