package com.wondertek.baiying.marketing.domain;


import javax.persistence.*;
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
    private String voteId;

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
    @Column(name="optiont")
    private String option;

    /**
     * 生成时间      举例： 2011-04-12 22:51:34.0
     */
    @Column(name="create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    public VoteLog() {
    }

    public VoteLog(String voteId, String userName, String userId, String option, Date createTime) {
        this.voteId = voteId;
        this.userName = userName;
        this.userId = userId;
        this.option = option;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoteId() {
        return voteId;
    }

    public void setVoteId(String voteId) {
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

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "VoteLog{" +
            "id=" + id +
            ", voteId='" + voteId + '\'' +
            ", userName='" + userName + '\'' +
            ", userId='" + userId + '\'' +
            ", option='" + option + '\'' +
            ", createTime=" + createTime +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoteLog voteLog = (VoteLog) o;

        if (id != null ? !id.equals(voteLog.id) : voteLog.id != null) return false;
        if (voteId != null ? !voteId.equals(voteLog.voteId) : voteLog.voteId != null) return false;
        if (userName != null ? !userName.equals(voteLog.userName) : voteLog.userName != null) return false;
        if (userId != null ? !userId.equals(voteLog.userId) : voteLog.userId != null) return false;
        if (option != null ? !option.equals(voteLog.option) : voteLog.option != null) return false;
        return createTime != null ? createTime.equals(voteLog.createTime) : voteLog.createTime == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (voteId != null ? voteId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (option != null ? option.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
