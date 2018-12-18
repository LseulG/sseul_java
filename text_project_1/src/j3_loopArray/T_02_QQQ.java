package j3_loopArray;

import java.util.Scanner;

public class T_02_QQQ {

	public static void main(String[] args) {
		int com = (int)(Math.random()*100 + 1); // 1~100까지 난수 
		int me = 0; // 입력받을 값
		boolean run = true; 
		int runCnt = 0; //run 카운트
		Scanner sc = new Scanner(System.in);
		
		System.out.println("~스무고개(1-100) 시작~");
		
		while(run){  
			System.out.print("입력해주세오>");
			me = sc.nextInt();
			
			if(me>=1 && me<=100) {
				if(com < me) {
					System.out.println(me + "보다 작습니다 =(");
				} else if(com > me) {
					System.out.println(me + "보다 큽니다 =(");
				} else {
					System.out.println("축하합니다~~~~~~~~ 정답입니다 =)");
					run = false;				
				}
			} else {
				System.out.println("1-100 사이의 수를 입력해주세오");
			}
			
			runCnt++;
			if(runCnt == 20) {
				System.out.println("실패! 정답은 " + com + "입니다...T.T");
				run = false;
			}
		}
	}

}
