package com.easemob.mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easemob.mybatis.dao.UserDAO;

public class SpringJdbcTest {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDao = (UserDAO) ctx.getBean("userDAO");
		for(int i = 0 ; i < 10 ; i ++){
			long start = System.currentTimeMillis();
			List<Object> userList =  userDao.getAllUser();
			long end = System.currentTimeMillis();
			System.out.println(userList);
			System.out.println("cost time : " + (end - start));
		}
	}

}
