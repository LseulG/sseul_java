package j2_collection;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<>();
		
		hashTable.put("hong", "1234");
		hashTable.put("yeo", "4321");
		hashTable.put("lee", "12");
		
		String pw = hashTable.get("hong");
		//System.out.println(pw);
		
		
		System.out.print("id: ");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		
		if (hashTable.containsKey(id)) {
			System.out.print("pw: ");
			pw = sc.nextLine();
			if (hashTable.get(id).equals(pw)) {
				System.out.println("����������");
			} else {
				System.out.println("���������");
			}
		} else {
			System.out.println("id������");
		}
				
//		if (hashTable.containsKey("yeo")) {		
//			if (hashTable.get("yeo").equals("1234")) {
//				System.out.println("����������");
//			} else {
//				System.out.println("���������");
//			}
//		} else {
//			System.out.println("����������");
//		}
	}
}
