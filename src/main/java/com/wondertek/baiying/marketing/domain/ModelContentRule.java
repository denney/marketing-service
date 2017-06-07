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
@Document(collection = "model_content_rule")
public class ModelContentRule implements Serializable {
	
	private static final long serialVersionUID = 231274384729379840L;

	/**
	 * 唯一标识
	 */
    @Id
    @Field("event_id")
    private String id;

    /**
     * 模版id
     */
    @NotNull
    private String modelId;
    
    /**
     * 组件id
     */
    @NotNull
    private String nodeId;
    /**
     * 一级分类
     */
    private String fisrtClassify;
    
    /**
     * 二级分类
     */
    private String secondClassify;
    
    /**
     * 三级分类
     */
    private String thirdClassify;
    
    /**
     * 标签
     */
    private String lables;
    
    /**
     * 数量
     */
    private int num;
    
    /**
     * 排序规则
     */
    private String orderRule;
    
    /**
     * 创建时间
     */
    private Date createDate;
    
    /**
     * 修改时间
     */
    private Date modifyDate;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getFisrtClassify() {
		return fisrtClassify;
	}

	public void setFisrtClassify(String fisrtClassify) {
		this.fisrtClassify = fisrtClassify;
	}

	public String getSecondClassify() {
		return secondClassify;
	}

	public void setSecondClassify(String secondClassify) {
		this.secondClassify = secondClassify;
	}

	public String getThirdClassify() {
		return thirdClassify;
	}

	public void setThirdClassify(String thirdClassify) {
		this.thirdClassify = thirdClassify;
	}

	public String getLables() {
		return lables;
	}

	public void setLables(String lables) {
		this.lables = lables;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getOrderRule() {
		return orderRule;
	}

	public void setOrderRule(String orderRule) {
		this.orderRule = orderRule;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
