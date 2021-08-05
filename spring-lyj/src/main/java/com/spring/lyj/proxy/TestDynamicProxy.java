package com.spring.lyj.proxy;

import com.spring.lyj.proxy.ProxyFactory;
import com.spring.lyj.proxy.TestDao;

public class TestDynamicProxy {

	public static void main(String[] args) {
		TestDao testDao = (TestDao) ProxyFactory.getMapper(TestDao.class);
		testDao.query();
	}
}
