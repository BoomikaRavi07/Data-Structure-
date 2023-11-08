package Linked_List;

public class Doubly_Linked_List {
	
	class Node{
		public int data;
		public Node next;
		public Node prev;
		public Node(int data) {
			this.data=data;
		}
	}
    Node head=null;
    Node tail=null;
    public void addNodeFront(int val) {
    	Node temp=new Node(val);
    	if(head != null)
    	{
    		head.prev = temp;
    		temp.next=head;
    	}
    	head = temp;
    	if(tail == null) 
    	tail = temp;	
    	{
    }
    head.prev = temp;
    head=temp;
    if(tail == null)
    	tail = temp;
}
    public void iterateForward() {
    	Node temp = head;
    	while(temp != null) {
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }
	public static void main(String[] args) {
		 Doubly_Linked_List dll = new  Doubly_Linked_List();
		 dll.addNodeFront(2);
		 dll.addNodeFront(9);
		 dll.addNodeFront(10);
		 dll.iterateForward();
		
		

	}

}
