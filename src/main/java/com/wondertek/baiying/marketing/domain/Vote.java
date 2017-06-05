package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "vote")
public class Vote implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 投票活动的唯一标识
	 */
    @Id
    @Field("vote_id")
    private Long id;

    /**
     * 投票活动属于哪个app
     */
    private String appId;
    
    /**
     * 投票海报图片路径
     */
    private String posterUrl;
    
    /**
     * 单选多选方式
     */
    private String choiceType;
    
    /**
     * 活动生成时间
     */
    private Date createTime;
    
    /**
     * 活动结束时间
     */
    private Date endTime;
    
    /**
     * 活动说明
     */
    private String description;
    
    /**
     * 活动参与次数选择
     */
    private int severalTimes;
    
    /**
     * 活动开始时间
     */
    private Date startTime;
    
    /**
     * 活动在线状态
     */
    private String onlineStatus;
    
    /**
     * 审核状态
     */
    private String status;
    
    /**
     * 活动标题
     */
    private String title;
    
    /**
     * 投票时间间隔
     */
    private String timeInterval;
    
    /**
     * 文字选项集合或者图片选项集合
     */
    private String options;
    
    /**
     *记录活动更新时间
     */
    private Date updateTime;
    
    /**
     *投票花费,eg：消耗积分
     */
    private String cost;
    
    /**
     *投票形式：文字投票还是图片投票
     */
    private String type;
    
    /**
     *投票人身份，eg:会员
     */
    private String memberLevel;
    
    /**
     *记录创建人
     */
    private String creatorId;


	public Long getId() {
		return id;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public String getChoiceType() {
		return choiceType;
	}

	public void setChoiceType(String choiceType) {
		this.choiceType = choiceType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSeveralTimes() {
		return severalTimes;
	}

	public void setSeveralTimes(int severalTimes) {
		this.severalTimes = severalTimes;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(String timeInterval) {
		this.timeInterval = timeInterval;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appId == null) ? 0 : appId.hashCode());
		result = prime * result
				+ ((choiceType == null) ? 0 : choiceType.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((creatorId == null) ? 0 : creatorId.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((memberLevel == null) ? 0 : memberLevel.hashCode());
		result = prime * result
				+ ((onlineStatus == null) ? 0 : onlineStatus.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		result = prime * result
				+ ((posterUrl == null) ? 0 : posterUrl.hashCode());
		result = prime * result + severalTimes;
		result = prime * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((timeInterval == null) ? 0 : timeInterval.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((updateTime == null) ? 0 : updateTime.hashCode());
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
		Vote other = (Vote) obj;
		if (appId == null) {
			if (other.appId != null)
				return false;
		} else if (!appId.equals(other.appId))
			return false;
		if (choiceType == null) {
			if (other.choiceType != null)
				return false;
		} else if (!choiceType.equals(other.choiceType))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (creatorId == null) {
			if (other.creatorId != null)
				return false;
		} else if (!creatorId.equals(other.creatorId))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (memberLevel == null) {
			if (other.memberLevel != null)
				return false;
		} else if (!memberLevel.equals(other.memberLevel))
			return false;
		if (onlineStatus == null) {
			if (other.onlineStatus != null)
				return false;
		} else if (!onlineStatus.equals(other.onlineStatus))
			return false;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		if (posterUrl == null) {
			if (other.posterUrl != null)
				return false;
		} else if (!posterUrl.equals(other.posterUrl))
			return false;
		if (severalTimes != other.severalTimes)
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (timeInterval == null) {
			if (other.timeInterval != null)
				return false;
		} else if (!timeInterval.equals(other.timeInterval))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", appId=" + appId + ", posterUrl="
				+ posterUrl + ", choiceType=" + choiceType + ", createTime="
				+ createTime + ", endTime=" + endTime + ", description="
				+ description + ", severalTimes=" + severalTimes
				+ ", startTime=" + startTime + ", onlineStatus=" + onlineStatus
				+ ", status=" + status + ", title=" + title + ", timeInterval="
				+ timeInterval + ", options=" + options + ", updateTime="
				+ updateTime + ", cost=" + cost + ", type=" + type
				+ ", memberLevel=" + memberLevel + ", creatorId=" + creatorId
				+ "]";
	}
}
