package j6_Inheritance;

public class T_04_Lexus extends T_04_Car{
	
	T_04_Lexus(){
		// super�� �׻� �� ���� 
		super("������",1000); //3�� ȣ��
		System.out.println("Lexus ������");
	}
	
	
	void driveBack() {
		System.out.println("������");
	}

}
