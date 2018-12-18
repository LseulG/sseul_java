package Day6;

public class Day6_pro4 {
	static boolean isNumber(String str) {
		for(int i=0; i<str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))) {
				return false;
			} 
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str)); //t
		str = "123ㅇ";
		System.out.println(str + "는 숫자입니까? " + isNumber(str)); //f
		str = "d123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str)); //f
	}
}
