package Day1;

public class Day1_pro6 {
	//num������ ũ�鼭�� ���� ����� 10�� �������
	//���� num�� ���� �� �������� ���ϴ� �ڵ�.
	//24�� ũ�鼭�� ���� ����� 10�ǹ���� 30. 19�� 20, 81�� 90.
	//30���� 24�� �� �������� 6.
	//������ �����ڸ� ���
	public static void main(String[] args) {
		int num = 24;

		//System.out.println(((num/10)+1)*10 - num);
		System.out.println((num-num%10)+10 - num);
	}
}
