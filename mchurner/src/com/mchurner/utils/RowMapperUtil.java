package com.mchurner.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.mchurner.beans.customer.CustShareDetails;

public class RowMapperUtil {
	
	static Logger logger=Logger.getLogger("com.mchurner.utils.RowMapperUtil");
	
	
	public static List<CustShareDetails> getShareList(List<Map<String, Object>> rows){
		List<CustShareDetails> shareList = new ArrayList<CustShareDetails>();
		CustShareDetails shareDet = new CustShareDetails();
		if(rows != null && rows.size()>0){
			for (Map<String, Object> row : rows) {
				shareDet = new CustShareDetails();
				shareDet.setShareId((int) row.get("share_id"));
				shareDet.setNoOfShare((int) row.get("no_of_share"));
				shareDet.setEachSharePrice((BigDecimal) row.get("each_share_price"));
				shareDet.setCustId((int) row.get("cust_id"));
				shareDet.setPurchaseDate((Date) row.get("purchase_date"));
				shareDet.setStatus((String) row.get("record_status"));
				shareList.add(shareDet);
			}
		}
		return shareList;
	}
}
