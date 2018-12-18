package j1_variable_type;

public class A7_StringConcatEx {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징"; //JDK6.0특징
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //JDK33.0
		String str4 = 3 + 3.9 + "JDK"; //6.9JDK //숫자 연산 먼저
		System.out.println(str3);
		System.out.println(str4);
		
		String str = "JDK";
		str = 'J' + "AVA" + "JDK";
		System.out.println(str);	
	}
}
