package me.zhengjie.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @ClassName WeAppBannerDto
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/28 22:59
 * @Version 1.0
 **/
@Getter
@Setter
public class WeAppBannerDto {
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
}
