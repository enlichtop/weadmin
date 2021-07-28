package me.zhengjie.service.dto;

import lombok.Getter;
import lombok.Setter;
import me.zhengjie.base.BaseDTO;

import java.io.Serializable;

/**
 * @ClassName WeAppConfigDto
 * @Description TODO
 * @Author lichen
 * @Date 2021/7/28 21:52
 * @Version 1.0
 **/
@Getter
@Setter
public class WeAppConfigDto extends BaseDTO implements Serializable {

	private String id;

	private String configId;

	private String configName;

	private String configDesc;
}
