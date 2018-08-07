package com.wey.set;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1, "A,B,C,D,E,F,G,a,b,c".split(","));
        System.out.println(set1);
        System.out.println(set1.contains("F"));
        System.out.println(set1.contains("f"));
        
        Set<String> treeSet = new TreeSet<String>();
        Collections.addAll(treeSet, "A,a,B,b,C,c,D,E,F,G,d,e,f,g,h,i".split(","));
        System.out.println(treeSet);
        
        Set<String> treeSet1 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        Collections.addAll(treeSet1, "A,a,B,b,C,c,D,E,F,G,d,e,f,g,h,i".split(","));
        System.out.println(treeSet1);
        
        Set<BigDecimal> set2 = new HashSet<BigDecimal>();
        BigDecimal num1 = new BigDecimal("1.0");
        BigDecimal num2 = new BigDecimal("1.00");
        set2.add(num1);
        set2.add(num2);
        System.out.println(set2);
        
        Set<BigDecimal> treeSet2 = new TreeSet<BigDecimal>();
        treeSet2.add(num1);
        treeSet2.add(num2);
        System.out.println(treeSet2);
        
    }
}
