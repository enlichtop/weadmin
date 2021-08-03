package me.zhengjie.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName WeAppGoods
 * @Description 小程序商品类
 * @Author lichen
 * @Date 2021/8/2 22:19
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "weapp_goods")
public class WeAppGoods {

	private String afterSale;
	private Integer categoryId;
	private Integer commission;
	private Integer commissionSettleType;
	private Integer commissionType;
	private Integer commissionUserType;
	private Timestamp dateAdd;
	private Timestamp dateUpdate;
	private Integer fxType;
	private Integer gotScore;
	private Integer gotScoreType;
	private Byte hasAddition;
	private Byte hasTourJourney;
	private Integer hidden;
	private Integer id;
	private Byte kanjia;
	private Double kanjiaPrice;
	private Byte limitation;
	private Integer logisticsId;
	private Integer maxCoupons;
	private Byte miaosha;
	private Integer minBuyNumber;
	private Double minPrice;
	private Integer minScore;
	private String name;
	private Integer numberFav;
	private Integer numberGoodReputation;
	private Integer numberOrders;
	private Integer numberSells;
	private Double originalPrice;
	private Byte overseas;
	private Integer paixu;
	private String pic;
	private Byte pingtuan;
	private Double pingtuanPrice;
	private Integer priceShopSell;
	private String propertyIds;
	private Integer recommendStatus;
	private String recommendStatusStr;
	private Integer seckillBuyNumber;
	private Byte sellEnd;
	private Byte sellStart;
	private Integer shopId;
	private Integer status;
	private String statusStr;
	private Byte storeAlert;
	private Integer stores;
	private Byte stores0Unsale;
	private String tags;
	private Integer type;
	private String unit;
	private Integer unusefulNumber;
	private Integer usefulNumber;
	private Integer userId;
	private Integer vetStatus;
	private Integer views;
	private Integer weight;
	private Integer brandId;

	@Basic
	@Column(name = "AFTERSALE")
	public String getAfterSale() {
		return afterSale;
	}

	public void setAfterSale(String aftersale) {
		this.afterSale = aftersale;
	}

	@Basic
	@Column(name = "CATEGORYID")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryid) {
		this.categoryId = categoryid;
	}

	@Basic
	@Column(name = "COMMISSION")
	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}

	@Basic
	@Column(name = "COMMISSIONSETTLETYPE")
	public Integer getCommissionSettleType() {
		return commissionSettleType;
	}

	public void setCommissionSettleType(Integer commissionsettletype) {
		this.commissionSettleType = commissionsettletype;
	}

	@Basic
	@Column(name = "COMMISSIONTYPE")
	public Integer getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(Integer commissiontype) {
		this.commissionType = commissiontype;
	}

	@Basic
	@Column(name = "COMMISSIONUSERTYPE")
	public Integer getCommissionUserType() {
		return commissionUserType;
	}

	public void setCommissionUserType(Integer commissionusertype) {
		this.commissionUserType = commissionusertype;
	}

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

	@Basic
	@Column(name = "FXTYPE")
	public Integer getFxType() {
		return fxType;
	}

	public void setFxType(Integer fxtype) {
		this.fxType = fxtype;
	}

	@Basic
	@Column(name = "GOTSCORE")
	public Integer getGotScore() {
		return gotScore;
	}

	public void setGotScore(Integer gotscore) {
		this.gotScore = gotscore;
	}

	@Basic
	@Column(name = "GOTSCORETYPE")
	public Integer getGotScoreType() {
		return gotScoreType;
	}

	public void setGotScoreType(Integer gotscoretype) {
		this.gotScoreType = gotscoretype;
	}

	@Basic
	@Column(name = "HASADDITION")
	public Byte getHasAddition() {
		return hasAddition;
	}

	public void setHasAddition(Byte hasaddition) {
		this.hasAddition = hasaddition;
	}

	@Basic
	@Column(name = "HASTOURJOURNEY")
	public Byte getHasTourJourney() {
		return hasTourJourney;
	}

	public void setHasTourJourney(Byte hastourjourney) {
		this.hasTourJourney = hastourjourney;
	}

	@Basic
	@Column(name = "HIDDEN")
	public Integer getHidden() {
		return hidden;
	}

	public void setHidden(Integer hidden) {
		this.hidden = hidden;
	}

	@Id
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Basic
	@Column(name = "KANJIA")
	public Byte getKanjia() {
		return kanjia;
	}

	public void setKanjia(Byte kanjia) {
		this.kanjia = kanjia;
	}

	@Basic
	@Column(name = "KANJIAPRICE")
	public Double getKanjiaPrice() {
		return kanjiaPrice;
	}

	public void setKanjiaPrice(Double kanjiaprice) {
		this.kanjiaPrice = kanjiaprice;
	}

	@Basic
	@Column(name = "LIMITATION")
	public Byte getLimitation() {
		return limitation;
	}

	public void setLimitation(Byte limitation) {
		this.limitation = limitation;
	}

	@Basic
	@Column(name = "LOGISTICSID")
	public Integer getLogisticsId() {
		return logisticsId;
	}

	public void setLogisticsId(Integer logisticsid) {
		this.logisticsId = logisticsid;
	}

	@Basic
	@Column(name = "MAXCOUPONS")
	public Integer getMaxCoupons() {
		return maxCoupons;
	}

	public void setMaxCoupons(Integer maxcoupons) {
		this.maxCoupons = maxcoupons;
	}

	@Basic
	@Column(name = "MIAOSHA")
	public Byte getMiaosha() {
		return miaosha;
	}

	public void setMiaosha(Byte miaosha) {
		this.miaosha = miaosha;
	}

	@Basic
	@Column(name = "MINBUYNUMBER")
	public Integer getMinBuyNumber() {
		return minBuyNumber;
	}

	public void setMinBuyNumber(Integer minbuynumber) {
		this.minBuyNumber = minbuynumber;
	}

	@Basic
	@Column(name = "MINPRICE")
	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minprice) {
		this.minPrice = minprice;
	}

	@Basic
	@Column(name = "MINSCORE")
	public Integer getMinScore() {
		return minScore;
	}

	public void setMinScore(Integer minscore) {
		this.minScore = minscore;
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
	@Column(name = "NUMBERFAV")
	public Integer getNumberFav() {
		return numberFav;
	}

	public void setNumberFav(Integer numberfav) {
		this.numberFav = numberfav;
	}

	@Basic
	@Column(name = "NUMBERGOODREPUTATION")
	public Integer getNumberGoodReputation() {
		return numberGoodReputation;
	}

	public void setNumberGoodReputation(Integer numbergoodreputation) {
		this.numberGoodReputation = numbergoodreputation;
	}

	@Basic
	@Column(name = "NUMBERORDERS")
	public Integer getNumberOrders() {
		return numberOrders;
	}

	public void setNumberOrders(Integer numberorders) {
		this.numberOrders = numberorders;
	}

	@Basic
	@Column(name = "NUMBERSELLS")
	public Integer getNumberSells() {
		return numberSells;
	}

	public void setNumberSells(Integer numbersells) {
		this.numberSells = numbersells;
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
	@Column(name = "OVERSEAS")
	public Byte getOverseas() {
		return overseas;
	}

	public void setOverseas(Byte overseas) {
		this.overseas = overseas;
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
	@Column(name = "PIC")
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Basic
	@Column(name = "PINGTUAN")
	public Byte getPingtuan() {
		return pingtuan;
	}

	public void setPingtuan(Byte pingtuan) {
		this.pingtuan = pingtuan;
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
	@Column(name = "PRICESHOPSELL")
	public Integer getPriceShopSell() {
		return priceShopSell;
	}

	public void setPriceShopSell(Integer priceshopsell) {
		this.priceShopSell = priceshopsell;
	}

	@Basic
	@Column(name = "PROPERTYIDS")
	public String getPropertyIds() {
		return propertyIds;
	}

	public void setPropertyIds(String propertyids) {
		this.propertyIds = propertyids;
	}

	@Basic
	@Column(name = "RECOMMENDSTATUS")
	public Integer getRecommendStatus() {
		return recommendStatus;
	}

	public void setRecommendStatus(Integer recommendstatus) {
		this.recommendStatus = recommendstatus;
	}

	@Basic
	@Column(name = "RECOMMENDSTATUSSTR")
	public String getRecommendStatusStr() {
		return recommendStatusStr;
	}

	public void setRecommendStatusStr(String recommendstatusstr) {
		this.recommendStatusStr = recommendstatusstr;
	}

	@Basic
	@Column(name = "SECKILLBUYNUMBER")
	public Integer getSeckillBuyNumber() {
		return seckillBuyNumber;
	}

	public void setSeckillBuyNumber(Integer seckillbuynumber) {
		this.seckillBuyNumber = seckillbuynumber;
	}

	@Basic
	@Column(name = "SELLEND")
	public Byte getSellEnd() {
		return sellEnd;
	}

	public void setSellEnd(Byte sellend) {
		this.sellEnd = sellend;
	}

	@Basic
	@Column(name = "SELLSTART")
	public Byte getSellStart() {
		return sellStart;
	}

	public void setSellStart(Byte sellstart) {
		this.sellStart = sellstart;
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
	@Column(name = "STATUS")
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
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
	@Column(name = "STOREALERT")
	public Byte getStoreAlert() {
		return storeAlert;
	}

	public void setStoreAlert(Byte storealert) {
		this.storeAlert = storealert;
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
	@Column(name = "STORES0UNSALE")
	public Byte getStores0Unsale() {
		return stores0Unsale;
	}

	public void setStores0Unsale(Byte stores0Unsale) {
		this.stores0Unsale = stores0Unsale;
	}

	@Basic
	@Column(name = "TAGS")
	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Basic
	@Column(name = "TYPE")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Basic
	@Column(name = "UNIT")
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Basic
	@Column(name = "UNUSEFULNUMBER")
	public Integer getUnusefulNumber() {
		return unusefulNumber;
	}

	public void setUnusefulNumber(Integer unusefulnumber) {
		this.unusefulNumber = unusefulnumber;
	}

	@Basic
	@Column(name = "USEFULNUMBER")
	public Integer getUsefulNumber() {
		return usefulNumber;
	}

	public void setUsefulNumber(Integer usefulnumber) {
		this.usefulNumber = usefulnumber;
	}

	@Basic
	@Column(name = "USERID")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userid) {
		this.userId = userid;
	}

	@Basic
	@Column(name = "VETSTATUS")
	public Integer getVetStatus() {
		return vetStatus;
	}

	public void setVetStatus(Integer vetstatus) {
		this.vetStatus = vetstatus;
	}

	@Basic
	@Column(name = "VIEWS")
	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	@Basic
	@Column(name = "WEIGHT")
	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Basic
	@Column(name = "BRANDID")
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WeAppGoods that = (WeAppGoods) o;
		return Objects.equals(afterSale, that.afterSale) &&
				Objects.equals(categoryId, that.categoryId) &&
				Objects.equals(commission, that.commission) &&
				Objects.equals(commissionSettleType, that.commissionSettleType) &&
				Objects.equals(commissionType, that.commissionType) &&
				Objects.equals(commissionUserType, that.commissionUserType) &&
				Objects.equals(dateAdd, that.dateAdd) &&
				Objects.equals(dateUpdate, that.dateUpdate) &&
				Objects.equals(fxType, that.fxType) &&
				Objects.equals(gotScore, that.gotScore) &&
				Objects.equals(gotScoreType, that.gotScoreType) &&
				Objects.equals(hasAddition, that.hasAddition) &&
				Objects.equals(hasTourJourney, that.hasTourJourney) &&
				Objects.equals(hidden, that.hidden) &&
				Objects.equals(id, that.id) &&
				Objects.equals(kanjia, that.kanjia) &&
				Objects.equals(kanjiaPrice, that.kanjiaPrice) &&
				Objects.equals(limitation, that.limitation) &&
				Objects.equals(logisticsId, that.logisticsId) &&
				Objects.equals(maxCoupons, that.maxCoupons) &&
				Objects.equals(miaosha, that.miaosha) &&
				Objects.equals(minBuyNumber, that.minBuyNumber) &&
				Objects.equals(minPrice, that.minPrice) &&
				Objects.equals(minScore, that.minScore) &&
				Objects.equals(name, that.name) &&
				Objects.equals(numberFav, that.numberFav) &&
				Objects.equals(numberGoodReputation, that.numberGoodReputation) &&
				Objects.equals(numberOrders, that.numberOrders) &&
				Objects.equals(numberSells, that.numberSells) &&
				Objects.equals(originalPrice, that.originalPrice) &&
				Objects.equals(overseas, that.overseas) &&
				Objects.equals(paixu, that.paixu) &&
				Objects.equals(pic, that.pic) &&
				Objects.equals(pingtuan, that.pingtuan) &&
				Objects.equals(pingtuanPrice, that.pingtuanPrice) &&
				Objects.equals(priceShopSell, that.priceShopSell) &&
				Objects.equals(propertyIds, that.propertyIds) &&
				Objects.equals(recommendStatus, that.recommendStatus) &&
				Objects.equals(recommendStatusStr, that.recommendStatusStr) &&
				Objects.equals(seckillBuyNumber, that.seckillBuyNumber) &&
				Objects.equals(sellEnd, that.sellEnd) &&
				Objects.equals(sellStart, that.sellStart) &&
				Objects.equals(shopId, that.shopId) &&
				Objects.equals(status, that.status) &&
				Objects.equals(statusStr, that.statusStr) &&
				Objects.equals(storeAlert, that.storeAlert) &&
				Objects.equals(stores, that.stores) &&
				Objects.equals(stores0Unsale, that.stores0Unsale) &&
				Objects.equals(tags, that.tags) &&
				Objects.equals(type, that.type) &&
				Objects.equals(unit, that.unit) &&
				Objects.equals(unusefulNumber, that.unusefulNumber) &&
				Objects.equals(usefulNumber, that.usefulNumber) &&
				Objects.equals(userId, that.userId) &&
				Objects.equals(vetStatus, that.vetStatus) &&
				Objects.equals(views, that.views) &&
				Objects.equals(weight, that.weight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(afterSale, categoryId, commission, commissionSettleType, commissionType, commissionUserType, dateAdd, dateUpdate, fxType, gotScore, gotScoreType, hasAddition, hasTourJourney, hidden, id, kanjia, kanjiaPrice, limitation, logisticsId, maxCoupons, miaosha, minBuyNumber, minPrice, minScore, name, numberFav, numberGoodReputation, numberOrders, numberSells, originalPrice, overseas, paixu, pic, pingtuan, pingtuanPrice, priceShopSell, propertyIds, recommendStatus, recommendStatusStr, seckillBuyNumber, sellEnd, sellStart, shopId, status, statusStr, storeAlert, stores, stores0Unsale, tags, type, unit, unusefulNumber, usefulNumber, userId, vetStatus, views, weight);
	}
}
