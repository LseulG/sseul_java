package j6_Inheritance;

public class T_05_Child extends T_05_Parent{
	private int studentNo;
	
	public T_05_Child(String name, int sudentNo) {
		//this.name = name;
		super(name);
		this.studentNo = studentNo;
	}

}
