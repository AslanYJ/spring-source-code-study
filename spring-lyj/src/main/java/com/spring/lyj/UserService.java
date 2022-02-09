package com.spring.lyj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	OrderService orderService;

	public UserService() {
		System.out.println("init userService");
	}
}
