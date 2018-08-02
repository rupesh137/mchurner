package com.mchurner.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MchurnerUtils {
	static Logger logger=Logger.getLogger("com.mchurner.utils.MchurnerUtils");
	static Map<String,String> idPageMapping = new HashMap<String,String>();
	static{
		idPageMapping.put("aboutus", "aboutus");
		idPageMapping.put("contactus", "contactus");
		idPageMapping.put("fd", "ourproducts_fd");
		idPageMapping.put("rd", "ourproducts_recurring");
		idPageMapping.put("loan", "ourproducts_loan");
		idPageMapping.put("goldLoan", "gold_loan");
		idPageMapping.put("mortLoan", "mortgage _loan");
		idPageMapping.put("policyLoan", "Loan_against_LIC_Policy");
		idPageMapping.put("vehicleLoan", "vehicle_loan");
	}
	public static String generateFDAccId(int fdId){
		String accountId = "FD" + String.format("%010d", fdId);
		return accountId;
	}
	
	public static String generateRDAccId(int rdId){
		String accountId = "RD" + String.format("%010d", rdId);
		return accountId;
	}
	
	public static String getPageForId(String id){
		return idPageMapping.get(id);
	}
}
