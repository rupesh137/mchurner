package com.mchurner.customer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mchurner.beans.customer.CustShareDetails;
import com.mchurner.beans.customer.FDAccountBean;
import com.mchurner.service.CustAccountService;
import com.mchurner.service.CustomerService;

@Controller
public class GetCustomerDetails {
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CustAccountService accountService;
	
	@RequestMapping(value = "/getShareDetails/{custId}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<CustShareDetails> getAllShareDetails(@PathVariable("custId") String custId){
		return  customerService.getShareDetails(custId);
	}
	
	@RequestMapping(value = "/getFDDetails/{custId}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<FDAccountBean> getAllFDDetails(@PathVariable("custId") String custId){
		return  customerService.getFDDetails(custId);
	}
}
