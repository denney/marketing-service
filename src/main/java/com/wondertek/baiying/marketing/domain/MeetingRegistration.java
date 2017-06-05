package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Persist AuditEvent managed by the Spring Boot actuator
 * @see org.springframework.boot.actuate.audit.AuditEvent
 */
@Document(collection = "MEETING_REGISTRATION")
public class MeetingRegistration implements Serializable {
	
	private static final long serialVersionUID = 231274384729379840L;
	
	
	
	/**
	 * 唯一标识
	 */
    @Id
    @Field("ID")
    private String id;

    /**
     * 活动表自增ID
     */
    @NotNull
    private String activityId;
    
    /**
     * 用户id
     */
    @NotNull
    private String userId;
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 手机号
     */
    private String phone;
    
    /**
     * 备注
     */
    private String remarks;
    
    /**
     * 报名状态（0：成功、1：失败）
     */
    private int registerStatus;
    
    /**
     * 报名时间
     */
    private String registerTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getRegisterStatus() {
		return registerStatus;
	}

	public void setRegisterStatus(int registerStatus) {
		this.registerStatus = registerStatus;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
    
}
