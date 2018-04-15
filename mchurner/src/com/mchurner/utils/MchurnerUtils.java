package com.mchurner.utils;

import java.util.logging.Logger;

public class MchurnerUtils {
	static Logger logger=Logger.getLogger("com.mchurner.utils.MchurnerUtils");
	
	public static String generateFDAccId(int fdId){
		String accountId = "FD" + String.format("%010d", fdId);
		return accountId;
	}
	
	public static String generateRDAccId(int rdId){
		String accountId = "RD" + String.format("%010d", rdId);
		return accountId;
	}
}
