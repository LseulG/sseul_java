package a6_Class;

public class GetEx {
	/* 1
	 * getClass(), forName()
	 * Class ��ü ���
	 * Class ��ü�� �޾ƿ��� �޼���
	 */

	public static void main(String[] args) {
		
		// getClass() �޼ҵ�� �ش� Ŭ������ ��ü�� �������� ���� ��� ����
		Car car = new Car();
		Class clazz1 = car.getClass(); 
		
		System.out.println("Ŭ���� �̸�: " + clazz1.getSimpleName()); // Ŭ���� �̸�
		System.out.println("��Ű�� �̸�: " + clazz1.getPackage().getName()); // ��Ű�� �̸�
		System.out.println("��Ű��,Ŭ���� �̸�: " + clazz1.getName()); // Ŭ���� ��ü �̸�(��Ű�� ����)
		System.out.println();
		
		
		// forName() �޼ҵ�� ��ü�� �����ϱ� ���� ���� class ��ü�� ���� �� ���
		try {
			Class clazz2 = Class.forName("a6_Class.Car"); /******����*******/
			System.out.println(clazz2.getName()); // Ŭ���� ��ü �̸�(��Ű�� ����)
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // �Ű������� �־��� Ŭ������ ã�� ���ϸ� ���� ó��
		} 	
	}

}

class Car{
	//
}