package Problem2;

import java.util.*;

public class RoadToBiodome08 {
	public static Integer[] queue = new Integer[100];
	public static int front=0, rear=0;
	
	public static boolean isEmpty() {
		if (front>=rear) return true;
		else return false;
	}
	
	public static Integer[] Enqueue(int x) {
		queue[rear] = x;
		rear++;
		
		return queue;
	}
	
	public static int peek() {
		if(isEmpty()) {
			return -1;
		}
		
		int x = queue[front];
		return x;
	}
	
	
	
	public static Integer[] Dequeue() {
		int x = peek();
		if(x != -1) System.out.println("use " + x);
		
		if(front<rear)
				front++;
		
		return queue;
	}
	
	
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please, write at least one ");
			return;
		}
		
		//String input -> Integer list
		
		
		
		
		for(int i = 0; i<args.length; i++){
			int x = Integer.parseInt(args[i]) ;
			Enqueue(x);
		}
		
		while(!isEmpty()) {
			Dequeue();
		}
		System.out.println("There is no more resources to use");
		return;
	}
}
