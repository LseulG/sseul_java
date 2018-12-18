package a5_System;

public class GarbageCollectorEx {
	/* 2
	 * gc()
	 * Garbage Collector(쓰레기 수집기) : 메모리가 부족하거나 CPU가 한가할 때 사용하지 않는 객체 제거
	 * 메소드 실행 시 gc가 바로 실행되는 것은 아니고 빠른 시간 내에 실행시키기 위해 노력
	 * gc 실행 시 프로그램의 속도가 떨어져 성능 측면에서 좋지 않다.
	 * 
	 */
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1); // garbage
		emp = null;
		
		emp = new Employee(2); // garbage
		emp = new Employee(3);		
		
		System.gc();
	}

}

class Employee{
	public int eno;

	public Employee (int eno) {
		this.eno = eno;
	}
}