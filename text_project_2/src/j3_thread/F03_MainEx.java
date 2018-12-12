package j3_thread;

public class F03_MainEx {

	public static void main(String[] args) {
		F03_Calculator calc = new F03_Calculator();
		
		User1 user1 = new User1();
		user1.setCalc(calc);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalc(calc);
		user2.start();
	}

}
