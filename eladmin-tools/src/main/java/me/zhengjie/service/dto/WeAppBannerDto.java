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
}
