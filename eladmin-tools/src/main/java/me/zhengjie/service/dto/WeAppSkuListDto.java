package me.zhengjie.service.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName WeAppSkuListDto
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/7 0:01
 * @Version 1.0
 **/
@Getter
@Setter
public class WeAppSkuListDto {

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
}
