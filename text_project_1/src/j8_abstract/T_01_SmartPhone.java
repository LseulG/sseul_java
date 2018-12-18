package j8_abstract;

public class T_01_SmartPhone extends T_01_Phone{
	T_01_SmartPhone(String owner){
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("internet search");
	}
	
	@Override
	public void call() {
		System.out.println("call");
	};
}
