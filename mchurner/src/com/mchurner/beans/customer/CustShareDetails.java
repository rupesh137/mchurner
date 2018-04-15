package com.mchurner.beans.customer;

import java.math.BigDecimal;
import java.util.Date;

public class CustShareDetails extends BaseBean{
	private int shareId;
	private int custId;
	private int noOfShare;
	private BigDecimal eachSharePrice;
	private Date purchaseDate;
	
	public int getShareId() {
		return shareId;
	}
	public void setShareId(int shareId) {
		this.shareId = shareId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getNoOfShare() {
		return noOfShare;
	}
	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}
	public BigDecimal getEachSharePrice() {
		return eachSharePrice;
	}
	public void setEachSharePrice(BigDecimal eachSharePrice) {
		this.eachSharePrice = eachSharePrice;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}	
}
