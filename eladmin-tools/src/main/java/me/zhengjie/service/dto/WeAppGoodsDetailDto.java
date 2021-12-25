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
public class WeAppGoodsDetailDto extends BaseDTO implements Serializable {

	private String id;
	private String contentDetails;
	private String goodsProperties;
}
