package j4_array;

public class F_04_Gugudan3 {

	public static void main(String[] args) {
		int[][] gugu = new int[9][3];
		
//		for(int i=0; i<gugu.length; i++) {
//			for(int j=0; j<gugu[i].length; j++) {
//				switch(j) {
//				case 0:
//					gugu[i][j] = 3;
//					break;
//				case 1:
//					gugu[i][j] = i+1;
//					break;
//				case 2:
//					gugu[i][j] = 3 * (i+1);
//					break;
//				default:
//					break;
//				} // switch end
//			}
//		} // for end
		
		for(int i=0; i<gugu.length; i++) {
			gugu[i][0] = 3;
			gugu[i][1] = i+1;
			gugu[i][2] = gugu[i][0] * gugu[i][1];
		}

//		for(int i=0; i<gugu.length; i++) {
//			for(int j=0; j<gugu[i].length; j++) {
//				System.out.print(gugu[i][j] + " ");
//			}
//			System.out.println();
//		} // for end
		

		//for-each
		for(int[] i : gugu) {
			for(int num : i) {
				System.out.print(num + " ");
			}
			System.out.println();
		}		
		
//		int[] arr = {1,2,3,4,5};
//		for(int arrNum : arr) {
//			System.out.print(arrNum + " ");
//		}
		
	}

}
