package a5_System;

import java.util.Scanner;

public class ExitEx {
	/* 1
	 * exit();
	 * 현재 실행하고 있는 프로그램을 강제 종료시키는 메소드
	 * 
	 * System.exit(0);
	 * int형 매개값을 지정 - 정상 종료일 경우 0, 비정상 종료일 경우 0 이외의 다른값.
	 */
	public static void main(String[] args) {
		int num; //입력받을 값
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
				
		while(run) {
			System.out.println("1번-while문 종료, 2번-프로그램 종료. 고르세오");
			num = sc.nextInt();
			
			switch(num) {
			
			case 1: 
				System.out.println("while문이 종료되었습니다.");
				run = false;
				break;
			case 2:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				
			default:
				System.out.println("1번이나 2번중에 다시 선택하세오");
			}
		} // while-end
		
		System.out.println("main end");
		
	} // main-end

}
