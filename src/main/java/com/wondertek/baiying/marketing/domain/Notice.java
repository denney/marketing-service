package com.wondertek.baiying.marketing.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "notice")
public class Notice implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 唯一标识
	 */
    @Id
    @Field("id")
    private String id;

    /**
     * 该业务属于哪个app
     */
    @Field("appId")
    private String appId;

    /**
     * 公告条内容
     */
    @Field("content")
    private String content;

    /**
     * 记录生成时间
     */
    @Field("createTime")
    private String createTime;

    /**
     * 记录创建人
     */
    @Field("creatorId")
    private String creatorId;

    /**
     * 创建人名
     */
    @Field("creatorName")
    private String creatorName;

    /**
     * 活动在线状态(0：上线，1：下线)
     */
    @Field("onlineStatus")
    private String onlineStatus;

    public Notice() {
    }

    public Notice(String id, String appId, String content, String createTime, String creatorId, String creatorName, String
        onlineStatus) {
        this.id = id;
        this.appId = appId;
        this.content = content;
        this.createTime = createTime;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.onlineStatus = onlineStatus;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
