package com.easemob.jdbc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.easemob.jdbc.dao.UserDAO;
import com.easemob.jdbc.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(User user) {
	}

	@Override
	public List<Object> getAllUser() {
        return (List<Object>)jdbcTemplate.query("select `name` , `password` from `test`" , new UserRowMapper());
	}

}