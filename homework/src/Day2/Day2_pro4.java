package Day2;

public class Day2_pro4 {
	//다음의 for문을 while문으로 변경
	public static void main(String[] args) {
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		int i=0;
		int j=0;
		while(i<=10) {
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			j = 0;
			i++;
		}
		
	}

}
