package com.spring.lyj.proxy;

import java.lang.reflect.Proxy;

@SuppressWarnings("rawtypes")
public class ProxyFactory {

	public static Object getMapper(Class clazz) {
		Class[] classes = new Class[]{clazz};
		// 获得代理对象
		return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(),classes,new ProxyDynamicInvocationHandler());
	}
}
