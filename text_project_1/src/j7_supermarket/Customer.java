package j7_supermarket;

// 10000�� ������ �ȵǰ�
// 5�� �� ���� 10���� �÷��ְ�

public class Customer {
	int a = 5;
	Product[] pro = new Product[a];
	int i = 0;

	
	void buy(Product p) {
		if(i <= a-1) {
			pro[i++] = p;			
		} else {
			Product[] pro2 = new Product[a+5];
			for(int j=0; j<a; j++) {
				pro2[j] = pro[j];
			}
			a += 5;
			pro = new Product[a];
			for(int j=0; j<i; j++) {
				pro[j] = pro2[j];
			}
			pro[i++] = p;	
		}
	}
	
	
	void total() {
		int sum = 0;
		for(int j=0; j<i; j++) {
			sum = sum + pro[j].price;
		}
		if(sum > 10000) {
			System.out.println("���� �����....=(");
		} else {
			System.out.println(sum);
		}
	}
	

}
