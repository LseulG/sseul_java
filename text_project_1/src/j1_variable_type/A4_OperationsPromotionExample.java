package j1_variable_type;

public class A4_OperationsPromotionExample {

	public static void main(String[] args) {
		//byte, char�� �����ϸ鼭 int�� ��ȯ�Ǿ� �����.
		
		byte byteValue1 = 10; 
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); //30
		
		char charValue1 = 'A'; //65
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�=" + intValue2); //66
		System.out.println("��¹���=" + (char)intValue2); //B
		// sysout + ctrl + space
		
		int intValue5 = 10;
		//int intValue4 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue); //2.5
	}

}
