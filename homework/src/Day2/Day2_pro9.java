package Day2;

public class Day2_pro9 {
	//ȸ������ ���ϴ� ���α׷�.
	//ȸ������ ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ���� ��. 12321, 13531
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0; //���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp !=0) {
			//�ۼ�			
			result = result + tmp%10;
			tmp = tmp / 10; 
			if(tmp !=0)
				result = result * 10;  
		}
		
		if(number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
	}

}
