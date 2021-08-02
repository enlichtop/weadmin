package me.zhengjie.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName WeAppBanner
 * @Description 轮播图类
 * @Author lichen
 * @Date 2021/7/28 23:00
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "weapp_banner")
public class WeAppBanner {
	private String id;
	private String businessId;
	private Timestamp createTime;
	private Timestamp updateTime;
	private String linkUrl;
	private Integer sortno;
	private String picUrl;
	private String status;
	private String statusStr;
	private String title;
	private String type;
	private String userId;

	@Id
	@Column(name = "ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Basic
	@Column(name = "BUSINESSID")
	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessid) {
		this.businessId = businessid;
	}

	@Basic
	@Column(name = "CREATETIME")
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createtime) {
		this.createTime = createtime;
	}

	@Basic
	@Column(name = "UPDATETIME")
	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updatetime) {
		this.updateTime = updatetime;
	}

	@Basic
	@Column(name = "LINKURL")
	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkurl) {
		this.linkUrl = linkurl;
	}

	@Basic
	@Column(name = "SORTNO")
	public Integer getSortno() {
		return sortno;
	}

	public void setSortno(Integer sortno) {
		this.sortno = sortno;
	}

	@Basic
	@Column(name = "PICURL")
	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picurl) {
		this.picUrl = picurl;
	}

	@Basic
	@Column(name = "STATUS")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Basic
	@Column(name = "STATUSSTR")
	public String getStatusStr() {
		return statusStr;
	}

	public void setStatusStr(String statusstr) {
		this.statusStr = statusstr;
	}

	@Basic
	@Column(name = "TITLE")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Basic
	@Column(name = "TYPE")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Basic
	@Column(name = "USERID")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userid) {
		this.userId = userid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WeAppBanner that = (WeAppBanner) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(businessId, that.businessId) &&
				Objects.equals(createTime, that.createTime) &&
				Objects.equals(updateTime, that.updateTime) &&
				Objects.equals(linkUrl, that.linkUrl) &&
				Objects.equals(sortno, that.sortno) &&
				Objects.equals(picUrl, that.picUrl) &&
				Objects.equals(status, that.status) &&
				Objects.equals(statusStr, that.statusStr) &&
				Objects.equals(title, that.title) &&
				Objects.equals(type, that.type) &&
				Objects.equals(userId, that.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, businessId, createTime, updateTime, linkUrl, sortno, picUrl, status, statusStr, title, type, userId);
	}
}
