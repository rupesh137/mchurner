package com.mchurner.beans.customer;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mchurner.utils.JsonDateSerializer;

public class CustShareDetails extends BaseBean{
	private Integer shareId;
	private Integer custId;
	private Integer noOfShare;
	private BigDecimal eachSharePrice;
	@JsonSerialize (using = JsonDateSerializer.class)
	private Date purchaseDate;
	
	public Integer getShareId() {
		return shareId;
	}
	public void setShareId(Integer shareId) {
		this.shareId = shareId;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public Integer getNoOfShare() {
		return noOfShare;
	}
	public void setNoOfShare(Integer noOfShare) {
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
