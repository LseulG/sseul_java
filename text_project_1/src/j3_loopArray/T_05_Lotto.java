package j3_loopArray;

public class T_05_Lotto {

	public static void main(String[] args) {
		int lot1 = (int)(Math.random()*45+1);
		int lot2 = (int)(Math.random()*45+1);
		int lot3 = (int)(Math.random()*45+1);
		
		while(true) {
			if(lot1 == lot2 || lot2 == lot3 || lot3 == lot1) {
				lot1 = (int)(Math.random()*45+1);
				lot2 = (int)(Math.random()*45+1);
				lot3 = (int)(Math.random()*45+1);
			} else { 
				System.out.println(lot1 + "," + lot2 + "," + lot3);
				break; 
			}
		}
	}

}
