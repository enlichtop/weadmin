package me.zhengjie.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName WeAppGoods
 * @Description 小程序商品详情类
 * @Author lichen
 * @Date 2021/8/2 22:19
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "weapp_goods_detail")
public class WeAppGoodsDetail {

	@Id
	private String id;
	@Basic
	@Column(name = "CONTENTDETAILS")
	private String contentDetails;
	@Basic
	@Column(name = "GOODSPROPERTIES")
	private String goodsProperties;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContentDetails() {
		return contentDetails;
	}

	public void setContentDetails(String contentDetails) {
		this.contentDetails = contentDetails;
	}

	public String getGoodsProperties() {
		return goodsProperties;
	}

	public void setGoodsProperties(String goodsProperties) {
		this.goodsProperties = goodsProperties;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WeAppGoodsDetail that = (WeAppGoodsDetail) o;
		return Objects.equals(id, that.id) && Objects.equals(contentDetails, that.contentDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, contentDetails);
	}

}
