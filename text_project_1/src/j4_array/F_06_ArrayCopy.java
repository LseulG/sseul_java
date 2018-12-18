package j4_array;

public class F_06_ArrayCopy {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] dest = new int[6];
		
//		System.arraycopy(arr, 0, dest, 0, arr.length);
//		
//		for(int i : dest) {
//			System.out.print(i);
//		}
	
		
		System.arraycopy(arr, 0, dest, 0, 5);
		
		for(int i : dest) {
			System.out.print(i);
		}

	}

}
