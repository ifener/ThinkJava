package com.wey.test;

import java.util.Random;

public class Think {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random(100);
		for(int i=0;i<10;i++)
		{
			System.out.println(random.nextInt(50));
		}
	}

}
