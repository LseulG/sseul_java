package j3_loopArray;

import java.util.Scanner;

public class T_02_QQQ {

	public static void main(String[] args) {
		int com = (int)(Math.random()*100 + 1); // 1~100���� ���� 
		int me = 0; // �Է¹��� ��
		boolean run = true; 
		int runCnt = 0; //run ī��Ʈ
		Scanner sc = new Scanner(System.in);
		
		System.out.println("~������(1-100) ����~");
		
		while(run){  
			System.out.print("�Է����ּ���>");
			me = sc.nextInt();
			
			if(me>=1 && me<=100) {
				if(com < me) {
					System.out.println(me + "���� �۽��ϴ� =(");
				} else if(com > me) {
					System.out.println(me + "���� Ů�ϴ� =(");
				} else {
					System.out.println("�����մϴ�~~~~~~~~ �����Դϴ� =)");
					run = false;				
				}
			} else {
				System.out.println("1-100 ������ ���� �Է����ּ���");
			}
			
			runCnt++;
			if(runCnt == 20) {
				System.out.println("����! ������ " + com + "�Դϴ�...T.T");
				run = false;
			}
		}
	}

}
