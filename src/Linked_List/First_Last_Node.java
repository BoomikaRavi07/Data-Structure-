package Linked_List;

public class First_Last_Node {
		 class Node {
			 int data;
			 Node next;
			 public Node(int data) {
				 this.data=data;
				 this.next=null;
			 }
		 }
			 public Node head = null;
			 public Node tail = null;
			 void addNode(int data){
				 Node newNode = new Node(data);
				 if(head==null) {
					 head=newNode;
				     tail=newNode;
		 }
			     else {
			    	 tail.next=newNode;
			    	 tail=newNode;
			 }
	   }
			 void addFirst(int data) {
				 Node newNode = new Node(data);
				 if(head==null) {
					 head=newNode;
					 tail=newNode;
				 }
				 else {
					 newNode.next=head;
					 head=newNode;
				 }
			 }
			 void addLast(int data) {
				 Node newNode = new Node(data);
				 Node current=head;
				 if(head==null) {
					 head=newNode;
					 tail=newNode;
				 }
				 else {
					 while(current.next!=null) {
						 current=current.next;
					 }
					 current.next=newNode;
					 //tail.next=newNode
					 tail=newNode;
				 }
			 }
			 void addBetween(int pos,int data) {//pos=20,data=78
				 Node newNode=new Node(data);
				 Node current=head;
				 if(head==null) {
					 head=newNode;
					 tail=newNode;
				 }
				 else {
					 while(current.data!=pos) {
						 current=current.next;
					 }
					 newNode.next=current.next;
					 current.next=newNode;
				 }
			 }
	     public void display() {
	    	 Node current =head;
	    	 if(head==null) {
	    		 System.out.println("Linked list is empty");
	    	 }
	    	 else {
	    		 System.out.println("Singly Linked list elements are: ");
	    		 while(current!=null) {
	    			 System.out.print(current.data+" ");
	    			 current=current.next;
	    		 }
	    	 }
	     }
		public static void main(String[] args) {
		   First_Last_Node sll = new First_Last_Node();
		   sll.addNode(10);
		   sll.addNode(5);
		   sll.addNode(20);
		   sll.addFirst(100);
		   sll.addLast(200);
		   sll.addNode(500);
		   sll.addBetween(70,90);
		   sll.display();
			
		}
	}