package j7_supermarket.copy;

public class SuperEx {

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.buy(new Banana());
		cus.buy(new Milk());
		cus.buy(new Egg());
		cus.buy(new Bread());
		cus.total();
	}

}
