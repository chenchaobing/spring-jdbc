package com.easemob.mybatis.dao;

import java.util.List;

import com.easemob.mybatis.model.User;

public interface UserDAO {

	public void add(User user);
	
	public List<Object> getAllUser();
	
}
