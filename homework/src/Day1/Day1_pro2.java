package Day1;

public class Day1_pro2 {

	public static void main(String[] args) {
		int numOfAples = 123; //����� ����
		int sizeOfBucket = 10; //�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = ((numOfAples%sizeOfBucket > 0)? numOfAples/sizeOfBucket+1 : numOfAples/sizeOfBucket+1); //��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
	}

}
