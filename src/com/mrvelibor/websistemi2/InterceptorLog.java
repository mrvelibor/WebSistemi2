package com.mrvelibor.websistemi2;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class InterceptorLog implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Before calling: " + method);
	}
}
