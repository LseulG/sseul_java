package j9_exception;

public class F_02_bb {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//ArrayIndexOutOfBoundsException
		//for (int i=0; i<arr.length+1; i++) {
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
