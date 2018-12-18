package j9_exception;

public class F_06_ff {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행매개값의 수 부족");
			System.out.println("실행 방법");
			System.out.println("java");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e2) {
			System.out.println("숫자로 변환 할수 없다");
		} finally {
			System.out.println("다시실행");
		}
	}
}
