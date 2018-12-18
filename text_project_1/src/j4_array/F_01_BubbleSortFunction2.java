package j4_array;

public class F_01_BubbleSortFunction2 {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 5, 9, 1, 8};
		int temp = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(arr[j]>arr[j+1]) {
					swap(j, j+1, arr);
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
	} // main end
	
	public static void swap(int a, int b, int[] array) {
		int temp;
		
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
	} // swap end

}
