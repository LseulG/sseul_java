package j2_conditionLoopFunction;

import java.io.IOException;
import java.util.Scanner;

public class B_11_DoWhile_Ex1 {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("------------------");
				System.out.print("선택:");
			}
			
			//keyCode = System.in.read();
			Scanner sc = new Scanner(System.in);
			keyCode = sc.nextInt();			
			
			if(keyCode == 1) { // 1입력
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 2) { // 2입력
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 3) { // 3입력
				run = false;
			} 	
		}
		
		System.out.println("프로그램 종료");
	}

}
