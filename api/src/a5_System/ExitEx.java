package a5_System;

import java.util.Scanner;

public class ExitEx {
	/* 1
	 * exit();
	 * ���� �����ϰ� �ִ� ���α׷��� ���� �����Ű�� �޼ҵ�
	 * 
	 * System.exit(0);
	 * int�� �Ű����� ���� - ���� ������ ��� 0, ������ ������ ��� 0 �̿��� �ٸ���.
	 */
	public static void main(String[] args) {
		int num; //�Է¹��� ��
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
				
		while(run) {
			System.out.println("1��-while�� ����, 2��-���α׷� ����. ������");
			num = sc.nextInt();
			
			switch(num) {
			
			case 1: 
				System.out.println("while���� ����Ǿ����ϴ�.");
				run = false;
				break;
			case 2:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
				
			default:
				System.out.println("1���̳� 2���߿� �ٽ� �����ϼ���");
			}
		} // while-end
		
		System.out.println("main end");
		
	} // main-end

}
