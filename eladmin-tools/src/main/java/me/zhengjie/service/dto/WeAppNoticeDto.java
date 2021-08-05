package me.zhengjie.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @ClassName WeAppCouponsDto
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/3 21:53
 * @Version 1.0
 **/
@Getter
@Setter
public class WeAppNoticeDto {
	private Timestamp dateAdd;
	private Timestamp dateUpdate;
	private String id;
	private Byte isShow;
	private String title;
	private String userId;
}
