package j5_OOP;

public class M_02_CarEx {

	public static void main(String[] args) {
		//M_02_Car mycar = new M_02_Car();
		M_02_Car mycar = new M_02_Car("제네시스");
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		
		mycar.maxSpeed = 380;
		System.out.println(mycar.maxSpeed);

		M_02_Car sCar = new M_02_Car("BMW","S시리즈");
		System.out.println(sCar.company);
		System.out.println(sCar.model);
		System.out.println(sCar.color);
		System.out.println(sCar.maxSpeed);
	}

}

//파일 따로 해도 되고 한 파일에 같이 해도 됨
class M_02_Car{
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	String type = "세단";
	int maxSpeed = 350;
	int speed;
	
	//M_02_Car(); 아무것도 안쓰면 자동 생성
	
	M_02_Car(String _model){
		model = _model;
	}
	
	M_02_Car(String _company, String _model){
		company = _company;
		model = _model;
	}
}