package com.mchurner.customer.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mchurner.utils.MchurnerUtils;

@Controller
public class HomePageController {

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public ModelAndView showHomePage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("customer/home");
		return mav;
	}
	
	
	@RequestMapping(value = {"/pages/{pageId}"}, method = RequestMethod.GET)
	public String serveStaticPage(@PathVariable(value="pageId") String pageId) {
		String page = MchurnerUtils.getPageForId(pageId);
		return "customer/"+page;
	}
}
