package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		Queue<Integer>numbers= new PriorityQueue();
		numbers.offer(4);
		numbers.offer(2);
		numbers.offer(1);
       /* System.out.println("Queue:"+numbers);
        int accessedNumber=numbers.peek();
        System.out.println("Accessed Element:"+accessedNumber);
        int removedNumber=numbers.poll();
        System.out.println("Removed Element:"+removedNumber);
        
        System.out.println("Updated Queue:"+numbers);*/
		System.out.print("PriorityQueue using iterator():");
		Iterator<Integer>iterator=numbers.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(",");
		}
	}

}
