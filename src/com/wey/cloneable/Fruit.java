package com.wey.cloneable;

import java.io.Serializable;

public class Fruit implements Cloneable,Serializable{
	private static final long serialVersionUID = 1L;

	private String fruitName;
	
	private Apple apple;
	
	
	

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	@Override
	protected Fruit clone() throws CloneNotSupportedException {
	    Fruit fruit = (Fruit)super.clone();
	    fruit.apple = (Apple)fruit.getApple().clone();
	    return fruit;
	    
	}
	
	

}
