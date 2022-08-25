package com.springcrud.dao;

import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;

import com.springcrud.beans.User;

public class UserDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template=template;
	}
	public int update(User user){
		String sql="update userinfo set user_name=?,password=?,email=?,phone_no=?,country=? where user_id=?";
		int ans=template.update(sql,user.getUser_name(),user.getPassword(),user.getEmail(),user.getPhone_no(),user.getCountry(),user.getUser_id());
		return ans;
	}
		public User getUserId(int id){
			String sql="select * from userinfo where user_id=?";
			@SuppressWarnings("deprecation")
			User emp=template.queryForObject(sql,new Object[]{id},new UserMapper());
			
			return emp;
		}
		
		public List<User> getUserDetails(int u_id){
		
			String sql="select * from userinfo where user_id="+u_id+"";
			List<User>userList=template.query(sql,new UserMapper());
				return userList;
		
		}
		
		public List<User> getUserAllDetails() {
			String sql="select * from userinfo";
			List<User>userList=template.query(sql,new UserMapper());
			return userList;
		}

}
