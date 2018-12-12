package j1_generic;

public class W02_ProductEx {

	public static void main(String[] args) {
		W02_Product <Car, String> car = new W02_Product <Car, String> ();
		car.setKind(new Car());
		car.setModel("BMW");
		
		System.out.println(car.getKind().kind);
		System.out.println(car.getModel());
		
	}

}
