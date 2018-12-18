package j7_supermarket.copy;

public class Customer {
//	Product[] milk = new Product[5];
//	Product[] banana = new Product[5];
//	Product[] egg = new Product[5];
//	Product[] bread = new Product[5];
	Product[] pro = new Product[5];
	int i = 0;
//	int ba = 0;
//	int eg = 0;
//	int mi = 0;
//	int br = 0;
	
	void buy(Product p) {
//		if (p instanceof Banana) {
//			banana[ba++] = p;
//		} else if (p instanceof Milk) {
//			milk[mi++] = p;
//		} else if (p instanceof Egg) {
//			egg[eg++] = p;
//		} else if (p instanceof Bread) {
//			bread[br++] = p;
//		}
		pro[i++] = p;
	}
	
	
	void total() {
		int sum = 0;
		for(int j=0; j<i; j++) {
			sum = sum + pro[j].price;
		}
		System.out.println(sum);
	}
	

}
