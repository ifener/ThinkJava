package com.wey.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args){
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1,"A,B,C,D,E,F,G".split(","));
		System.out.println(set1.contains("F"));
		System.out.println(set1.contains("f"));
		
		
		Set<String> treeSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		Collections.addAll(treeSet, "A,a,B,b,C,c,D,E,F,G,d,e,f,g,h,i".split(","));
		System.out.println(treeSet);
	}
}
