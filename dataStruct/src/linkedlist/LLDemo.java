package linkedlist;

import java.util.*;

public class LLDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("okay");
		list.addFirst("Iam");
		System.out.println(list);
		
		list.addLast("you");
		list.addFirst("yeah");
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		list.remove();
		System.out.println(list);
		
		
		list.add("you");
		list.add("are");
		list.add("beauty");
		System.out.println(list.remove(3));
		System.out.println(list);
		
		
		
	}

}
