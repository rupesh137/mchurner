package com.mchurner.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Transactional;

import com.mchurner.beans.customer.FDAccountBean;
import com.mchurner.constants.GeneralConstants;
import com.mchurner.dao.CustAccountDao;
import com.mchurner.utils.DateUtil;
import com.mchurner.utils.MchurnerUtils;

public class CustAccountDaoImpl implements CustAccountDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	@Transactional
	public boolean createFDAcc(FDAccountBean fdBean) {
		String query = "insert into FD_ACCOUNT_DETAILS(cust_id, fd_account_no, tenure, start_date, maturity_date,interest_rate,deposit_amount,created_on, record_status)"
				+ "values(?,?,?,?,?,?,?,?,?)";
		
		KeyHolder keyHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(
		  new PreparedStatementCreator() {
		    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		    	PreparedStatement pst = connection.prepareStatement(query, new String[] {"fd_acc_id"});
		    	 pst.setInt(1, fdBean.getCustId());
		    	 pst.setInt(2, fdBean.getFdAccId());
		    	 pst.setInt(3, fdBean.getTenure());
		    	 pst.setDate(4, new Date(fdBean.getStartDate().getTime()));
		    	 pst.setDate(5, new Date(fdBean.getMaturityDate().getTime()));
		    	 pst.setFloat(6, fdBean.getInterestRate());
		    	 pst.setBigDecimal(7, fdBean.getDepositAmt());
		    	 pst.setTimestamp(8, DateUtil.getCurrentSQLTimeStamp());
		    	 pst.setString(9, GeneralConstants.Y);
		    	 
		    	return pst;
		    }
		  }, keyHolder);

		int key = keyHolder.getKey().intValue();
		String accId = MchurnerUtils.generateFDAccId(key);
		String updateQury = "update FD_ACCOUNT_DETAILS set fd_account_no=? where fd_acc_id=?";
		int count = jdbcTemplate.update(updateQury, accId, key);
		return count>0;
	}

}
