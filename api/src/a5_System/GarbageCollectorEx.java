package a5_System;

public class GarbageCollectorEx {
	/* 2
	 * gc()
	 * Garbage Collector(������ ������) : �޸𸮰� �����ϰų� CPU�� �Ѱ��� �� ������� �ʴ� ��ü ����
	 * �޼ҵ� ���� �� gc�� �ٷ� ����Ǵ� ���� �ƴϰ� ���� �ð� ���� �����Ű�� ���� ���
	 * gc ���� �� ���α׷��� �ӵ��� ������ ���� ���鿡�� ���� �ʴ�.
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