package com.wey.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> vectors = new Vector<String>(5);
		vectors.add("China");
		vectors.add("Russia");
		vectors.add("Korea");
		vectors.add("American");
		vectors.add("Canada");
		vectors.add("France");
		
		System.out.println("添加后遍历:");
		for(int i=0;i<vectors.size();i++){
			System.out.println(vectors.get(i));
		}
		
		Collections.sort(vectors);
		
		System.out.println("排序后遍历:");
		for(int i=0;i<vectors.size();i++){
			System.out.println(vectors.get(i));
		}
		
		vectors.remove("Korea");
		System.out.println("移除Korea后遍历:");
		for(int i=0;i<vectors.size();i++){
			System.out.println(vectors.get(i));
		}
		
		vectors.remove(0);
		System.out.println("移除第一个元素后遍历:");
		for(int i=0;i<vectors.size();i++){
			System.out.println(vectors.get(i));
		}
		
		vectors.addElement("Korea");
		vectors.addElement("American");
		System.out.println("加回Korea、American后遍历:");
		for(int i=0;i<vectors.size();i++){
			System.out.println(vectors.get(i));
		}
		
		Vector<String> fruits = new Vector<String>(5,5);
	
		System.out.println(fruits.size());
		fruits.add("Apple");
		fruits.add("Orance");
		fruits.add("Pear");
		fruits.add("Lemon");
		fruits.add("Waterlemon");
		fruits.add("Plum");
		System.out.println(fruits.size());
		fruits.remove("Plum");
	}

}
