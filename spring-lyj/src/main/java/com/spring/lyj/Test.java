package com.spring.lyj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LyjConfig.class);
		ac.register(UserDao.class);
		UserDao userDao =(UserDao) ac.getBean("userDao");
		userDao.hello();
	}
}
