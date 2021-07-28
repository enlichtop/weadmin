package me.zhengjie.domain.vo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @ClassName KeyValueVo
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/26 22:57
 * @Version 1.0
 **/
@Getter
@Setter
public class KeyValueVo {
	private String key;
	private Object value;
	private String remark;
	private Timestamp updateTime;
}
