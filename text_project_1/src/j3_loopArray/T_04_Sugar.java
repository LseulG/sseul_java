package j3_loopArray;

import java.util.Scanner;

public class T_04_Sugar {
	/*
	�������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ���. ������ ������.
	������ 3ų�α׷� ������ 5ų�α׷� ����. �ִ��� ���� ����
	���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 
	3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, 
	�� ���� ������ ������ ����� �� �ִ�.
	NŰ�� ����� �� �ּ� ����.  (3 �� N �� 5000)
	
	
	*******3���,5����� �ƴ� ��� -1. ex)4
	*/
	public static void main(String[] args) {
		int n = 0; // �Է� ���� ���� ��
		int bongCnt = 0; // ��� �� ���� ��
		int num = 1; // ���� ��ȣ
		
		System.out.println("��� ������ ������ ���� 3~5000kg �Դϴ�.");
		
		while(num > 0) {
			System.out.println("���� �Է� " + num);
			
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			bongCnt = n;
			
						
			if(n>=3 && n<=5000) {			
				
				for(int x=0; x<n; x++) {
					for(int y=0; y<n; y++) {
						if((3*x+5*y) == n) {
							System.out.println(x + "," + y);
							bongCnt = Math.min(bongCnt, (x+y));
						}
					}
				}
				System.out.println("���� ��� " + bongCnt);
				System.out.println(bongCnt);
				num++;
				
			} else {
				System.out.println("���� ��� " + bongCnt);
				System.out.println("-1");
				num = 0;
			} // if end

		} // while end
	} // main end

}
