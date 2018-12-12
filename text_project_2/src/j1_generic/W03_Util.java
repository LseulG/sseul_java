package j1_generic;

public class W03_Util {
	public static <T> W01_Box<T> boxing(T t){
		W01_Box<T> box = new W01_Box<T>();
		box.set(t);
		return box; 
	}
		
}
