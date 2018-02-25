package com.mchurner.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mchurner.dao.UserDao;
import com.mchurner.model.Login;
import com.mchurner.model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(User user) {
		String sql = "insert into users(username,password,fullname,email,address,contact1,contact2) values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFullname(), user.getEmail(), user.getAddress(), user.getContact1(),user.getContact2()});
	}
	
	public void updateUserDetails(User user) {
		String sql = "update users set fullname=?,email=?,address=?,contact1=?,contact2=? where username=?";
		jdbcTemplate.update(sql, new Object[] {user.getFullname(), user.getEmail(), user.getAddress(), user.getContact1(),user.getContact2(),user.getUsername()});
	}
	
	public User validateUser(Login login) {
		String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
		+ "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;
	}
}

class UserMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setFullname(rs.getString("fullname"));
		user.setEmail(rs.getString("email"));
		user.setAddress(rs.getString("address"));
		user.setContact1(rs.getString("contact1"));
		user.setContact2(rs.getString("contact2"));
		return user;
	}
}