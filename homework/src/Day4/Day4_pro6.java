package Day4;

public class Day4_pro6 {
	//�Ž������� ��� �������� ������ �� �ִ��� ���
	//money�� �ݾ��� �������� �ٲپ����� ���� ��� ������ �ʿ����� ����Ͽ� ���
	//�������� ���� ���� �������� �Ž��� �־�� �Ѵ�.
	//������ �����ڿ� ������ �����ڸ� ���
	//money=2680 \ 500��:5 \ 100��:1 \ 50��:1 \ 10��3
	public static void main(String[] args) {
		//ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "�� : " + money/coinUnit[i]);
			money = money%coinUnit[i];			
		}

	}

}
