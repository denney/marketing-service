package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notice")
public class Notice implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 唯一标识
	 */
	@Id
	@Column(name = "id")
	private String id;

	/**
	 * 该业务属于哪个app
	 */
	@Column(name = "app_id")
	private String appId;

	/**
	 * 公告条内容
	 */
	@Column(name = "content")
	private String content;

	/**
	 * 记录生成时间
	 */
	@Column(name = "create_time")
	private Date createTime;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 记录创建人
	 */
	@Column(name = "creator_id")
	private String creatorId;

	/**
	 * 创建人名
	 */
	@Column(name = "creator_name")
	private String creatorName;

	/**
	 * 活动在线状态(0：上线，1：下线)
	 */
	@Column(name = "online_status")
	private String onlineStatus;

	public Notice() {
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", appId=" + appId + ", content=" + content
				+ ", createTime=" + createTime + ", creatorId=" + creatorId
				+ ", creatorName=" + creatorName + ", onlineStatus="
				+ onlineStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appId == null) ? 0 : appId.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((creatorId == null) ? 0 : creatorId.hashCode());
		result = prime * result
				+ ((creatorName == null) ? 0 : creatorName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((onlineStatus == null) ? 0 : onlineStatus.hashCode());
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
		Notice other = (Notice) obj;
		if (appId == null) {
			if (other.appId != null)
				return false;
		} else if (!appId.equals(other.appId))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
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
		if (creatorName == null) {
			if (other.creatorName != null)
				return false;
		} else if (!creatorName.equals(other.creatorName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (onlineStatus == null) {
			if (other.onlineStatus != null)
				return false;
		} else if (!onlineStatus.equals(other.onlineStatus))
			return false;
		return true;
	}

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}
}
