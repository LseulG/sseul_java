package j9_exception;

public class F_07_gg {
	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString()); //nullpo
			
			String data2 = "a200";
			int value1 = Integer.parseInt(data2); //numberformat
			
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("nullpo");
		} catch (Exception e0) {
			System.out.println("exception");
		} finally {
			System.out.println("finally");
		}
	}
}
