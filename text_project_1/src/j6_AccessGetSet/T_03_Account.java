package j6_AccessGetSet;

public class T_03_Account {
	private int balance = 0; // 잔고. 음수x 최대 100만. 외부 변경x
	// 0 <= bal <= 1000000
	
	static final int minBalance = 0;
	static final int maxBalance = 1000000;
	
	//getter
	int getBalance() {
		return this.balance;
	}
	
	//setter
	void setBalance(int balance) {
		if(balance >= minBalance && balance <= maxBalance) {
			this.balance = balance;
		} else {
			// ?
		}
	}
	
	public static void main(String[] args) {
		T_03_Account acc = new T_03_Account();
		
		acc.setBalance(1000);
		System.out.println("현재 잔고: " + acc.getBalance());
		
		acc.setBalance(-100);
		System.out.println("현재 잔고: " + acc.getBalance());
		
		acc.setBalance(2000000);
		System.out.println("현재 잔고: " + acc.getBalance());
		
		acc.setBalance(300000);
		System.out.println("현재 잔고: " + acc.getBalance());

	}

}
