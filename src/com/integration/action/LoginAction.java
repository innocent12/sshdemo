package com.integration.action;

import com.integration.entity.User;
import java.util.List;
import java.util.Iterator;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	String username;
	String password;
	String usertype;
	private UserService userService;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	
	//调用默认validate方法，直接使用execute方法
	public String execute(){
		List<User> list = (List<User>) userService.findAll();
		Iterator <User> it = list.iterator(); 
		User u = new User();
		while(it.hasNext()){
			u = (User)it.next();
			if(username.trim().equals(u.getName())&&password.trim().equals(u.getPassword())&&usertype.trim().equals(u.getType()))
				return "success";
			else return "failer";
		}
		return "failer";
		
	}
}
