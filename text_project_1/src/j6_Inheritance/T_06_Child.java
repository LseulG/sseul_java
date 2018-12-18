package j6_Inheritance;

public class T_06_Child extends T_06_Parent{
	private String name;
	
	public T_06_Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public T_06_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}

}
