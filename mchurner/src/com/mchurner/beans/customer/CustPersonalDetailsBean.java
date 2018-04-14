package com.mchurner.beans.customer;

import java.util.Date;

public class CustPersonalDetailsBean {
	private int custId;
	private String showCustId;
	private String firstName;
	private String lastName;
	private String password;
	private String mobileNo;
	private String phoneNo;
	private String emailId;
	private Date birthDate;
	private String gender;
	private String panNo;
	private String adharNo;
	private String referrerCode;
	private String nominee_name;
	private String nomineeRelation;
	private String nomineeAge;
	private AddressBean mailingAddress;
	private AddressBean permanentAddress; 
	private AddressBean companyAddress;
	private String companyName;
	private String companyContactNo;
	private String department;
	private String designation;
	private String workExp;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getShowCustId() {
		return showCustId;
	}
	public void setShowCustId(String showCustId) {
		this.showCustId = showCustId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getReferrerCode() {
		return referrerCode;
	}
	public void setReferrerCode(String referrerCode) {
		this.referrerCode = referrerCode;
	}
	public String getNominee_name() {
		return nominee_name;
	}
	public void setNominee_name(String nominee_name) {
		this.nominee_name = nominee_name;
	}
	public String getNomineeRelation() {
		return nomineeRelation;
	}
	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}
	public String getNomineeAge() {
		return nomineeAge;
	}
	public void setNomineeAge(String nomineeAge) {
		this.nomineeAge = nomineeAge;
	}
		
	public AddressBean getMailingAddress() {
			return mailingAddress;
	}
	public void setMailingAddress(AddressBean mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	public AddressBean getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(AddressBean permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public AddressBean getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(AddressBean companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyContactNo() {
		return companyContactNo;
	}
	public void setCompanyContactNo(String companyContactNo) {
		this.companyContactNo = companyContactNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getWorkExp() {
		return workExp;
	}
	public void setWorkExp(String workExp) {
		this.workExp = workExp;
	}
	
	
	
}
