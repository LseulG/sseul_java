package j6_Inheritance;

public class T_04_SonataEx {

	public static void main(String[] args) {
		T_04_Sonata sonata = new T_04_Sonata();
		sonata.color = "���";
		sonata.drive();
		//sonata.driveBack();
		
		System.out.println(sonata.color);
		
		T_04_Lexus lexus = new T_04_Lexus();
		lexus.color = "������";
		lexus.drive();
		lexus.driveBack();
		
		System.out.println(lexus.color);

	}

}
