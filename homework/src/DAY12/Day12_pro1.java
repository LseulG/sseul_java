package DAY12;

import java.util.ArrayList;

public class Day12_pro1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		kyo.addAll(list1); // kyo 뒤에 list1 추가
		kyo.retainAll(list2); // kyo에서 kyo와 list2 중복 된 것만 남기고 나머지 삭제
		
		cha.addAll(list1);
		cha.removeAll(list2); // cha에서 cha와 list2 중복 된 것들 삭제
		
		hap.addAll(list1);
		hap.addAll(list2);		
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
	}
}
