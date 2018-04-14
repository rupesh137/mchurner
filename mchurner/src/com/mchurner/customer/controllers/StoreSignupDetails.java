package com.mchurner.customer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mchurner.beans.ResponseBean;
import com.mchurner.beans.customer.CustPersonalDetailsBean;
import com.mchurner.beans.customer.CustShareDetails;
import com.mchurner.service.CustomerService;

@Controller
public class StoreSignupDetails {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/storeSignupDet", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseBean storeSignupDetails(@RequestBody CustPersonalDetailsBean personalDetBean){
		ResponseBean bean = customerService.storeSignupDetails(personalDetBean);
		return bean;
	}
	
	@RequestMapping(value = "/storePersoalDet", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseBean storePersonalDetails(@RequestBody CustPersonalDetailsBean personalDetBean){
		ResponseBean bean = customerService.storePersonalDetails(personalDetBean);
		return bean;
	}
	
	@RequestMapping(value = "/storeShareDet", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseBean storeShareDetails(@RequestBody CustShareDetails shareDet){
		ResponseBean bean = customerService.storeShareDetails(shareDet);
		return bean;
	}
	
}
