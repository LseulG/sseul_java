package j4_array;

public class F_05_Five {

	public static void main(String[] args) {
		int[][] five = new int[5][5];
		int num = 1;
		int total = 0; //ÃÑÇÕ
		int cnt = 0; //ÃÑ°³¼ö
		
		for(int i = 0; i<five.length; i++) {
			for(int j=0; j<five[i].length; j++) {
				five[i][j] = num;
				num++;
			}
		}// for end
			
		for(int i = 0; i<five.length; i++) {
			for(int j=0; j<five[i].length; j++) {
				//System.out.print(five[i][j] + " ");
				total = total + five[i][j];
				cnt++;
			}
			//System.out.println();
		}// for end
		
		//System.out.println("Æò±Õ:" + (total/cnt));
		//System.out.println("ÀüÃ¼ÇÕ:" + total);
		
//		int[][] six = new int[5][6];
//		int sum = 0;
//		
//		for(int i = 0; i<six.length; i++) {
//			sum = 0;
//			for(int j=0; j<six[i].length-1; j++) {
//				six[i][j] = five[i][j];
//				sum = sum + six[i][j];
//			}
//			six[i][six[i].length-1] = sum;
//		}// for end
//				
//		for(int i = 0; i<six.length; i++) {
//			for(int j=0; j<six[i].length; j++) {
//				System.out.print(six[i][j] + " ");
//			}
//			System.out.println();
//		}// for end
		
		// À¸¾û
		
		int[][] four = new int[4][4];
		int avg = 0;
		
		for(int i = 0; i<four.length; i++) {
			for(int j=0; j<four[i].length; j++) {
				avg = ( five[i][j] + five[i][j+1] + five[i+1][j] + five[i+1][j+1] ) / 4;
				four[i][j] = avg; 
			}
			
		}// for end
		
		for(int i = 0; i<four.length; i++) {
			for(int j=0; j<four[i].length; j++) {
				System.out.print(four[i][j] + " ");
			}
			System.out.println();
		}// for end
		

	}//main end

}
