package Queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class Array_Deque {

	public static void main(String[] args) {
		Deque<Integer>number=new ArrayDeque<>();
        number.offer(1);
        number.offerLast(2);
        number.offerFirst(3);
        System.out.println("Deque: "+number);
        int firstElement = number.peekFirst();
        System.out.println("First Element: "+firstElement);
        int lastElement = number.peekLast();
        System.out.println("First Element: "+lastElement);
        int removedNumber1=number.pollFirst();
        System.out.println("Removed First Element: "+removedNumber1);
        int removedNumber2=number.pollLast();
        System.out.println("Removed Last Element: "+removedNumber2);
        System.out.println("Updated Deque:"+number);
	}

}
