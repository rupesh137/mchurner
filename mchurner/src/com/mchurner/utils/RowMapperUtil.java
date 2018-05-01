package com.mchurner.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.mchurner.beans.customer.CustShareDetails;
import com.mchurner.beans.customer.FDAccountBean;

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
	
	public static List<FDAccountBean> getFDDetailList(List<Map<String, Object>> rows){
		List<FDAccountBean> fdList = new ArrayList<FDAccountBean>();
		FDAccountBean FDDet = new FDAccountBean();
		if(rows != null && rows.size()>0){
			for (Map<String, Object> row : rows) {
				FDDet = new FDAccountBean();
				FDDet.setFdAccId((Integer) row.get("fd_acc_id"));
				FDDet.setAccountNo((String) row.get("fd_account_no"));
				FDDet.setTenure((Integer) row.get("deposit_term"));
				FDDet.setCustId((Integer) row.get("cust_id"));
				FDDet.setStartDate((Date) row.get("start_date"));
				FDDet.setMaturityDate((Date) row.get("maturity_date"));
				FDDet.setInterestRate((BigDecimal) row.get("interest_rate"));
				FDDet.setDepositAmt((BigDecimal) row.get("deposit_amount"));
				FDDet.setStatus((String) row.get("record_status"));
				FDDet.setSchemeId((Integer)row.get("scheme_master_id"));
				fdList.add(FDDet);
			}
		}
		return fdList;
	}
}
