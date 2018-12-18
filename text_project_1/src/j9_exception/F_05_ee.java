package j9_exception;

public class F_05_ee {
	public static void main(String[] args) {
		try {
			//.String data = "a";
			String data = null;
			System.out.println(data.toString());
		} catch (Exception e) {
			System.out.println("exception");
		} 
//		finally {
//			System.out.println("finally");
//		}
	}
}
