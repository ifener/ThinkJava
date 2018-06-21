package com.wey.innerclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   List<Integer> ints = new ArrayList<Integer>();
	   ints.add(1);
	   ints.add(5);
	   ints.add(4);
	   ints.add(6);
	   ints.add(9);
	   //System.out.println(ints.indexOf(5));

	   List<Integer> subInts = ints.subList(1, 3);
	   
	   //Collections.sort(subInts);
	   
	   //System.out.println(ints.containsAll(subInts));
	   
	   for(Integer i:ints){
		   System.out.println(i);
	   }
	   
	   Collections.shuffle(ints);
	   System.out.println("--------------------");
	   for(Integer i:ints){
		   System.out.println(i);
	   }
	   
	   System.out.println("--------------------");
	   for(Integer i:subInts)
	   {
		   System.out.println(i);
	   }
	   
	   List<Integer> ints2 = Arrays.asList(4,5,6,10);
	   ints.retainAll(ints2);
	   System.out.println("#############");
	   if(ints.size()>0)
	   {
		   System.out.println("有交集");
		   for(Integer i:ints){
			   System.out.println(i);
		   }
	   } else 
	   {
		   System.out.println("没有交集");
	   }
	   
	   
	   List<String> fruits = Arrays.asList("Apple","Orange","Pear","Waterlemon","Lemon");
	   ListIterator<String> it = fruits.listIterator();
	   if(it.hasPrevious()){
		   System.out.println("Has Previous");
	   }
	   while(it.hasNext()){
		   System.out.println(it.next()+","+it.nextIndex()+","+it.previousIndex());
	   }
	   
	   if(it.hasPrevious()){
		   System.out.println("Has Previous");
	   }
	   
	   while(it.hasPrevious()){
		   System.out.println(it.previous()+","+it.nextIndex()+","+it.previousIndex());
	   }
	   
	}

}
