package com.wey.innerclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ListTest {
	
	class Fruit{}
	class Apple extends Fruit{}
	class Orange extends Fruit{}
	
	public static void main(String[] args){
		List<Fruit> fruits = new ArrayList<ListTest.Fruit>();
		ListTest test = new ListTest();
		fruits.add(test.new Apple());
		fruits.add(test.new Orange());
		
		for(Fruit f:fruits)
		{
			System.out.println(f);
		}
		
		//List<Apple> apples = new ArrayList<ListTest.Apple>();
		test.eat(fruits);
		
		
		
	}
	
	private void eat(List<Fruit> fruits)
	{
		
	}

}
