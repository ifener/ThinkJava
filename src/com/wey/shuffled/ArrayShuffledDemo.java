package com.wey.shuffled;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayShuffledDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Random random = new Random(100);
		for(int i=0;i<10;i++){
			System.out.println(random.nextInt());
		}
		
		 Random rand = new Random(47);  
         int j = rand.nextInt(100);  
         int k = rand.nextInt(100);  
         int p = rand.nextInt(100);  
         int o = rand.nextInt(100);  
         System.out.println(j);  
         System.out.println(k);  
         System.out.println(p);  
         System.out.println(o);  */
		
		Random rand = new Random();
		Integer[] ia = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("list1打乱前的顺序："+list1.toString());
		Collections.shuffle(list1,rand);
		System.out.println("list1打乱后的顺序："+list1.toString());
		System.out.println("原数组的顺序："+Arrays.toString(ia));
		
		List<Integer> list2 = Arrays.asList(ia);
		System.out.println("list2打乱前的顺序："+list2.toString());
		Collections.shuffle(list2,rand);
		System.out.println("list2打乱后的顺序："+list2.toString());
		System.out.println("原数组的顺序："+Arrays.toString(ia));
	}

}

