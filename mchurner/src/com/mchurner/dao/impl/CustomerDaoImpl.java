package com.mchurner.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.mchurner.beans.customer.AddressBean;
import com.mchurner.beans.customer.CustPersonalDetailsBean;
import com.mchurner.beans.customer.CustShareDetails;
import com.mchurner.beans.customer.FDAccountBean;
import com.mchurner.constants.GeneralConstants;
import com.mchurner.constants.MchurnerConstants;
import com.mchurner.dao.CustomerDao;
import com.mchurner.utils.DateUtil;
import com.mchurner.utils.RowMapperUtil;

public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean saveCustomerSignupDetails(CustPersonalDetailsBean personalDetBean) {
		String query = "insert into CUSTOMER_MASTER(first_name, last_name, mobile_no, email_id, Referrer_code,password, created_on, customer_status)"
				+ "values(?,?,?,?,?,?,?,?)";
		int count = jdbcTemplate.update(query, personalDetBean.getFirstName(),personalDetBean.getLastName(),personalDetBean.getMobileNo(),
				personalDetBean.getEmailId(),personalDetBean.getReferrerCode(), personalDetBean.getPassword(), DateUtil.getCurrentSQLTimeStamp(),MchurnerConstants.CUST_STATUS_SIGNUP);
		return count>0;
	}

	@Override
	@Transactional
	public boolean saveCustomerPersonalDetails(CustPersonalDetailsBean personalDetBean) {
		String query = "update CUSTOMER_MASTER set first_name = ?, last_name = ?, mobile_no=?, email_id=?, birth_date=?, nominee_name=?, relation_with_nominee=?, nominee_age=?, updated_on=?,Update_reason=? where cust_id=? ";
		int count = jdbcTemplate.update(query, personalDetBean.getFirstName(),personalDetBean.getLastName(),personalDetBean.getMobileNo(),
				personalDetBean.getEmailId(),personalDetBean.getBirthDate(),personalDetBean.getNominee_name(),personalDetBean.getNomineeRelation(),
				personalDetBean.getNomineeAge(), DateUtil.getCurrentSQLTimeStamp(),"Personal details Added",personalDetBean.getCustId());
		
		String addressQuery = "insert into customer_address(cust_id,room_no,building_name,road_name,landmark,city,state,pincode,address_type,created_on)"
				+ "values(?,?,?,?,?,?,?,?,?,?)";
		
		AddressBean mailAdd = personalDetBean.getMailingAddress();
		AddressBean permanentAdd = personalDetBean.getPermanentAddress();
		List<Object[]> inputListFinalList = new ArrayList<Object[]>();
		List<Object> inputList= new ArrayList<Object>();
		
		//Mailing Address
		inputList.add(personalDetBean.getCustId());
		inputList.add(mailAdd.getRoom_no());
		inputList.add(mailAdd.getBuilding_name());
		inputList.add(mailAdd.getRoad_name());
		inputList.add(mailAdd.getLandmark());
		inputList.add(mailAdd.getCity());
		inputList.add(mailAdd.getState());
		inputList.add(mailAdd.getPincode());
		inputList.add(MchurnerConstants.ADDRESS_TYPE_MAILING);
		inputList.add(DateUtil.getCurrentSQLTimeStamp());
		inputListFinalList.add(inputList.toArray());
		
		inputList.clear();
		//Mailing Address
		inputList.add(personalDetBean.getCustId());
		inputList.add(permanentAdd.getRoom_no());
		inputList.add(permanentAdd.getBuilding_name());
		inputList.add(permanentAdd.getRoad_name());
		inputList.add(permanentAdd.getLandmark());
		inputList.add(permanentAdd.getCity());
		inputList.add(permanentAdd.getState());
		inputList.add(permanentAdd.getPincode());
		inputList.add(MchurnerConstants.ADDRESS_TYPE_PERMANENT);
		inputList.add(DateUtil.getCurrentSQLTimeStamp());
		inputListFinalList.add(inputList.toArray());
		
		int[] addrCount = jdbcTemplate.batchUpdate(addressQuery,inputListFinalList);
		return count>0 && addrCount.length>0;
	}
	
	
	@Override
	@Transactional
	public boolean saveCustomerProfessionalDetails(CustPersonalDetailsBean personalDetBean) {
		String query = "update CUSTOMER_MASTER set company_name=?,Company_contact_no=?,department=?,designation=?,Work_experience=?, updated_on=?, Update_reason=? where cust_id=? ";
		int count = jdbcTemplate.update(query, personalDetBean.getCompanyName(),personalDetBean.getCompanyContactNo(),personalDetBean.getDepartment(),
				personalDetBean.getDesignation(),personalDetBean.getWorkExp(), DateUtil.getCurrentSQLTimeStamp(),"Professional details Added",personalDetBean.getCustId());
		
		String addressQuery = "insert into customer_address(cust_id,,address_type,created_on)"
				+ "values(?,?,?,?,?,?,?,?,?,?)";
		
		AddressBean compAdd = personalDetBean.getCompanyAddress();
		List<Object> inputList= new ArrayList<Object>();
		
		//Mailing Address
		inputList.add(personalDetBean.getCustId());
		inputList.add(compAdd.getRoom_no());
		inputList.add(compAdd.getBuilding_name());
		inputList.add(compAdd.getRoad_name());
		inputList.add(compAdd.getLandmark());
		inputList.add(compAdd.getCity());
		inputList.add(compAdd.getState());
		inputList.add(compAdd.getPincode());
		inputList.add(MchurnerConstants.ADDRESS_TYPE_COMPANY);
		inputList.add(DateUtil.getCurrentSQLTimeStamp());
	
		int addrCount = jdbcTemplate.update(addressQuery,inputList.toArray());
		return count>0 && addrCount>0;
	}
	
	@Override
	public boolean saveCustomerShareDetails(CustShareDetails shareDetBean) {
		String query = "insert into customer_share_master(cust_id, no_of_share, each_share_price, purchase_date, created_on, record_status)"
				+ "values(?,?,?,?,?,?)";
		int count = jdbcTemplate.update(query,shareDetBean.getCustId(), shareDetBean.getNoOfShare(),shareDetBean.getEachSharePrice(),DateUtil.getCurrentSQLTimeStamp(), DateUtil.getCurrentSQLTimeStamp(),GeneralConstants.Y);
		return count>0;
	}
	
	@Override
	public List<CustShareDetails> getShareDetails(String custId) {
		String query = "select share_id,no_of_share,each_share_price,cust_id,purchase_date,record_status from "
				+ "customer_share_master where cust_id=?";
		List<Map<String, Object>> rowList=jdbcTemplate.queryForList(query, custId);
		return RowMapperUtil.getShareList(rowList);
		
	}

	@Override
	public List<FDAccountBean> getFDDetails(String custId) {
		String query = "select fd.fd_acc_id, fd.cust_id, fd.scheme_master_id,fd.fd_account_no, sch.deposit_term, fd.start_date, fd.maturity_date,sch.interest_rate, fd.deposit_amount, fd.record_status from "
				+ "FD_ACCOUNT_DETAILS fd join SCHEME_MASTER sch ON fd.scheme_master_id = sch.scheme_master_id where fd.cust_id=?";
		List<Map<String, Object>> rowList=jdbcTemplate.queryForList(query, custId);
		return RowMapperUtil.getFDDetailList(rowList);
	}
}
