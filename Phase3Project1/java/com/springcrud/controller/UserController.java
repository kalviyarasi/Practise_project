package com.springcrud.controller;

import java.io.PrintWriter;
import java.sql.SQLException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springcrud.beans.User;
import com.springcrud.dao.UserDao;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
	@RequestMapping("/viewuser")
	public String viewuser(Model m,@RequestParam(value="user_id" ,required=true)Integer user_id){
		List<User> userList= dao.getUserDetails(user_id);
		m.addAttribute("userList",userList);
		if(userList.isEmpty())
			return "redirect:/invalid";
		else
			return "viewuser";
	}
	
	@RequestMapping(value="/editemp/{user_id}")
	public String edit(@PathVariable int user_id, Model m){

		User user=dao.getUserId(user_id);
		m.addAttribute("user",user);
		return "updateuserform";
	}
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editSave(@ModelAttribute("user") User user,Model m,@RequestParam(value="user_id" ,required=false)Integer user_id){
		System.out.println(user.getUser_id());
		dao.update(user);
		List<User> userList= dao.getUserDetails(user_id);
		m.addAttribute("userList",userList);
		return "viewuser";
	}
	
	@RequestMapping("/viewalluser")
	public String viewalluser(Model m){
		List<User> userList= dao.getUserAllDetails();
		m.addAttribute("userList",userList);
		return "viewuser";
}
	@RequestMapping("/invalid")
	public void invalid(HttpServletRequest request,ModelMap map, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("/index.jsp").include(request, response);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<p style=font-size:18px;color:red;>Oops!!No records found</p>");				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
