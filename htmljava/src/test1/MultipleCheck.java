package test1;

import java.util.Scanner;

public class MultipleCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scanNum;
		int countTwo = 0, countThree = 0, countFive = 0;
			
		System.out.print("�ݺ� Ƚ���� �Է��ϼ��� : ");
		scanNum = sc.nextInt();
		
		for (int i=1; i<=scanNum; i++) {
			System.out.print(i+".");
			if (i%2 == 0) {
				System.out.print(" 2�ǹ��");
				countTwo++;
			} 
			if (i%3 == 0){
				System.out.print(" 3�ǹ��");
				countThree++;
			}
			if (i%5 == 0){
				System.out.print(" 5�ǹ��");
				countFive++;
			}
			System.out.println();
		}
		
		System.out.println("===== ��� Ƚ�� =====");
		System.out.println("2�� ��� : " + countTwo);
		System.out.println("3�� ��� : " + countThree);
		System.out.println("5�� ��� : " + countFive);
		
		
	}

}
