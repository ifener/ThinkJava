package com.wey.hash;

import java.util.ArrayList;
import java.util.List;

public class TestArrayHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   List<Person> list = new ArrayList<Person>();
	   
	   Person p1 = new Person();
	   p1.setId(1);
	   p1.setName("Ken");
	   p1.setCity("DG");
	   
	   if(!list.contains(p1))
	   {
		   list.add(p1);
	   }
	   
	   Person p2 = new Person();
	   p2.setId(2);
	   p2.setName("Ken");
	   p2.setCity("DG");
	   
	   if(!list.contains(p2))
	   {
		   list.add(p2);
	   }
	   
	   System.out.println(list);

	}

}
