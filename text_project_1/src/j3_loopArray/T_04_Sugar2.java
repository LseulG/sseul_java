package j3_loopArray;

import java.util.Scanner;

public class T_04_Sugar2 {
	/*
	사탕가게에 설탕을 정확하게 N킬로그램을 배달. 설탕은 봉지에.
	봉지는 3킬로그램 봉지와 5킬로그램 봉지. 최대한 적은 봉지
	예를 들어, 18킬로그램 설탕을 배달해야 할 때, 
	3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 
	더 적은 개수의 봉지를 배달할 수 있다.
	N키로 배달할 때 최소 봉지.  (3 ≤ N ≤ 5000)
	
	
	5배수, 3배수
	*/
	public static void main(String[] args) {
		int n = 0; // 입력 받을 설탕 양
		int bongCnt = 0; // 배달 할 봉지 수
		int num = 1; // 예제 번호
		
		System.out.println("배달 가능한 설탕의 양은 3~5000kg 입니다.");
		
		while(num > 0) {
			System.out.println("예제 입력 " + num);
			
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			bongCnt = n;
						
			if(n%5==0 && n%3==0) {
				
				//n()
				

				System.out.println("예제 출력 " + bongCnt);
				num++;
				
			} else {
				System.out.println("예제 출력 " + bongCnt);
				System.out.println("-1");
				num = 0;
			}

		} // while문 종료
	}

}
