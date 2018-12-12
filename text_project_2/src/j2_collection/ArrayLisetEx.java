package j2_collection;

import java.util.Arrays;
import java.util.List;

public class ArrayLisetEx {
	// ctrl + shift + o : import 자동 추가
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		
//		ArrayList<String> list = new ArrayList<String>();		
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
		
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		// A B C D
	
		/* List 는 remove 지원 x 
		list.remove(0); // A 삭제, B C D 앞으로 이동
		System.out.println(list.get(0));
		// B
		
		list.remove("C");	// C 삭제	
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		// B D
		*/

		
		System.out.println(list.indexOf("B"));
		// 인덱스 0
		
		list.set(0, "F"); // 0번 인덱스를 F 로 변경
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		// B D -> F D
		
	}

}
