package j3_loopArray;

import java.util.Scanner;

public class T_01_GBB {
	//����������
	public static void main(String[] args) {
		int com = (int)(Math.random()*3); // 0���� 1���� 2��
		int me = 0;
		int result = 3;
		String myStr=null, comStr=null, resultStr=null;
		
		Scanner sc = new Scanner(System.in);
		me = sc.nextInt();
		
		result = (com - me +2) % 3; //1me 0com 2���
		
		switch (com) {
		case 2: comStr = "��"; break;
		case 1: comStr = "����"; break;
		case 0: comStr = "����"; break;
		}
		
		switch (me) {
		case 2: myStr = "��"; break;
		case 1: myStr = "����"; break;
		case 0: myStr = "����"; break;
		}
		
		switch (result) {
		case 2: resultStr = "�����ϴ�"; break;
		case 1: resultStr = "����� �̰���ϴ�."; break;
		case 0: resultStr = "��ǻ�Ͱ� �̰���ϴ�."; break;
		}
		
		System.out.println(com);
		System.out.println("��ǻ�� : " + comStr);
		System.out.println(me);
		System.out.println("���� : " + myStr);
		System.out.println("");
		

	}

}
