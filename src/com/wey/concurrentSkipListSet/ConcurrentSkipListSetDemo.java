package com.wey.concurrentSkipListSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {
    
    private static Set<String> set = new ConcurrentSkipListSet<String>();
    
    public static void main(String[] args) {
        new MyThread("a").start();
        new MyThread("b").start();
        
        Set<String> set1 = new HashSet<String>();
        set1.add("apple");
        set1.add("apple");
        set1.add("orange");
        System.out.println(set1);
        
        Set<String> set2 = new TreeSet<String>();
        
        set2.add("orange");
        set2.add("orange");
        set2.add("apple");
        System.out.println(set2);
        
        Set<String> set3 = new ConcurrentSkipListSet<String>();
        set3.add("Apple");
        set3.add("Apple");
        set3.add("Apple");
        set3.add("Orange");
        System.out.println(set3);
    }
    
    private static void printAll(int i) {
        String value = null;
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            value = (String) iter.next();
            System.out.print(Thread.currentThread().getName() + "-" + i + "--" + value + ", ");
        }
        System.out.println();
    }
    
    private static class MyThread extends Thread {
        
        MyThread(String name) {
            super(name);
        }
        
        @Override
        public void run() {
            for (int i = 1; i < 10; i++) {
                String value = Thread.currentThread().getName() + (i % 5);
                set.add(value);
                printAll(i);
            }
        }
        
    }
}
