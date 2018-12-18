package a6_Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {
	/* 2
	 * getDeclaredConstructors() ������
	 * getDeclaredFields() �ʵ�
	 * getDeclaredMethods() �޼���
	 * ���÷��� : Ŭ���� ����
	 * 
	 */	
	public static void main(String[] args) {
		Car2 car = new Car2();
		Class clazz = car.getClass(); 
			
		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName());
		System.out.println();
		
		
		
		System.out.println("[�ʵ� ����]");
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		} 
		System.out.println();
		
		
		
		System.out.println("[������ ����]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		
		System.out.println("[�޼ҵ� ����]");
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
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
	
	void stop(String model, int carNum) {
		System.out.println(model + "�ڵ����� ����ϴ�.");
	}
}