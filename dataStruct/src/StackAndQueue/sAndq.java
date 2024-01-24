package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public interface sAndq {
	/*public class sAndq {
	 * public static void main(String[] args) {
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}*/
	//interface Q {
		public static void main(String[] args) {
		
			Queue<Integer> queue  = new LinkedList<>();
			queue.add(3);
			queue.add(6);
			queue.add(9);
			queue.add(12);
			queue.add(15);
			
			System.out.println(queue.remove());
			
			}
		}

	
	
	
