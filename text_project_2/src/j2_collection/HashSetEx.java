package j2_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		
		hashset.add("C");
		hashset.add("A");
		hashset.add("B");
		hashset.add("A"); // 중복은 안나옴!
		
		
		Iterator<String> iterator = hashset.iterator();
//		System.out.println(iterator.next()); // A
//		System.out.println(iterator.next()); // B
//		System.out.println(iterator.next()); // C
//		System.out.println(iterator.next()); // error

		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // 중복 제외
		}
		
		System.out.println(hashset.size()); // 3
		
	}

}
