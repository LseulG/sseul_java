package Day1;

public class Day1_pro8 {
	//ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 
	//변수 b의 값이 true가 되도록 하는 코드
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9') ?
				true : false);
		
		System.out.println(b);
	}
}
