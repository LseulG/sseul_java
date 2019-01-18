package test3;

public class SmartPhoneTest {

	public static void main(String[] args) {
		System.out.println("=== 제품목록 ===");
		System.out.println("-----------------");
		
		SmartPhone sp = new SmartPhone("삼성","갤럭시노트2",850000);
		sp = new SmartPhone("애플","아이폰5",740000,30);
		sp = new SmartPhone("삼성","갤럭시s3",750000,35);
	}

}
