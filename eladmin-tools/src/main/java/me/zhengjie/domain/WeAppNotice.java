package me.zhengjie.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName WeappNoticeEntity
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/3 22:33
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "weapp_notice", schema = "eladmin")
public class WeAppNotice {
	private Timestamp dateAdd;
	private Timestamp dateUpdate;
	private String id;
	private Byte isShow;
	private String title;
	private String userId;

	@Basic
	@Column(name = "DATEADD")
	public Timestamp getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(Timestamp dateadd) {
		this.dateAdd = dateadd;
	}

	@Basic
	@Column(name = "DATEUPDATE")
	public Timestamp getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Timestamp dateupdate) {
		this.dateUpdate = dateupdate;
	}

	@Id
	@Column(name = "ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Basic
	@Column(name = "ISSHOW")
	public Byte getIsShow() {
		return isShow;
	}

	public void setIsShow(Byte isshow) {
		this.isShow = isshow;
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
		WeAppNotice that = (WeAppNotice) o;
		return Objects.equals(dateAdd, that.dateAdd) &&
				Objects.equals(dateUpdate, that.dateUpdate) &&
				Objects.equals(id, that.id) &&
				Objects.equals(isShow, that.isShow) &&
				Objects.equals(title, that.title) &&
				Objects.equals(userId, that.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateAdd, dateUpdate, id, isShow, title, userId);
	}
}
