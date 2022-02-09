package com.spring.lyj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lyj
 */
public class Test {
	public static void main(String[] aargs) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LyjConfig.class);
		ac.refresh();
	}
}
