package j3_loopArray;

public class T_06_StringEqual {

	public static void main(String[] args) {
		String strVar1 = "����";
		String strVar2 = "����";
		
		if(strVar1 == strVar2) {
			System.out.println("var1�� var2�� ������ ����");
		} else {
			System.out.println("var1�� var2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("var1�� var2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("����");
		String strVar4 = new String("����");
		
		if(strVar3 == strVar4) {
			System.out.println("var3�� var4�� ������ ����");
		} else {
			System.out.println("var3�� var4�� ������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("var3�� var4�� ���ڿ��� ����");
		}
		/////
		if(strVar1 == strVar4) {
			System.out.println("var1�� var4�� ������ ����");
		} else {
			System.out.println("var1�� var4�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar4)) {
			System.out.println("var1�� var4�� ���ڿ��� ����");
		}
		
	}

}
