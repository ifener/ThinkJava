package com.wey.invocation;

public class UserServiceImpl implements UserService {

	@Override
	public void test() {
		System.out.println("test");
		test1();
	}

	@Override
	public void test1() {
		System.out.println("test1");

	}

}
