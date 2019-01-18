package test3;

public class SmartPhone {
	String maker;
	String name;
	int price;
	int discountRate;
	
	public SmartPhone(String maker, String name, int price) {
		this.maker = maker;
		this.name = name;
		this.price = price;
		
		System.out.println(name + " [" + maker + "]");
		System.out.println("가격 : " + price);
		System.out.println("-----------------");
	}
	public SmartPhone(String maker, String name, int price, int discountRate) {
		this.maker = maker;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
		
		System.out.println(name + " [" + maker + "]");
		System.out.println("가격 : " + this.price);

		this.price = calculateDiscount();
		System.out.println("할인가격 : " + this.price);
		System.out.println("-----------------");
	}	
	public Integer calculateDiscount() {
		price = price*(100-discountRate)/100;
		return price;
	}
}
