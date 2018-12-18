package j8_abstract;

public class T_02_AnimalEx {

	public static void main(String[] args) {
		// ���1
		T_02_Cat cat = new T_02_Cat();
		T_02_Dog dog = new T_02_Dog();
		cat.Sound();
		dog.breathe();
		
		// ���2
		T_02_Animal animal = null;
		animal = new T_02_Cat();
		animal.Sound();
		animal.breathe();
		animal = new T_02_Dog();
		animal.Sound();
		animal.breathe();
		
		// ���3_sound�� �����ϰ� �Լ� ����
		animalSound(new T_02_Cat());
		animalSound(new T_02_Dog());
	}
	
	public static void animalSound(T_02_Animal animal) {
		animal.Sound();
	}

}
