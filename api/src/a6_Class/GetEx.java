package a6_Class;

public class GetEx {
	/* 1
	 * getClass(), forName()
	 * Class 객체 얻기
	 * Class 객체를 받아오는 메서드
	 */

	public static void main(String[] args) {
		
		// getClass() 메소드는 해당 클래스로 객체를 생성했을 때만 사용 가능
		Car car = new Car();
		Class clazz1 = car.getClass(); 
		
		System.out.println("클래스 이름: " + clazz1.getSimpleName()); // 클래스 이름
		System.out.println("패키지 이름: " + clazz1.getPackage().getName()); // 패키지 이름
		System.out.println("패키지,클래스 이름: " + clazz1.getName()); // 클래스 전체 이름(패키지 포함)
		System.out.println();
		
		
		// forName() 메소드는 객체를 생성하기 전에 직접 class 객체를 얻을 때 사용
		try {
			Class clazz2 = Class.forName("a6_Class.Car"); /******수정*******/
			System.out.println(clazz2.getName()); // 클래스 전체 이름(패키지 포함)
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 매개값으로 주어진 클래스를 찾지 못하면 예외 처리
		} 	
	}

}

class Car{
	//
}