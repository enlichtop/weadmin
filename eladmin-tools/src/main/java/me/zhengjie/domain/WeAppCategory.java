package me.zhengjie.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName WeAppCategoryDto
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/30 21:50
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "weapp_category")
public class WeAppCategory {
	private String icon;
	private String id;
	private String isUse;
	private String key;
	private String level;
	private String name;
	private Integer paixu;
	private Integer pid;
	private Integer shopId;
	private String type;
	private String userId;

	@Basic
	@Column(name = "ICON")
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
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
	@Column(name = "ISUSE")
	public String getIsUse() {
		return isUse;
	}

	public void setIsUse(String isuse) {
		this.isUse = isuse;
	}

	@Basic
	@Column(name = "MKEY")
	public String getKey() {
		return key;
	}

	public void setKey(String mkey) {
		this.key = mkey;
	}

	@Basic
	@Column(name = "LEVEL")
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "PAIXU")
	public Integer getPaixu() {
		return paixu;
	}

	public void setPaixu(Integer paixu) {
		this.paixu = paixu;
	}

	@Basic
	@Column(name = "PID")
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Basic
	@Column(name = "SHOPID")
	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopid) {
		this.shopId = shopid;
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
		WeAppCategory that = (WeAppCategory) o;
		return Objects.equals(icon, that.icon) &&
				Objects.equals(id, that.id) &&
				Objects.equals(isUse, that.isUse) &&
				Objects.equals(key, that.key) &&
				Objects.equals(level, that.level) &&
				Objects.equals(name, that.name) &&
				Objects.equals(paixu, that.paixu) &&
				Objects.equals(pid, that.pid) &&
				Objects.equals(shopId, that.shopId) &&
				Objects.equals(type, that.type) &&
				Objects.equals(userId, that.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(icon, id, isUse, key, level, name, paixu, pid, shopId, type, userId);
	}
}
