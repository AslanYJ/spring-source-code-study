package com.spring.lyj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	@Autowired
	 UserService userService;

	public OrderService() {
		System.out.println("333");
	}

}
