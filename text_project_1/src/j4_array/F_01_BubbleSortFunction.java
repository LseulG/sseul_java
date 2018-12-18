package j4_array;

public class F_01_BubbleSortFunction {
	
	static int[] arr = new int[] {10, 5, 9, 1, 8};

	public static void main(String[] args) {
		int temp = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(arr[j]>arr[j+1]) {
					swap(j, j+1);
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
	} // main end
	
	public static void swap(int a, int b) {
		int temp;
		
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	} // swap end

}
