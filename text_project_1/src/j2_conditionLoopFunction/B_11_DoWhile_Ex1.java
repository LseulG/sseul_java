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
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("------------------");
				System.out.print("����:");
			}
			
			//keyCode = System.in.read();
			Scanner sc = new Scanner(System.in);
			keyCode = sc.nextInt();			
			
			if(keyCode == 1) { // 1�Է�
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 2) { // 2�Է�
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 3) { // 3�Է�
				run = false;
			} 	
		}
		
		System.out.println("���α׷� ����");
	}

}
