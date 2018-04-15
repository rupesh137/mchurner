package com.mchurner.beans.customer;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseBean {
	@JsonIgnore private Date createdOn;
	@JsonIgnore private String status;
	@JsonIgnore private Date modifiedOn;
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
