package com.wey.cloneable;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class CloneTest {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException, InvocationTargetException {
		Apple apple = new Apple();
		apple.setLocality("China");
		Apple apple2 = (Apple) apple.clone();
		
		System.out.println(apple==apple2);
		apple2.setLocality("China GD");
		
		System.out.println(apple.getLocality());
		
		
		
		Fruit fruit = new Fruit();
		fruit.setFruitName("Apple");
		fruit.setApple(apple);
		
		Fruit fruit2 = fruit.clone();
		
		System.out.println("Fruit = "+(fruit==fruit2));
		System.out.println("Fruit's apple="+(fruit.getApple()==fruit2.getApple()));
		
		Fruit fruit3 = BeanDeepCloneUtil.cloneTo(fruit);
		
		System.out.println("Fruit = "+(fruit==fruit3));
		System.out.println("Fruit's apple="+(fruit.getApple()==fruit3.getApple()));
		
		System.out.println("Apache BeanUtils:");
		Fruit fruit4 = new Fruit();
		BeanUtils.copyProperties(fruit4, fruit);
		System.out.println(fruit4.getFruitName());
		System.out.println("Fruit = "+(fruit==fruit4));
		System.out.println("Fruit's apple="+(fruit.getApple()==fruit4.getApple()));
		
		Fruit fruit5 = new Fruit();
		org.springframework.beans.BeanUtils.copyProperties(fruit, fruit5);
		
		System.out.println("Spring BeanUtils:");
		
		System.out.println(fruit5.getFruitName());
		System.out.println("Fruit = "+(fruit==fruit5));
		System.out.println("Fruit's apple="+(fruit.getApple()==fruit5.getApple()));
		
		
		
	}

}
