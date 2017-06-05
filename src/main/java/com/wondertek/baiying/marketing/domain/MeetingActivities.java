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
    
}
