package test2;

public class BookOrderTest {

	public static void main(String[] args) {
		int javaPrice = 24000;
		int jqueryPrice = 21000;
		int oraclePrice = 19000;
		int springPrice = 35000;
		
		int totalPrice = 0;
		int salePrice = 0;
				
		System.out.println("===== 도서 구입 목록 =====");
		System.out.println("JAVA : " + javaPrice);
		System.out.println("JQuery : " + jqueryPrice);
		System.out.println("오라클 : " + oraclePrice);
		System.out.println("스프링 : " + springPrice);
		System.out.println("--------------------------");
		
		totalPrice = javaPrice + jqueryPrice + oraclePrice + springPrice;
		salePrice = totalPrice - (int) (totalPrice*0.15);
		
		System.out.println("주문 총금액 : " + totalPrice + "원");
		System.out.println("할인후 결제 금액 : " + salePrice + "원");		
	}
}
