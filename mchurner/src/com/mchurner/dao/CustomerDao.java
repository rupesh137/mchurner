package com.mchurner.dao;

import java.util.List;

import com.mchurner.beans.customer.CustPersonalDetailsBean;
import com.mchurner.beans.customer.CustShareDetails;
import com.mchurner.beans.customer.FDAccountBean;

public interface CustomerDao {
	boolean saveCustomerSignupDetails(CustPersonalDetailsBean personalDetBean);
	boolean saveCustomerPersonalDetails(CustPersonalDetailsBean personalDetBean);
	boolean saveCustomerProfessionalDetails(CustPersonalDetailsBean personalDetBean);
	boolean saveCustomerShareDetails(CustShareDetails shareDetBean);
	List<CustShareDetails> getShareDetails(String custId);
	List<FDAccountBean> getFDDetails(String custId);
}
