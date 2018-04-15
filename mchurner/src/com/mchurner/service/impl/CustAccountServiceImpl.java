package com.mchurner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.mchurner.beans.ResponseBean;
import com.mchurner.beans.customer.FDAccountBean;
import com.mchurner.dao.CustAccountDao;
import com.mchurner.service.CustAccountService;

public class CustAccountServiceImpl implements CustAccountService {
	@Autowired
	CustAccountDao accDao;
	
	@Override
	public ResponseBean createFDAcc(FDAccountBean fdBean) {
		ResponseBean resp;
		//TODO: Do validations
		boolean stored = accDao.createFDAcc(fdBean);	
		if(stored){
			resp = new ResponseBean(HttpStatus.OK.value(), "Data saved");
		}else{
			resp = new ResponseBean(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error saving data");
		}
		return resp;
	}
	
}
