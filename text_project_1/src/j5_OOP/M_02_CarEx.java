package j5_OOP;

public class M_02_CarEx {

	public static void main(String[] args) {
		//M_02_Car mycar = new M_02_Car();
		M_02_Car mycar = new M_02_Car("���׽ý�");
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		
		mycar.maxSpeed = 380;
		System.out.println(mycar.maxSpeed);

		M_02_Car sCar = new M_02_Car("BMW","S�ø���");
		System.out.println(sCar.company);
		System.out.println(sCar.model);
		System.out.println(sCar.color);
		System.out.println(sCar.maxSpeed);
	}

}

//���� ���� �ص� �ǰ� �� ���Ͽ� ���� �ص� ��
class M_02_Car{
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	String type = "����";
	int maxSpeed = 350;
	int speed;
	
	//M_02_Car(); �ƹ��͵� �Ⱦ��� �ڵ� ����
	
	M_02_Car(String _model){
		model = _model;
	}
	
	M_02_Car(String _company, String _model){
		company = _company;
		model = _model;
	}
}