package j3_loopArray;

public class T_07_Array {

	public static void main(String[] args) {
		//제일 많이 쓰는 표현
		int[] scores = {83, 90, 87}; // 0, 1, 2
		
		//그다음 많이 쓰는 표현
		int[] num;
		num = new int[] {1, 2, 3};
		
//		int[] arr;
//		arr = new int[3];
//		arr[0] = 1;
		
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores.length);

		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += num[i];
		}
		System.out.println(sum);
		
		double avg = (double) sum / 3;
		System.out.println(avg);
		
		
	}

}
