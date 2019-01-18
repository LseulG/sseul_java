package test1;

import java.util.Scanner;

public class MultipleCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scanNum;
		int countTwo = 0, countThree = 0, countFive = 0;
			
		System.out.print("반복 횟수를 입력하세요 : ");
		scanNum = sc.nextInt();
		
		for (int i=1; i<=scanNum; i++) {
			System.out.print(i+".");
			if (i%2 == 0) {
				System.out.print(" 2의배수");
				countTwo++;
			} 
			if (i%3 == 0){
				System.out.print(" 3의배수");
				countThree++;
			}
			if (i%5 == 0){
				System.out.print(" 5의배수");
				countFive++;
			}
			System.out.println();
		}
		
		System.out.println("===== 출력 횟수 =====");
		System.out.println("2의 배수 : " + countTwo);
		System.out.println("3의 배수 : " + countThree);
		System.out.println("5의 배수 : " + countFive);
		
		
	}

}
