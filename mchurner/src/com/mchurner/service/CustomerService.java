package com.mchurner.service;

import java.util.List;

import com.mchurner.beans.ResponseBean;
import com.mchurner.beans.customer.CustPersonalDetailsBean;
import com.mchurner.beans.customer.CustShareDetails;
import com.mchurner.beans.customer.FDAccountBean;

public interface CustomerService {
	ResponseBean storeSignupDetails(CustPersonalDetailsBean personalDetBean);
	ResponseBean storePersonalDetails(CustPersonalDetailsBean personalDetBean);
	ResponseBean storeShareDetails(CustShareDetails shareDetBean);
	List<CustShareDetails> getShareDetails(String custId);
	List<FDAccountBean> getFDDetails(String custId);
}
