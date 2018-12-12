package j2_generic;

public class T2_C {

	public static void main(String[] args) {
		Container2<String, String> container1 = new Container2<String, String>();
		container1.set("È«±æµ¿","µµÀû");
		String name1 = container1.getKey();
		String job = container1.getValue();

		Container2<String, Integer> container2 = new Container2<String, Integer>();
		container2.set("È«±æµ¿",35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}

}

//class Container2 <T, M>{
//	private T t;
//	private M m;
//	
//	public void set(T t, M m) { this.t= t; }
//	
//	public T getKey() { return this.t; }
//	public M getValue() { return this.m; }
//		
//}

class Container2 <K, V>{
	private K key;
	private V value;
	
	public void set(K key, V value) { 
		this.key = key;
		this.value = value;
	}
	
	
		
}