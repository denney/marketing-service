package com.wondertek.baiying.marketing.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "award")
public class Award implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 唯一标识
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /**
     * 名称
     */
    @Column(name="name")
    private String name;
    
    /**
     * 奖品图片
     */
    @Column(name="poster")
    private String poster;
    
    /**
     * 活动ID
     */
    @Column(name="event_id")
    private Long eventId;
    
    /**
     * 奖品数量
     */
    @Column(name="max_count")
    private int maxCount;
    
    /**
     * 剩余数量
     */
    @Column(name="inventory")
    private int inventory;
    
    /**
     * 中奖概率
     */
    @Column(name="win_rate")
    private double winRate;
    
    /**
     * 描述
     */
    @Column(name="description")
    private String description;
    
    /**
	 * 创建时间
	 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time")
	private Date createTime;
	
	/**
	 * 创建人编号
	 */
    @Column(name="creator_id")
	private Long creatorId;
	
	/**
	 * 修改时间
	 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_time")
	private Date updateTime;
	
	/**
	 * 修改人编号
	 */
    @Column(name="updator_id")
	private Long updatorId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public double getWinRate() {
		return winRate;
	}

	public void setWinRate(double winRate) {
		this.winRate = winRate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((creatorId == null) ? 0 : creatorId.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + inventory;
		result = prime * result + maxCount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((poster == null) ? 0 : poster.hashCode());
		result = prime * result
				+ ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result
				+ ((updatorId == null) ? 0 : updatorId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(winRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Award other = (Award) obj;
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
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inventory != other.inventory)
			return false;
		if (maxCount != other.maxCount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (poster == null) {
			if (other.poster != null)
				return false;
		} else if (!poster.equals(other.poster))
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
		if (Double.doubleToLongBits(winRate) != Double
				.doubleToLongBits(other.winRate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Award [id=" + id + ", name=" + name + ", poster=" + poster
				+ ", eventId=" + eventId + ", maxCount=" + maxCount
				+ ", inventory=" + inventory + ", winRate=" + winRate
				+ ", description=" + description + ", createTime=" + createTime
				+ ", creatorId=" + creatorId + ", updateTime=" + updateTime
				+ ", updatorId=" + updatorId + "]";
	}
    
}
