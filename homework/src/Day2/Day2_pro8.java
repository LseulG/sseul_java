package Day2;

public class Day2_pro8 {
	//1�� 1���� �����ϴ� �Ǻ���ġ ������ 10��° �� 
	//1,1,2,3,5,8,13,21,34,55
	public static void main(String[] args) {
		//�Ǻ���ġ ������ ������ ù �� ���ڸ� 1,1�� �Ѵ�.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // ����° ��
		
		System.out.print(num1 + "," + num2);
		
		for(int i = 0; i<8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
