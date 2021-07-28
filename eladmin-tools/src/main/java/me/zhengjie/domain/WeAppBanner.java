package me.zhengjie.domain;

import io.swagger.annotations.ApiModelProperty;
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
	private String businessid;
	private Timestamp createtime;
	private Timestamp updatetime;
	private String linkurl;
	private Integer sortno;
	private String picurl;
	private String status;
	private String statusstr;
	private String title;
	private String type;
	private String userid;

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
	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}

	@Basic
	@Column(name = "CREATETIME")
	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Basic
	@Column(name = "UPDATETIME")
	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	@Basic
	@Column(name = "LINKURL")
	public String getLinkurl() {
		return linkurl;
	}

	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
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
	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
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
	public String getStatusstr() {
		return statusstr;
	}

	public void setStatusstr(String statusstr) {
		this.statusstr = statusstr;
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
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WeAppBanner that = (WeAppBanner) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(businessid, that.businessid) &&
				Objects.equals(createtime, that.createtime) &&
				Objects.equals(updatetime, that.updatetime) &&
				Objects.equals(linkurl, that.linkurl) &&
				Objects.equals(sortno, that.sortno) &&
				Objects.equals(picurl, that.picurl) &&
				Objects.equals(status, that.status) &&
				Objects.equals(statusstr, that.statusstr) &&
				Objects.equals(title, that.title) &&
				Objects.equals(type, that.type) &&
				Objects.equals(userid, that.userid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, businessid, createtime, updatetime, linkurl, sortno, picurl, status, statusstr, title, type, userid);
	}
}
