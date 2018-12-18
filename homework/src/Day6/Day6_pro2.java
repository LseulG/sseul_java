package Day6;

public class Day6_pro2 {
	static int max(int[] arr) {
		int i=0;
		int mmax = 0;
		if (arr == null || arr.length == 0) {
			return (-999999);
		} else {
			while(i<arr.length-1) {
				if (mmax < Math.max(arr[i],arr[i+1])) {
					mmax = Math.max(arr[i],arr[i+1]);
				} 
				i++;
			} // while end
			return mmax;			
		} // if-else end
	}
	
	static int abs(int value) {
		return Math.abs(value);
	}
		
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data)); //9
		System.out.println("최대값:" + max(null)); // -999999
		System.out.println("최대값:" + max(new int[] {})); //크기가 0인 배열 //-999999
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value)); //5
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value)); //10
	}
}
