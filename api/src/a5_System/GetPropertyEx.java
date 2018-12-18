package a5_System;

public class GetPropertyEx {
	/* 4
	 * getProperty()
	 * System Property : �ڵ� �����Ǵ� �ý����� �Ӽ���
	 * 
	 * String value = System.getProperty(String key);
	 * key�� �Ű������� �޾� ���ڿ��� ����
	 * 
	 * 5
	 * getenv()
	 * ȯ�� ���� �б�
	 */

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("�ü�� �̸�: " + osName);
		
		System.out.println("�ڹ� ����: " + System.getProperty("java.version"));
		System.out.println("JRE ���� ���: " + System.getProperty("java.home"));
		System.out.println("����� �̸�: " + System.getProperty("user.name"));
		System.out.println("������� Ȩ ���丮: " + System.getProperty("user.home"));
		System.out.println("����ڰ� ���� �۾����� ���丮: " + System.getProperty("user.dir"));
		System.out.println();
		
		System.out.println("ȯ�� ����: " + System.getenv("JAVA_HOME"));
		
	}

}
