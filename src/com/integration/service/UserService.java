package com.integration.service;

import com.integration.entity.User;
import java.util.List;

public interface UserService {
	void saveUser(User user);	//����û�
	User getUser(String name);	//���û��������û�
	void deleteUser(int id);	//ɾ���û�
	void updateUser(User user); //�����û�
	User findUserById(int id);	//��id�����û�
	List<User> findAll();		//����ȫ���û�
	
}
