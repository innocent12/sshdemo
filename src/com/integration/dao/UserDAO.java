package com.integration.dao;

import java.util.List;
import com.integration.entity.User;

public interface UserDAO {
	void save(User User);		//����û�
	User getUser(String name);  //���û��������û�
	void delete(int id);	//ɾ���û�
	void update(User User); 	//�����û�
	User findById(int id);		//ͨ��ID�����û�
	List<User> findAll();		//����ȫ���û�
	
}
