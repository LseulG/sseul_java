package j3_loopArray;

import java.util.Scanner;

public class T_04_Sugar2 {
	/*
	�������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ���. ������ ������.
	������ 3ų�α׷� ������ 5ų�α׷� ����. �ִ��� ���� ����
	���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 
	3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, 
	�� ���� ������ ������ ����� �� �ִ�.
	NŰ�� ����� �� �ּ� ����.  (3 �� N �� 5000)
	
	
	5���, 3���
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
						
			if(n%5==0 && n%3==0) {
				
				//n()
				

				System.out.println("���� ��� " + bongCnt);
				num++;
				
			} else {
				System.out.println("���� ��� " + bongCnt);
				System.out.println("-1");
				num = 0;
			}

		} // while�� ����
	}

}
