package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//대부분의 콜렉션은 toString()을 제공한다.
		System.out.println(myList);
		
		myList.add(1, "D");
		System.out.println(myList);
		myList.removeFirst();
		System.out.println(myList);
		
		for(int i = 0; i<myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
		
		
	}

}
