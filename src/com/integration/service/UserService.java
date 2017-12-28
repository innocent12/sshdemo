package com.integration.service;

import com.integration.entity.User;
import java.util.List;

public interface UserService {
	void saveUser(User user);	//添加用户
	User getUser(String name);	//按用户名查找用户
	void deleteUser(int id);	//删除用户
	void updateUser(User user); //更新用户
	User findUserById(int id);	//按id查找用户
	List<User> findAll();		//查找全部用户
	
}
