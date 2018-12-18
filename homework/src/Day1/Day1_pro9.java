package Day1;

public class Day1_pro9 {
	//대문자를 소문자로 변경하는 코드
	//ch가 대문자인 경우에만 소문자로 변경.
	//문자코드는 소문자가 대문자보다 32만큼 더 크다
	//A는 65, a는 97
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (char) ((ch>=65 && ch<=90) ? (ch+32) : ch);
		
		System.out.println("ch:"+ch); //A
		System.out.println("ch to lowerCase:"+lowerCase); //a
	}

}
