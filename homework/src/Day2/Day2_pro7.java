package Day2;

public class Day2_pro7 {
	//intŸ���� ���� num�� ������, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ�
	//num = 12345 ��� '1+2+3+4+5'�� ����� 15 ���
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		//�ڵ�
		while(num != 0) {
			sum = sum + (num%10);
			num = num / 10;
		}
		
		System.out.println("sum="+sum);

	}

}
