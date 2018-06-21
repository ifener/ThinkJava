package com.wey.innerclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueDeomo {
	
	public static void main(String[] args){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(100);
		queue.add(120);
		queue.add(90);
		queue.add(70);
		queue.add(130);
		queue.add(140);
		queue.add(150);
		queue.offer(160);
		
		while(queue.peek()!=null){
			System.out.println(queue.remove());
		}
		
		Integer q = null;
		while((q=queue.poll())!=null)
		{
			System.out.println(q);
		}
		
		List<Integer> ints = Arrays.asList(20,65,3,6,98,55,66,14,25,88,55,45,74,65,258,369);
		PriorityQueue<Integer> priorityQueues = new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
		priorityQueues.addAll(ints);

		
		
		//while(priorityQueues.peek()!=null)
		//{
			//System.out.println(priorityQueues.poll());
		//}
		
		System.out.println("----------------------------");
		
		priorityQueues.offer(1000);
		priorityQueues.offer(1020);
		priorityQueues.offer(1030);
		
		for(Integer i:priorityQueues){
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		
		while(priorityQueues.peek()!=null)
		{
			System.out.println(priorityQueues.remove());
		}
		
		
		
	}
}
