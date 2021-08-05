package com.spring.lyj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lyj
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(LyjConfig.class);
		ac.refresh();
		UserService userService = ac.getBean(UserService.class);
		System.out.println(userService);
	}
}
