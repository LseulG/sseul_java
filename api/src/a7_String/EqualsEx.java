package a7_String;

public class EqualsEx {
	/* 2
	 * equals()
	 * ���ڿ� �� �޼ҵ�
	 */
	public static void main(String[] args) {
		String str1 = "���̾�";
		String str2 = new String("���̾�");
		
		// == ������ : �����ϴ� ��ü(�ּҰ�) ��
		if (str1 == str2) {
			System.out.println("���� String ��ü ����");
		} else {
			System.out.println("�ٸ� String ��ü ����");
		}
		
		
		// equals() : ���ڿ� ��
		if (str1.equals(str2)) {
			System.out.println("���� ���ڿ�");
		} else {
			System.out.println("�ٸ� ���ڿ�");
		}
		
	}

}
