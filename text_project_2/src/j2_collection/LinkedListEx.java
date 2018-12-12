package j2_collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (String s : list) {
			System.out.println(s);
		}
	}

}
