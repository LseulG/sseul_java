package a7_String;

import java.io.UnsupportedEncodingException;

public class GetBytesEx {
	/* 3
	 * getBytes()
	 * ���ڿ��� ����Ʈ �迭�� ��ȯ(���ڵ�)
	 * 
	 * ��Ʈ��ũ�� ���ڿ��� �����ϰų� ���ڿ��� ��ȣȭ �Ҷ�
	 */
	public static void main(String[] args) {
		String str = "NIKE";
		
		byte[] bytes1 = str.getBytes(); 	// �⺻ ���ڼ����� ���ڵ�
		
		for (int i=0; i<bytes1.length; i++) {
			System.out.print(bytes1[i] + " ");	 // ����Ʈ �迭 ���
		}
		System.out.println();
		
		String strD = new String(bytes1);	 // �⺻ ���ڼ����� ���ڵ� �� ���ڿ� ���
		System.out.println(strD);
		System.out.println();
		
		
		
		String str2 = "�ȳ��ϼ���";
		try {
			byte[] bytes2 = str2.getBytes("UTF-8");		// Ư�� ���ڼ����� ���ڵ�
			System.out.println("UTF-8 ����: " + bytes2.length);
			
			byte[] bytes3 = str2.getBytes("EUC-KR");
			System.out.println("EUC-KR ����: " + bytes3.length);
			
			// UTF-8 : ���ĺ� 1����Ʈ, �ѱ� 3����Ʈ
			// EUC-KR : ���ĺ� 1����Ʈ, �ѱ� 2����Ʈ
			
			String str2D = new String(bytes2, "UTF-8"); 	// Ư�� ���ڼ����� ���ڵ�
			System.out.println(str2D);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace(); 	// �߸��� ���ڼ��� �Ű������� �� ��� ����ó��
		}
	}

}
