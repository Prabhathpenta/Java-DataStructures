package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArray {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(55);
		deque.addLast(40);
		System.out.println(deque.remove(40));
		System.out.println(deque.remove(41));
		System.out.println(deque.add(50));
		
	}
	
}
