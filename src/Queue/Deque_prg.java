package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque_prg {

	public static void main(String[] args) {
		Deque<String>numbers=new ArrayDeque<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		numbers.add("four");
		numbers.add("five");
		System.out.println("Deque Elements: "+numbers);
		numbers.addFirst("red");
		numbers.addLast("blue");
		System.out.println("Elements "+numbers);
		 String firstElement = numbers.peekFirst();
	        System.out.println("First Element: "+firstElement);
	        numbers.remove("red");
	        numbers.remove("blue");
	        System.out.println("Elements "+numbers);
	        numbers.remove("three");
	        System.out.println("Elements "+numbers);
	        System.out.print("Elements in reverse :");
			Iterator<String>desIterator=numbers.descendingIterator();
			while(desIterator.hasNext()) {
				System.out.print(desIterator.next());
				System.out.print(",");
	}
	}
}
