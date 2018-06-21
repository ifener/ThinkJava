package com.wey.stack;

import java.util.Stack;

public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(String s:"My dog has fleas".split(" ")){
			stack.push(s);
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}

	}

}
