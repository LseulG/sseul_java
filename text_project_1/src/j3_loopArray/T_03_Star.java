package j3_loopArray;

public class T_03_Star {

	public static void main(String[] args) {
		int n = 1;
		
		for(int i=0; i<7; i++) {
			if(i<3) {
				for(int j1=0; j1<(4-n); j1++) {
					System.out.print(" ");
				}
				
				for(int j2=0; j2<n; j2++) {
					System.out.print("*");
				}
				
				System.out.println();
				n++;
				
			} else {
				for(int j1=0; j1<(4-n); j1++) {
					System.out.print(" ");
				}
				
				for(int j2=0; j2<n; j2++) {
					System.out.print("*");
				}
				
				System.out.println();
				n--;
				
			} // if-else문 종료
		} // for문 종료
		
		
		for(int i=0; i<4; i++) {
			for(int j = i+1; j<4; j++) {
				System.out.println(" ");
			}
			for(int k = i; k>=0; k--) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
		
}
