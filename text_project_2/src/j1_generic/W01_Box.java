package j1_generic;

public class W01_Box <T> {
	private T t;
	//Box() <T> {} �⺻ ������
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
