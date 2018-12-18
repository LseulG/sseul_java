package j3_loopArray;

public class T_Exer_BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 5, 9, 1, 8};
		int temp = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
