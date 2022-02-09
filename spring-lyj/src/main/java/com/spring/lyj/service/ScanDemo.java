package com.spring.lyj.service;

import com.spring.lyj.LyjConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Scan的源码解析
 * @author yjlan
 */
public class ScanDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(LyjConfig.class);
		ac.scan("com.spring.lyj");
		ac.refresh();

	}
}
