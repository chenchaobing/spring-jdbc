package com.easemob.mybatis.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.easemob.mybatis.dao.UserDAO;
import com.easemob.mybatis.model.User;

@Resource
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