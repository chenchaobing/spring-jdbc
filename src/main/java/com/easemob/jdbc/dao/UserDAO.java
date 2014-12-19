package com.easemob.jdbc.dao;

import java.util.List;

import com.easemob.jdbc.model.User;

public interface UserDAO {

	public void add(User user);
	
	public List<Object> getAllUser();
	
}
