package com.mchurner.customer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mchurner.beans.ResponseBean;
import com.mchurner.beans.customer.FDAccountBean;
import com.mchurner.service.CustAccountService;

@Controller
public class CustAccounts {

	@Autowired
	CustAccountService accountService;
	
	@RequestMapping(value = "/createFDAcc", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseBean storeFDDetails(@RequestBody FDAccountBean fdBean){
		ResponseBean bean = accountService.createFDAcc(fdBean);
		return bean;
	}
}
