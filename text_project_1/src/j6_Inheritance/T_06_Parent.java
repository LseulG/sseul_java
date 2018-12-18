package j6_Inheritance;

public class T_06_Parent {
	public String nation;
	
	public T_06_Parent() {
		this("¥Î«—πŒ±π");
		System.out.println("Parent() call");
	}
	
	public T_06_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
