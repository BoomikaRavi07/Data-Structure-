package Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class SearchElement {

	public static void main(String[] args) {
		Stack<String>stk = new Stack<>();
		stk.push("Mac Book");
		stk.push("HP");
		stk.push("DELL");
		stk.push("Asus");
		stk.push("Linux");
		System.out.println("Stack: "+stk);
		int location=stk.search("HP");
		System.out.println(stk.search("Test"));
		System.out.println("Location of Dell:"+location);
		System.out.println("Size of the stack: "+stk.size());
		Iterator iterator = stk.iterator();
		while(iterator.hasNext()) {
			Object values = iterator.next();
			System.out.println(values);
		}
			System.out.println("\nFor Each: ");
			stk.forEach(n -> System.out.println(n));
	
			ListIterator<String>ListIterator=stk.listIterator(stk.size());
			System.out.println("\nIterator over thr stack from top to bottom:");
			while(ListIterator.hasPrevious())
			{
				String avg = ListIterator.previous();
				System.out.println(avg);
			}
	}

}
