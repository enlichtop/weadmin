package me.zhengjie.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName WeappSkulistEntity
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/6 23:59
 * @Version 1.0
 **/
@Entity
@Table(name = "weapp_skulist", schema = "eladmin", catalog = "")
public class WeAppSkuList {
	private String fxType;
	private String goodsId;
	private String id;
	private Double originalPrice;
	private Double pingtuanPrice;
	private Double price;
	private String propertyChildIds;
	private String propertyChildNames;
	private Integer score;
	private Integer stores;
	private String userId;

	@Basic
	@Column(name = "FXTYPE")
	public String getFxType() {
		return fxType;
	}

	public void setFxType(String fxtype) {
		this.fxType = fxtype;
	}

	@Basic
	@Column(name = "GOODSID")
	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsid) {
		this.goodsId = goodsid;
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
	@Column(name = "ORIGINALPRICE")
	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalprice) {
		this.originalPrice = originalprice;
	}

	@Basic
	@Column(name = "PINGTUANPRICE")
	public Double getPingtuanPrice() {
		return pingtuanPrice;
	}

	public void setPingtuanPrice(Double pingtuanprice) {
		this.pingtuanPrice = pingtuanprice;
	}

	@Basic
	@Column(name = "PRICE")
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Basic
	@Column(name = "PROPERTYCHILDIDS")
	public String getPropertyChildIds() {
		return propertyChildIds;
	}

	public void setPropertyChildIds(String propertychildids) {
		this.propertyChildIds = propertychildids;
	}

	@Basic
	@Column(name = "PROPERTYCHILDNAMES")
	public String getPropertyChildNames() {
		return propertyChildNames;
	}

	public void setPropertyChildNames(String propertychildnames) {
		this.propertyChildNames = propertychildnames;
	}

	@Basic
	@Column(name = "SCORE")
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Basic
	@Column(name = "STORES")
	public Integer getStores() {
		return stores;
	}

	public void setStores(Integer stores) {
		this.stores = stores;
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
		WeAppSkuList that = (WeAppSkuList) o;
		return Objects.equals(fxType, that.fxType) &&
				Objects.equals(goodsId, that.goodsId) &&
				Objects.equals(id, that.id) &&
				Objects.equals(originalPrice, that.originalPrice) &&
				Objects.equals(pingtuanPrice, that.pingtuanPrice) &&
				Objects.equals(price, that.price) &&
				Objects.equals(propertyChildIds, that.propertyChildIds) &&
				Objects.equals(propertyChildNames, that.propertyChildNames) &&
				Objects.equals(score, that.score) &&
				Objects.equals(stores, that.stores) &&
				Objects.equals(userId, that.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fxType, goodsId, id, originalPrice, pingtuanPrice, price, propertyChildIds, propertyChildNames, score, stores, userId);
	}
}
