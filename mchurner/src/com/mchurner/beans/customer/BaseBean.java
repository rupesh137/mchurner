package com.mchurner.beans.customer;

import java.util.Date;
public class BaseBean {
	private Date CreatedOn;
	private String status;
	private Date ModifiedOn;
	public Date getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}
	public Date getModifiedOn() {
		return ModifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		ModifiedOn = modifiedOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
