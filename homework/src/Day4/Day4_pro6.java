package Day4;

public class Day4_pro6 {
	//거스름돈을 몇개의 동전으로 지불할 수 있는지 계산
	//money의 금액을 동전으로 바꾸었을때 각각 몇개의 동전이 필요한지 계산하여 출력
	//가능한한 적은 수의 동전으로 거슬러 주어야 한다.
	//나눗셈 연산자와 나머지 연산자를 사용
	//money=2680 \ 500원:5 \ 100원:1 \ 50원:1 \ 10원3
	public static void main(String[] args) {
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i]);
			money = money%coinUnit[i];			
		}

	}

}
