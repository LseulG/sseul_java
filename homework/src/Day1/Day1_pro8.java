package Day1;

public class Day1_pro8 {
	//ch�� ������(�빮�� �Ǵ� �ҹ���)�̰ų� ������ ���� 
	//���� b�� ���� true�� �ǵ��� �ϴ� �ڵ�
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9') ?
				true : false);
		
		System.out.println(b);
	}
}
