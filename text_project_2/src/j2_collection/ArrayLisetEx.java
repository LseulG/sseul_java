package j2_collection;

import java.util.Arrays;
import java.util.List;

public class ArrayLisetEx {
	// ctrl + shift + o : import �ڵ� �߰�
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
	
		/* List �� remove ���� x 
		list.remove(0); // A ����, B C D ������ �̵�
		System.out.println(list.get(0));
		// B
		
		list.remove("C");	// C ����	
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		// B D
		*/

		
		System.out.println(list.indexOf("B"));
		// �ε��� 0
		
		list.set(0, "F"); // 0�� �ε����� F �� ����
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		// B D -> F D
		
	}

}
