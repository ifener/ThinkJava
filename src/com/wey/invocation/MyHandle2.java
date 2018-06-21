package com.wey.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyHandle2 implements InvocationHandler {

	private Object target;
	
	public Object bind(Object target){
		this.target = target;
		 return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().startsWith("test")){
			System.out.println("Join Transaction......");
		}
		return method.invoke(target, args);
	}

	public static void main(String[] args) {
		UserService userService = (UserService)new MyHandle2().bind(new UserServiceImpl());
		userService.test();
	}
}
