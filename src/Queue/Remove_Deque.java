package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Remove_Deque {

	public static void main(String[] args) {
		Deque<String>animals=new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");
        animals.add("Hen");
        animals.add("Tiger");
        animals.add("Lion");
       /* System.out.println("ArrayDeque: "+animals);
        String element = animals.remove();
        System.out.println("Removed Elements: "+element);
        animals.remove("cow");
        System.out.println("New ArrayDeque: "+animals);
        String firstElement = animals.removeFirst();
        System.out.println("Removed First Elements: "+firstElement);
        String lastElement = animals.removeLast();
        System.out.println("Removed Last Elements: "+lastElement);
        System.out.println("New ArrayDeque: "+animals);
        animals.clear();
        System.out.println("New ArrayDeque:"+animals);*/
        System.out.println("\nArrayDeque: ");
        Iterator<String>iterator=animals.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(",");
		}
		System.out.println("\nArrayDeque in reverse order:");
		Iterator<String>desIterator=animals.descendingIterator();
		while(desIterator.hasNext()) {
			System.out.print(desIterator.next());
			System.out.print(",");
		}
	}

}
