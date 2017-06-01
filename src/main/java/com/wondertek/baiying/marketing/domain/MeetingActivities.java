package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "meeting_activities")
public class MeetingActivities implements Serializable {
	private static final long serialVersionUID = 231274384729379840L;

	/**
	 * 唯一标识
	 */
    @Id
    @Field("_id")
    private String id;
    
    /**
     * 手机APP ID
     */
    private String appId;

    /**
     * 标题
     */
    private String title;
    /**
     * 地址
     */
    private String address;
    /**
     * 在线状态
     */
    private String onlineStatus;
    /**
     * 联系人
     */
    private String contacts; 
    /**
     * 联系电话
     */
    private String contactPhone;
    /**
     * 海报说明
     */
    private String description;
    /**
     * 邮箱地址
     */
    private String eventPoster;
    /**
     * 最大报名人数
     */
    private Integer appliantsMax;
    /**
     * 剩余报名人数
     */
    private Integer Remaining;
    /**
     * 会员等级
     */
    private Integer memberLevel;
    /**
     * 平均每次使用积分
     */
    private Integer avgIntegral;
    /**
     * 见面会时间
     */
    private String datetime;
    /**
     * 报名开始时间
     */
    private String registerStartTime;
    /**
     * 报名结束时间
     */
    private String registerEndTime;
    /**
     * 见面会创建时间
     */
    private String createTime;
    /**
     * 每次报名花费
     */
    private String cost;
    /**
     * 创建人ID
     */
    private String createId;
    /**
     * 百应ID
     */
    private String baiyingId;
    /**
     * 见面会更新ID
     */
    private String updateId;
    /**
     * 见面会更新时间
     */
    private String updateTime;
    /**
     * 见面会创建状态
     */
    private Integer status;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOnlineStatus() {
		return onlineStatus;
	}
	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEventPoster() {
		return eventPoster;
	}
	public void setEventPoster(String eventPoster) {
		this.eventPoster = eventPoster;
	}
	public Integer getAppliantsMax() {
		return appliantsMax;
	}
	public void setAppliantsMax(Integer appliantsMax) {
		this.appliantsMax = appliantsMax;
	}
	public Integer getRemaining() {
		return Remaining;
	}
	public void setRemaining(Integer remaining) {
		Remaining = remaining;
	}
	public Integer getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}
	public Integer getAvgIntegral() {
		return avgIntegral;
	}
	public void setAvgIntegral(Integer avgIntegral) {
		this.avgIntegral = avgIntegral;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getRegisterStartTime() {
		return registerStartTime;
	}
	public void setRegisterStartTime(String registerStartTime) {
		this.registerStartTime = registerStartTime;
	}
	public String getRegisterEndTime() {
		return registerEndTime;
	}
	public void setRegisterEndTime(String registerEndTime) {
		this.registerEndTime = registerEndTime;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	public String getBaiyingId() {
		return baiyingId;
	}
	public void setBaiyingId(String baiyingId) {
		this.baiyingId = baiyingId;
	}
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MeetingActivities [id=" + id + ", appId=" + appId + ", title="
				+ title + ", address=" + address + ", onlineStatus="
				+ onlineStatus + ", contacts=" + contacts + ", contactPhone="
				+ contactPhone + ", description=" + description
				+ ", eventPoster=" + eventPoster + ", appliantsMax="
				+ appliantsMax + ", Remaining=" + Remaining + ", memberLevel="
				+ memberLevel + ", avgIntegral=" + avgIntegral + ", datetime="
				+ datetime + ", registerStartTime=" + registerStartTime
				+ ", registerEndTime=" + registerEndTime + ", createTime="
				+ createTime + ", cost=" + cost + ", createId=" + createId
				+ ", baiyingId=" + baiyingId + ", updateId=" + updateId
				+ ", updateTime=" + updateTime + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Remaining == null) ? 0 : Remaining.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((appId == null) ? 0 : appId.hashCode());
		result = prime * result
				+ ((appliantsMax == null) ? 0 : appliantsMax.hashCode());
		result = prime * result
				+ ((avgIntegral == null) ? 0 : avgIntegral.hashCode());
		result = prime * result
				+ ((baiyingId == null) ? 0 : baiyingId.hashCode());
		result = prime * result
				+ ((contactPhone == null) ? 0 : contactPhone.hashCode());
		result = prime * result
				+ ((contacts == null) ? 0 : contacts.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result
				+ ((createId == null) ? 0 : createId.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((datetime == null) ? 0 : datetime.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((eventPoster == null) ? 0 : eventPoster.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((memberLevel == null) ? 0 : memberLevel.hashCode());
		result = prime * result
				+ ((onlineStatus == null) ? 0 : onlineStatus.hashCode());
		result = prime * result
				+ ((registerEndTime == null) ? 0 : registerEndTime.hashCode());
		result = prime
				* result
				+ ((registerStartTime == null) ? 0 : registerStartTime
						.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((updateId == null) ? 0 : updateId.hashCode());
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
		MeetingActivities other = (MeetingActivities) obj;
		if (Remaining == null) {
			if (other.Remaining != null)
				return false;
		} else if (!Remaining.equals(other.Remaining))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (appId == null) {
			if (other.appId != null)
				return false;
		} else if (!appId.equals(other.appId))
			return false;
		if (appliantsMax == null) {
			if (other.appliantsMax != null)
				return false;
		} else if (!appliantsMax.equals(other.appliantsMax))
			return false;
		if (avgIntegral == null) {
			if (other.avgIntegral != null)
				return false;
		} else if (!avgIntegral.equals(other.avgIntegral))
			return false;
		if (baiyingId == null) {
			if (other.baiyingId != null)
				return false;
		} else if (!baiyingId.equals(other.baiyingId))
			return false;
		if (contactPhone == null) {
			if (other.contactPhone != null)
				return false;
		} else if (!contactPhone.equals(other.contactPhone))
			return false;
		if (contacts == null) {
			if (other.contacts != null)
				return false;
		} else if (!contacts.equals(other.contacts))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (createId == null) {
			if (other.createId != null)
				return false;
		} else if (!createId.equals(other.createId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (datetime == null) {
			if (other.datetime != null)
				return false;
		} else if (!datetime.equals(other.datetime))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (eventPoster == null) {
			if (other.eventPoster != null)
				return false;
		} else if (!eventPoster.equals(other.eventPoster))
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
		if (registerEndTime == null) {
			if (other.registerEndTime != null)
				return false;
		} else if (!registerEndTime.equals(other.registerEndTime))
			return false;
		if (registerStartTime == null) {
			if (other.registerStartTime != null)
				return false;
		} else if (!registerStartTime.equals(other.registerStartTime))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (updateId == null) {
			if (other.updateId != null)
				return false;
		} else if (!updateId.equals(other.updateId))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}
    
}
