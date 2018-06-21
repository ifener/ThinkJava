package com.wey.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyHandler implements InvocationHandler {
	
	private Object target; //目录对象，真实对象
	
	public MyHandler(Object t){
		this.target = t;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().startsWith("test")){
			System.out.println("Join Transaction......");
		}
		return method.invoke(target, args);
	}
	
	public static void main(String[] args){
		MyHandler handler = new MyHandler(new UserServiceImpl());
		
		UserService service = (UserService)Proxy.newProxyInstance(MyHandler.class.getClassLoader(), new Class[]{UserService.class}, handler);
		service.test();
	}

}
