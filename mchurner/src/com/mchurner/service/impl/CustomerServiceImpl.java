package com.mchurner.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.mchurner.beans.ResponseBean;
import com.mchurner.beans.customer.CustPersonalDetailsBean;
import com.mchurner.beans.customer.CustShareDetails;
import com.mchurner.beans.customer.FDAccountBean;
import com.mchurner.dao.CustomerDao;
import com.mchurner.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao customerDao;
	
	@Override
	public ResponseBean storeSignupDetails(CustPersonalDetailsBean personalDetBean) {
		ResponseBean resp;
		//TODO: Do validations
		boolean stored = customerDao.saveCustomerSignupDetails(personalDetBean);	
		if(stored){
			resp = new ResponseBean(HttpStatus.OK.value(), "Data stored");
		}else{
			resp = new ResponseBean(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error saving data");
		}
		return resp;
	}

	@Override
	public ResponseBean storePersonalDetails(CustPersonalDetailsBean personalDetBean) {
		ResponseBean resp;
		//TODO: Do validations
		boolean stored = customerDao.saveCustomerPersonalDetails(personalDetBean);	
		if(stored){
			resp = new ResponseBean(HttpStatus.OK.value(), "Data saved");
		}else{
			resp = new ResponseBean(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error saving data");
		}
		return resp;
	}
	
	@Override
	public ResponseBean storeShareDetails(CustShareDetails shareDetBean) {
		ResponseBean resp;
		//TODO: Do validations
		boolean stored = customerDao.saveCustomerShareDetails(shareDetBean);	
		if(stored){
			resp = new ResponseBean(HttpStatus.OK.value(), "Data saved");
		}else{
			resp = new ResponseBean(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error saving data");
		}
		return resp;
	}
	
	@Override
	public List<CustShareDetails> getShareDetails(String custId) {
		ResponseBean resp;
		List<CustShareDetails> shreBean = customerDao.getShareDetails(custId);	
		return shreBean;
	}
	
	@Override
	public List<FDAccountBean> getFDDetails(String custId) {
		ResponseBean resp;
		List<FDAccountBean> fdBean = customerDao.getFDDetails(custId);	
		return fdBean;
	}
}
