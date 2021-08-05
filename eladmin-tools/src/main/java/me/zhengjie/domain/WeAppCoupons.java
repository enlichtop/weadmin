package me.zhengjie.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName WepappCouponsEntity
 * @Description TODO
 * @Author lichen
 * @Date 2021/8/3 21:48
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "WEPAPP_COUPONS", schema = "eladmin")
public class WeAppCoupons {
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

	@Basic
	@Column(name = "DATEADD")
	public Timestamp getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(Timestamp dateadd) {
		this.dateAdd = dateadd;
	}

	@Basic
	@Column(name = "DATEENDDAYS")
	public Integer getDateEndDays() {
		return dateEndDays;
	}

	public void setDateEndDays(Integer dateenddays) {
		this.dateEndDays = dateenddays;
	}

	@Basic
	@Column(name = "DATEENDTYPE")
	public Integer getDateEndType() {
		return dateEndType;
	}

	public void setDateEndType(Integer dateendtype) {
		this.dateEndType = dateendtype;
	}

	@Basic
	@Column(name = "DATESTARTTYPE")
	public Integer getDateStartType() {
		return dateStartType;
	}

	public void setDateStartType(Integer datestarttype) {
		this.dateStartType = datestarttype;
	}

	@Basic
	@Column(name = "DATEUPDATE")
	public Timestamp getDateUpDate() {
		return dateUpDate;
	}

	public void setDateUpDate(Timestamp dateupdate) {
		this.dateUpDate = dateupdate;
	}

	@Id
	@Column(name = "ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Basic
	@Column(name = "MONEYHRESHOLD")
	public Integer getMoneyHreshold() {
		return moneyHreshold;
	}

	public void setMoneyHreshold(Integer moneyhreshold) {
		this.moneyHreshold = moneyhreshold;
	}

	@Basic
	@Column(name = "MONEYMAX")
	public Double getMoneyMax() {
		return moneyMax;
	}

	public void setMoneyMax(Double moneymax) {
		this.moneyMax = moneymax;
	}

	@Basic
	@Column(name = "MONEYMIN")
	public Double getMoneyMin() {
		return moneyMin;
	}

	public void setMoneyMin(Double moneymin) {
		this.moneyMin = moneymin;
	}

	@Basic
	@Column(name = "MONEYTYPE")
	public Integer getMoneyType() {
		return moneyType;
	}

	public void setMoneyType(Integer moneytype) {
		this.moneyType = moneytype;
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
	@Column(name = "NEEDAMOUNT")
	public Integer getNeedAmount() {
		return needAmount;
	}

	public void setNeedAmount(Integer needamount) {
		this.needAmount = needamount;
	}

	@Basic
	@Column(name = "NEEDSCORE")
	public Integer getNeedScore() {
		return needScore;
	}

	public void setNeedScore(Integer needscore) {
		this.needScore = needscore;
	}

	@Basic
	@Column(name = "NEEDSIGNEDCONTINUOUS")
	public Integer getNeedSignedContinuous() {
		return needSignedContinuous;
	}

	public void setNeedSignedContinuous(Integer needsignedcontinuous) {
		this.needSignedContinuous = needsignedcontinuous;
	}

	@Basic
	@Column(name = "NUMBERGIT")
	public Integer getNumberGit() {
		return numberGit;
	}

	public void setNumberGit(Integer numbergit) {
		this.numberGit = numbergit;
	}

	@Basic
	@Column(name = "NUMBERGITNUMBER")
	public Integer getNumberGitNumber() {
		return numberGitNumber;
	}

	public void setNumberGitNumber(Integer numbergitnumber) {
		this.numberGitNumber = numbergitnumber;
	}

	@Basic
	@Column(name = "NUMBERLEFT")
	public Integer getNumberLeft() {
		return numberLeft;
	}

	public void setNumberLeft(Integer numberleft) {
		this.numberLeft = numberleft;
	}

	@Basic
	@Column(name = "NUMBERPERSONMAX")
	public Integer getNumberPersonMax() {
		return numberPersonMax;
	}

	public void setNumberPersonMax(Integer numberpersonmax) {
		this.numberPersonMax = numberpersonmax;
	}

	@Basic
	@Column(name = "NUMBERTOTLE")
	public Integer getNumberTotle() {
		return numberTotle;
	}

	public void setNumberTotle(Integer numbertotle) {
		this.numberTotle = numbertotle;
	}

	@Basic
	@Column(name = "NUMBERUSED")
	public Integer getNumberUsed() {
		return numberUsed;
	}

	public void setNumberUsed(Integer numberused) {
		this.numberUsed = numberused;
	}

	@Basic
	@Column(name = "PWD")
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Basic
	@Column(name = "SENDBIRTHDAY")
	public Byte getSendBirthday() {
		return sendBirthday;
	}

	public void setSendBirthday(Byte sendbirthday) {
		this.sendBirthday = sendbirthday;
	}

	@Basic
	@Column(name = "SENDINVITEM")
	public Byte getSendInviteM() {
		return sendInviteM;
	}

	public void setSendInviteM(Byte sendinvitem) {
		this.sendInviteM = sendinvitem;
	}

	@Basic
	@Column(name = "SENDINVITES")
	public Byte getSendInviteS() {
		return sendInviteS;
	}

	public void setSendInviteS(Byte sendinvites) {
		this.sendInviteS = sendinvites;
	}

	@Basic
	@Column(name = "SENDREGISTER")
	public Byte getSendRegister() {
		return sendRegister;
	}

	public void setSendRegister(Byte sendregister) {
		this.sendRegister = sendregister;
	}

	@Basic
	@Column(name = "SHOWINFRONT")
	public Byte getShowInFront() {
		return showInFront;
	}

	public void setShowInFront(Byte showinfront) {
		this.showInFront = showinfront;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WeAppCoupons that = (WeAppCoupons) o;
		return Objects.equals(dateAdd, that.dateAdd) &&
				Objects.equals(dateEndDays, that.dateEndDays) &&
				Objects.equals(dateEndType, that.dateEndType) &&
				Objects.equals(dateStartType, that.dateStartType) &&
				Objects.equals(dateUpDate, that.dateUpDate) &&
				Objects.equals(id, that.id) &&
				Objects.equals(moneyHreshold, that.moneyHreshold) &&
				Objects.equals(moneyMax, that.moneyMax) &&
				Objects.equals(moneyMin, that.moneyMin) &&
				Objects.equals(moneyType, that.moneyType) &&
				Objects.equals(name, that.name) &&
				Objects.equals(needAmount, that.needAmount) &&
				Objects.equals(needScore, that.needScore) &&
				Objects.equals(needSignedContinuous, that.needSignedContinuous) &&
				Objects.equals(numberGit, that.numberGit) &&
				Objects.equals(numberGitNumber, that.numberGitNumber) &&
				Objects.equals(numberLeft, that.numberLeft) &&
				Objects.equals(numberPersonMax, that.numberPersonMax) &&
				Objects.equals(numberTotle, that.numberTotle) &&
				Objects.equals(numberUsed, that.numberUsed) &&
				Objects.equals(pwd, that.pwd) &&
				Objects.equals(sendBirthday, that.sendBirthday) &&
				Objects.equals(sendInviteM, that.sendInviteM) &&
				Objects.equals(sendInviteS, that.sendInviteS) &&
				Objects.equals(sendRegister, that.sendRegister) &&
				Objects.equals(showInFront, that.showInFront) &&
				Objects.equals(status, that.status) &&
				Objects.equals(statusStr, that.statusStr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateAdd, dateEndDays, dateEndType, dateStartType, dateUpDate, id, moneyHreshold, moneyMax, moneyMin, moneyType, name, needAmount, needScore, needSignedContinuous, numberGit, numberGitNumber, numberLeft, numberPersonMax, numberTotle, numberUsed, pwd, sendBirthday, sendInviteM, sendInviteS, sendRegister, showInFront, status, statusStr);
	}
}
