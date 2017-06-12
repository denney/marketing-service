package com.wondertek.baiying.marketing.domain;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "vote_log")
public class VoteLog implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 投票日志的唯一标识
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 投票的id属于哪个活动
     */
    @Column(name="vote_id")
    private Long voteId;

	/**
     *用户名
     */
    @Column(name="user_name")
    private String userName;

    /**
     * 哪个用户投了票
     */
    @Column(name="user_id")
    private String userId;

    /**
     * 用户投了那个选项
     */
    @Column(name="options")
    private String options;

    /**
     * 生成时间      举例： 2011-04-12 22:51:34.0
     */
    @Column(name="create_time")
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public VoteLog() {
    }

	public VoteLog(Long id, Long voteId, String userName, String userId,
			String options, Date createTime) {
		super();
		this.id = id;
		this.voteId = voteId;
		this.userName = userName;
		this.userId = userId;
		this.options = options;
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "VoteLog [id=" + id + ", voteId=" + voteId + ", userName="
				+ userName + ", userId=" + userId + ", options=" + options
				+ ", createTime=" + createTime + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVoteId() {
		return voteId;
	}

	public void setVoteId(Long voteId) {
		this.voteId = voteId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((voteId == null) ? 0 : voteId.hashCode());
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
		VoteLog other = (VoteLog) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (voteId == null) {
			if (other.voteId != null)
				return false;
		} else if (!voteId.equals(other.voteId))
			return false;
		return true;
	}
    

}