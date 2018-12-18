package j3_loopArray;

public class T_06_StringEqual {

	public static void main(String[] args) {
		String strVar1 = "포뇨";
		String strVar2 = "포뇨";
		
		if(strVar1 == strVar2) {
			System.out.println("var1과 var2는 참조가 같음");
		} else {
			System.out.println("var1과 var2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("var1과 var2는 문자열이 같음");
		}
		
		String strVar3 = new String("포뇨");
		String strVar4 = new String("포뇨");
		
		if(strVar3 == strVar4) {
			System.out.println("var3과 var4는 참조가 같음");
		} else {
			System.out.println("var3과 var4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("var3과 var4는 문자열이 같음");
		}
		/////
		if(strVar1 == strVar4) {
			System.out.println("var1과 var4는 참조가 같음");
		} else {
			System.out.println("var1과 var4는 참조가 다름");
		}
		
		if(strVar1.equals(strVar4)) {
			System.out.println("var1과 var4는 문자열이 같음");
		}
		
	}

}
