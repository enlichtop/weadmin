package me.zhengjie.service.dto;

import lombok.Getter;
import lombok.Setter;
import me.zhengjie.base.BaseDTO;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @ClassName WeAppGoodsDto
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/2 22:23
 * @Version 1.0
 **/
@Getter
@Setter
public class WeAppGoodsDto extends BaseDTO implements Serializable {

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
}
