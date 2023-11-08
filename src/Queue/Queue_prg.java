package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_prg {

	public static void main(String[] args) {
		Queue<Integer>numbers= new PriorityQueue();
		numbers.offer(11);
		numbers.offer(5);
		numbers.offer(25);
		numbers.offer(34);
		numbers.offer(96);
		numbers.offer(112);
       System.out.println("Queue:"+numbers);
        int accessedNumber=numbers.peek();
        System.out.println("Accessed Element:"+accessedNumber);
        Integer x =(Integer)numbers.poll();
        int removedNumber=numbers.poll();
        System.out.println("Removed Element:"+removedNumber);
        numbers.remove(34);
        System.out.println("Updated Queue:"+numbers);
	}

}
