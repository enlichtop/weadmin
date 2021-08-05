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
public class WeAppCouponsDto {
	private Timestamp dateAdd;
	private Integer dateEndDays;
	private Integer dateEndType;
	private Integer dateStartType;
	private Timestamp dateUpDate;
	private String id;
	private Integer moneyHreshold;
	private Double moneyMax;
	private Double moneyMin;
	private Integer moneyType;
	private String name;
	private Integer needAmount;
	private Integer needScore;
	private Integer needSignedContinuous;
	private Integer numberGit;
	private Integer numberGitNumber;
	private Integer numberLeft;
	private Integer numberPersonMax;
	private Integer numberTotle;
	private Integer numberUsed;
	private String pwd;
	private Byte sendBirthday;
	private Byte sendInviteM;
	private Byte sendInviteS;
	private Byte sendRegister;
	private Byte showInFront;
	private Integer status;
	private String statusStr;
}
