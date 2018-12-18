package Day2;

public class Day2_pro9 {
	//회문수를 구하는 프로그램.
	//회문수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수. 12321, 13531
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0; //변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp !=0) {
			//작성			
			result = result + tmp%10;
			tmp = tmp / 10; 
			if(tmp !=0)
				result = result * 10;  
		}
		
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}

}
