package j7_supermarket;

public class SuperEx {

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.buy(new Banana()); //1000
		cus.buy(new Milk()); //2000
		cus.buy(new Egg()); //100
		cus.buy(new Bread()); //1500
		cus.buy(new Banana());
		
		cus.buy(new Banana());
		cus.buy(new Banana());
		cus.buy(new Banana());
		cus.buy(new Banana());
		//cus.buy(new Banana());
		
		//cus.buy(new Banana());

		

		cus.total();
	}

}
