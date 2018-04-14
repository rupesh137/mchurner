package com.mchurner.customer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mchurner.beans.customer.CustShareDetails;
import com.mchurner.service.CustomerService;

@Controller
public class GetCustomerDetails {
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/getShareDetails", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<CustShareDetails> getAllShareDetails(@RequestParam(value = "custId") String custId){
		return  customerService.getShareDetails(custId);
	}
}
