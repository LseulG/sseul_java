package j3_loopArray;

public class T_08_PiboArray {

	public static void main(String[] args) {
		int[] pibo = new int[10];
		
		pibo[0] = 0;
		pibo[1] = 1;
		
		for(int i=2; i<pibo.length; i++) {
			pibo[i] = pibo[i-2] + pibo[i-1];			
		}
		
		for(int i=0; i<pibo.length; i++) {
			System.out.print(pibo[i] + " ");
		}
		
	}

}
