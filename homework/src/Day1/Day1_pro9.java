package Day1;

public class Day1_pro9 {
	//�빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ�
	//ch�� �빮���� ��쿡�� �ҹ��ڷ� ����.
	//�����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ��
	//A�� 65, a�� 97
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (char) ((ch>=65 && ch<=90) ? (ch+32) : ch);
		
		System.out.println("ch:"+ch); //A
		System.out.println("ch to lowerCase:"+lowerCase); //a
	}

}
