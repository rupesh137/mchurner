package com.mchurner.beans.customer;

import java.math.BigDecimal;
import java.util.Date;
import com.mchurner.utils.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class FDAccountBean extends BaseBean{
	private int fdAccId;
	private int custId;
	private String accountNo;
	private int tenure;
	//TODO:Not working
	//@JsonSerialize (using = JsonDateSerializer.class)
	private Date startDate;
	//@JsonSerialize (using = JsonDateSerializer.class)
	private Date maturityDate;
	private float interestRate;
	private BigDecimal depositAmt;
	public int getFdAccId() {
		return fdAccId;
	}
	public void setFdAccId(int fdAccId) {
		this.fdAccId = fdAccId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
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
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public BigDecimal getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt(BigDecimal depositAmt) {
		this.depositAmt = depositAmt;
	}
	
	
}
