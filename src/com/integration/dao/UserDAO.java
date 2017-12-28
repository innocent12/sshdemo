package com.integration.dao;

import java.util.List;
import com.integration.entity.User;

public interface UserDAO {
	void save(User User);		//添加用户
	User getUser(String name);  //按用户名查找用户
	void delete(int id);	//删除用户
	void update(User User); 	//更新用户
	User findById(int id);		//通过ID查找用户
	List<User> findAll();		//查找全部用户
	
}
