package a7_String;

public class LowerUpperEx {
	/* 5
	 * toLowerCase()
	 * ���ĺ� �ҹ��� ����
	 * 
	 * toUpperCase()
	 * ���ĺ� �빮�� ����
	 * 
	 */

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println("����: " + str1);
		System.out.println("�ҹ���: " + str1.toLowerCase());
		System.out.println("�빮��: " + str1.toUpperCase());
		System.out.println();
		
		// ���ڿ� �� (��,�ҹ��� ����)
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase()
		// ��,�ҹ��� ���� ���� ���ڿ� ��
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
