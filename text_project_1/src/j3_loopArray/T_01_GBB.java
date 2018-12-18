package j3_loopArray;

import java.util.Scanner;

public class T_01_GBB {
	//가위바위보
	public static void main(String[] args) {
		int com = (int)(Math.random()*3); // 0가위 1바위 2보
		int me = 0;
		int result = 3;
		String myStr=null, comStr=null, resultStr=null;
		
		Scanner sc = new Scanner(System.in);
		me = sc.nextInt();
		
		result = (com - me +2) % 3; //1me 0com 2비김
		
		switch (com) {
		case 2: comStr = "보"; break;
		case 1: comStr = "바위"; break;
		case 0: comStr = "가위"; break;
		}
		
		switch (me) {
		case 2: myStr = "보"; break;
		case 1: myStr = "바위"; break;
		case 0: myStr = "가위"; break;
		}
		
		switch (result) {
		case 2: resultStr = "비겼습니다"; break;
		case 1: resultStr = "당신이 이겼습니다."; break;
		case 0: resultStr = "컴퓨터가 이겼습니다."; break;
		}
		
		System.out.println(com);
		System.out.println("컴퓨터 : " + comStr);
		System.out.println(me);
		System.out.println("나는 : " + myStr);
		System.out.println("");
		

	}

}
