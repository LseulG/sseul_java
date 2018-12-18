package j3_loopArray;

public class T_Exer_PC {
	//5P3, 5C3 - 3Áßfor¹®
	//5P3 = 5!/(5-3)!
	//5C3 = 5!/3!(5-3)!
	public static void main(String[] args) {
		int pCnt = 0;
		int cCnt = 0;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				for(int k=1; k<=5; k++) {
					if(i == j || j == k || i==k) {
					} else {
						System.out.print("(" + i + "," + j + "," + k + ")");
						pCnt += 1;
					}
				}
				System.out.println();
			}
		}
		System.out.println("5P3 : " + pCnt);
		
		for(int i=1; i<=5; i++) {
			for(int j=2; j<=5; j++) {
				for(int k=3; k<=5; k++) {
					if(i<j && j<k) {
						System.out.print("(" + i + "," + j + "," + k + ")");
						cCnt += 1;
					}
				}
			}
			System.out.println();
		}
		System.out.println("5C3 : " + cCnt);
	}

}
