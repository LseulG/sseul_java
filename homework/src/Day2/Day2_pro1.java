package Day2;

public class Day2_pro1 {
	//ȭ��F�� ����C�� ��ȯ�ϴ� �ڵ�
	//C = 5/9 * (F-32)
	//�Ҽ��� ��°�ڸ����� �ݿø�. Math.round() ������� �ʰ� ó��
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (float)((5.0/9.0) * (fahrenheit-32));
		//float celcius = 5f/9f*(float)(fahrenheit-32);
		
//		if((celcius*100)%10 >= 5) {
//			celcius = (int)(celcius*100 + 1)/100f;
//		} else {
//			celcius = (int)(celcius*100)/100f;
//		}
//		
		System.out.println("Fahrenheit:" + fahrenheit); //100
		System.out.println("Celcius:" + celcius); //37.78
	}
}
