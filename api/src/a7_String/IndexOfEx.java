package a7_String;

public class IndexOfEx {
	/* 4
	 * length()
	 * ���ڿ� ���� ����
	 * 
	 * indexOf()
	 * �Ű������� �־��� ���ڿ��� ���۵Ǵ� �ε��� ����
	 * ���Ե��� ���� ������ -1 ����
	 * 
	 * replace()
	 * ���ڿ� ��ġ
	 * ù ��° �Ű� ���� ã�� �� ��° �Ű��� ���ڿ��� ��ġ(ġȯ)
	 * 
	 */
	public static void main(String[] args) {
		String sub = "�ڹ� ���α׷���";
		
		int length = sub.length();
		System.out.println("���ڿ� ����: " + length); 	// ���� ����		
		
		int index = sub.indexOf("���α׷���");
		System.out.println("���α׷����� ���۵Ǵ� �ε��� ��ġ: " + index);
		
		String newSub = sub.replace("�ڹ�", "JAVA");
		System.out.println("���ڿ� ġȯ ��: " + newSub);
	}

}
