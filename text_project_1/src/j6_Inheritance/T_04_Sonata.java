package j6_Inheritance;

public class T_04_Sonata extends T_04_Car{
	T_04_Sonata(){
		// super는 항상 맨 위에 
		super("검정색",1000); //3번 호출
		System.out.println("Sonata 생성자");
	}
}
