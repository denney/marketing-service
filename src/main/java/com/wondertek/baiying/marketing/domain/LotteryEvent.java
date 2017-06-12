package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lottery_event")
public class LotteryEvent implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 抽奖活动ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * 用户id
	 */
	@Column(name = "user_id")
	private Long userId;
	
	/**
	 * appID
	 */
	@Column(name ="app_id")
	private Long appId;
	
	/**
	 * 活动标题
	 */
	@Column(name ="title")
	private String title;
	
	/**
	 * 活动说明
	 */
	@Column(name ="description")
	private String description;
	
	/**
	 * 海报
	 */
	@Column(name ="poster_url")
	private String posterUrl;
	
	/**
	 * 活动状态    0：即将上线；1：正在进行；2：已结束
	 */
	@Column(name ="status")
	private String status;
	
	/**
	 * 活动在线状态    0：上线；1：下线
	 */
	@Column(name ="online_status")
	private int onlineStatus;
	
	/**
	 * 活动开始时间
	 */
	@Column(name ="start_time")
	private Date startTime;
	
	/**
	 * 活动结束时间
	 */
	@Column(name ="end_time")
	private Date endTime;
	
	/**
	 * 抽奖会员等级限制
	 */
	@Column(name ="member_level")
	private String memberLevel;
	
	/**
	 * 抽奖次数
	 */
	@Column(name ="several_times")
	private int severalTimes;
	
	/**
	 * 抽奖次数限制范围（活动期间、每天）
	 */
	@Column(name ="time_interval")
	private String timeInterval;
	
	/**
	 * 每次抽奖消耗积分
	 */
	@Column(name ="cost")
	private String cost;
	
	/**
	 * 创建时间
	 */
	@Column(name ="create_time")
	private Date createTime;
	
	/**
	 * 创建人编号
	 */
	@Column(name ="creator_id")
	private Long creatorId;
	
	/**
	 * 修改时间
	 */
	@Column(name ="update_time")
	private Date updateTime;
	
	/**
	 * 修改人编号
	 */
	@Column(name ="updator_id")
	private Long updatorId;

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

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(int onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public int getSeveralTimes() {
		return severalTimes;
	}

	public void setSeveralTimes(int severalTimes) {
		this.severalTimes = severalTimes;
	}

	public String getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(String timeInterval) {
		this.timeInterval = timeInterval;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getUpdatorId() {
		return updatorId;
	}

	public void setUpdatorId(Long updatorId) {
		this.updatorId = updatorId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appId == null) ? 0 : appId.hashCode());
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
		result = prime * result + onlineStatus;
		result = prime * result
				+ ((posterUrl == null) ? 0 : posterUrl.hashCode());
		result = prime * result + severalTimes;
		result = prime * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((timeInterval == null) ? 0 : timeInterval.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result
				+ ((updatorId == null) ? 0 : updatorId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		LotteryEvent other = (LotteryEvent) obj;
		if (appId == null) {
			if (other.appId != null)
				return false;
		} else if (!appId.equals(other.appId))
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
		if (onlineStatus != other.onlineStatus)
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
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		if (updatorId == null) {
			if (other.updatorId != null)
				return false;
		} else if (!updatorId.equals(other.updatorId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LotteryEvent [id=" + id + ", userId=" + userId + ", appId="
				+ appId + ", title=" + title + ", description=" + description
				+ ", posterUrl=" + posterUrl + ", status=" + status
				+ ", onlineStatus=" + onlineStatus + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", memberLevel=" + memberLevel
				+ ", severalTimes=" + severalTimes + ", timeInterval="
				+ timeInterval + ", cost=" + cost + ", createTime="
				+ createTime + ", creatorId=" + creatorId + ", updateTime="
				+ updateTime + ", updatorId=" + updatorId + "]";
	}

}
