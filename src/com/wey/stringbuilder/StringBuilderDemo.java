package com.wey.stringbuilder;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			builder.append(i);
			builder.append(",");
		}
		
		//builder.deleteCharAt(builder.length()-1);
		builder.delete(builder.length()-1, builder.length());
		
		System.out.println(builder.toString());
		
		List<Builder> array = new ArrayList<Builder>();
		for (int i = 0; i < 10; i++) {
			array.add(new Builder(i+""));
		}
		
		System.out.println(array.toString());

	}

}
