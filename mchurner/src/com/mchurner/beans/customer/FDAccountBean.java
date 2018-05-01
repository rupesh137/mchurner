package com.mchurner.beans.customer;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mchurner.utils.JsonDateSerializer;

public class FDAccountBean extends BaseBean{
	private Integer fdAccId;
	private Integer custId;
	private String accountNo;
	private Integer tenure;
	@JsonSerialize (using = JsonDateSerializer.class)
	private Date startDate;
	@JsonSerialize (using = JsonDateSerializer.class)
	private Date maturityDate;
	private BigDecimal interestRate;
	private BigDecimal depositAmt;
	private Integer schemeId;
	
	public Integer getFdAccId() {
		return fdAccId;
	}
	public void setFdAccId(Integer fdAccId) {
		this.fdAccId = fdAccId;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	public BigDecimal getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt(BigDecimal depositAmt) {
		this.depositAmt = depositAmt;
	}
	public Integer getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(Integer schemeId) {
		this.schemeId = schemeId;
	}
	
	
}
