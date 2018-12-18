package j9_exception;

public class F_04_dd {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal = dog; // 자동형변환
		dog = (Dog) animal; // 강제형변환
	
		
	}
}

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}