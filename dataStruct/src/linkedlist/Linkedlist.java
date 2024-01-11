package linkedlist;

public class Linkedlist {
	Node head;
	
	private int size;
		public Linkedlist() {
			this.size=0;
		}
	
	
	class Node {
		String data;
		Node next;
		
		Node(String data) {
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	//addFirst
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head= newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	//addLast
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head= newNode;
			return;
		}
		Node curNode = head;
		while(curNode.next!= null) {
			curNode=curNode.next;
		}
		curNode.next=newNode;
		
	}
	
	//deleteFirst
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		head = head.next;
		
	}
	
	//deleteLast
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		if(head.next==null) {     //LastNode=null 'secondLastNode'=null
			head=null;
			return;
		}
		
		Node secondLastNode = head;
		Node LastNode = head.next;
		while(LastNode.next!=null) {
			LastNode=LastNode.next;
			secondLastNode=secondLastNode.next;
		}
		
		secondLastNode.next = null;
		
	}
	
	
	
	public void show() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node curNode = head;
		while(curNode!=null) {
			System.out.print(curNode.data +  "  ");
			curNode=curNode.next;
		}
		System.out.println(" (at last ...null)");
	}
	
	
	public int getSize() {
		return size;
	}
	
	
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.addFirst("you");
		list.addFirst("are");
		list.addFirst("how");
		list.addFirst("Hey");
		list.addLast("now");
		list.show();
		
		list.deleteFirst();
		list.show(); 
		
		list.deleteLast();
		list.show();
		
		System.out.println(list.getSize());
		list.addFirst("I-forgot");					//Null values cannot read the size
		list.show();
		System.out.println(list.getSize());
	}
}


//	
//	Node head;
//	
//	class Node {
//		String data;
//		Node next;
//		
//		Node(String data) {         //constructor
//			this.data = data;
//			this.next = null;
//		}
//	}
//	
//	//add -first, last
//	//addFirst
//	public void addFirst( String data) {
//		Node newNode = new Node(data);
//		if(head == null) {                  //its not happening
//			head = newNode;
//			return;
//		}
//		newNode.next = head;        //2=head  =>2=newNode
//		head=newNode;
//	}
//	
//	
//	//addLast
//	public void addLast( String data) {
//		Node newNode = new Node(data);
//		if(head == null) {                  //its not happening
//			head = newNode;
//			return;
//		}
//		Node currNode = head;               //is = head
//		while(currNode.next!=null) {		//a !=null  => 'is = is a '
//			currNode = currNode.next;
//		}
//		currNode.next=newNode;
//	}
//	
//	//print
//	public void show() {
//		if (head == null) {
//			System.out.println("List is empty");
//			return;
//		}
//		
//		Node curNode = head;
//		while(curNode != null) {
//			System.out.println(curNode.data + " ");      
//			curNode = curNode.next;
//		}
//		
//		System.out.println("null");
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		
//		list.addFirst("a");
//		list.addFirst("is");
//		
//		list.show();
//		
//		
//		list.addFirst("It");
//		list.addLast("list  ");
//		
//		list.show();
//		
//		
//	}
//	
//}
//		
//	