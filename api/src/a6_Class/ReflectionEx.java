package a6_Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {
	/* 2
	 * getDeclaredConstructors() 생성자
	 * getDeclaredFields() 필드
	 * getDeclaredMethods() 메서드
	 * 리플렉션 : 클래스 정보
	 * 
	 */	
	public static void main(String[] args) {
		Car2 car = new Car2();
		Class clazz = car.getClass(); 
			
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		} 
		System.out.println();
		
		
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

	} // main-end
	
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getSimpleName());
			if (i < (parameters.length-1)) {
				System.out.print(", ");
			}
		}
	}

}

class Car2{
	String model;
	int carNum;
	
	// Car2(){	}
	
	void run() {
		System.out.println("자동차가 달립니다.");
	}
	
	void stop(String model, int carNum) {
		System.out.println(model + "자동차가 멈춥니다.");
	}
}