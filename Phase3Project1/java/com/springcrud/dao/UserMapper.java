package com.springcrud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcrud.beans.User;
//RowMapper converts Records from ResultSet to Objects
public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum)throws SQLException{
		
		User user =new User();
		user.setUser_id(rs.getInt("user_id"));
		user.setUser_name(rs.getString("user_name"));
		user.setPassword(rs.getString("password"));
		user.setEmail(rs.getString("email"));
		user.setPhone_no(rs.getString("phone_no"));
		user.setCountry(rs.getString("country"));
		
		
		return user;
	}
	

	
	

}