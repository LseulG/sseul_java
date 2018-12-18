package j6_Inheritance;

public class T_04_Lexus extends T_04_Car{
	
	T_04_Lexus(){
		// super는 항상 맨 위에 
		super("검정색",1000); //3번 호출
		System.out.println("Lexus 생성자");
	}
	
	
	void driveBack() {
		System.out.println("후진중");
	}

}
