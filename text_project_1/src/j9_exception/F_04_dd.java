package j9_exception;

public class F_04_dd {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal = dog; // �ڵ�����ȯ
		dog = (Dog) animal; // ��������ȯ
	
		
	}
}

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}