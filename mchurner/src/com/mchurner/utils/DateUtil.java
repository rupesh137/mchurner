package com.mchurner.utils;

import org.apache.log4j.Logger;



public class DateUtil {
	static Logger logger = Logger
			.getLogger("com.mchurner.utils.DateUtil");

	public static java.sql.Timestamp getCurrentSQLTimeStamp() {
		return new java.sql.Timestamp(System.currentTimeMillis());
	}
	

}
