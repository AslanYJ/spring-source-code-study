package com.spring.lyj.proxy;

import com.spring.lyj.annotaion.Select;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDynamicInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("conn db");
		Select annotation = method.getAnnotation(Select.class);
		String sql = annotation.value()[0];
		System.out.println(sql);
		//Class<?> returnType = method.getReturnType();
		return null;
	}
}
