package test2;

public class BookOrderTest {

	public static void main(String[] args) {
		int javaPrice = 24000;
		int jqueryPrice = 21000;
		int oraclePrice = 19000;
		int springPrice = 35000;
		
		int totalPrice = 0;
		int salePrice = 0;
				
		System.out.println("===== ���� ���� ��� =====");
		System.out.println("JAVA : " + javaPrice);
		System.out.println("JQuery : " + jqueryPrice);
		System.out.println("����Ŭ : " + oraclePrice);
		System.out.println("������ : " + springPrice);
		System.out.println("--------------------------");
		
		totalPrice = javaPrice + jqueryPrice + oraclePrice + springPrice;
		salePrice = totalPrice - (int) (totalPrice*0.15);
		
		System.out.println("�ֹ� �ѱݾ� : " + totalPrice + "��");
		System.out.println("������ ���� �ݾ� : " + salePrice + "��");		
	}
}
