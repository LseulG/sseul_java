package j2_conditionLoopFunction;

import java.util.Scanner;

public class B_Exer_4chp {

	public static void main(String[] args) {
		//3
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("3�� ����� ��: " + sum);
		
		//4
//		int dice1 = (int)(Math.random() * 6 + 1);
//		int dice2 = (int)(Math.random() * 6 + 1);
//		
//		while(true) {
//			System.out.println(dice1 + "," + dice2);
//			if(dice1+dice2 != 5) {
//				dice1 = (int)(Math.random() * 6 + 1);
//				dice2 = (int)(Math.random() * 6 + 1);
//				continue;
//			} else if (dice1+dice2 == 5) {
//				break;
//			}
//		}
		
		//5 ��øfor��, 4x+5y=60�� ��� �� ���
//		for(int x=1; x<=10; x++) {
//			for(int y=1; y<=10; y++) {
//				if((4*x+5*y) == 60) {
//					System.out.println("(" + x + "," + y + ")");
//				}
//			}
//		}
		
		//6
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//7
//		boolean run = true;
//		int balance = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(run) {
//			System.out.println("----------------------");
//			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
//			System.out.println("----------------------");
//			System.out.print("����>");
//			
//			//�ۼ�
//			int num = sc.nextInt();
//			int won;
//			
//			if(num == 1) {
//				System.out.print("���ݾ�>");
//				won = sc.nextInt();
//				balance = balance + won;				
//			} else if(num == 2) {
//				System.out.print("��ݾ�>");
//				won = sc.nextInt();
//				balance = balance - won;
//			} else if(num == 3) {
//				System.out.println("�ܰ�>" + balance);
//			} else {
//				run = false;
//			}
//		}
//		System.out.println("���α׷� ����");
//
	}

}
