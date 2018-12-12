package j1_generic;

public class W3_BoxingEx {

	public static void main(String[] args) {
		//System.out.println(W03_Util.boxing("hihihihi"));
		
		W01_Box<Integer> box1 = W03_Util.<Integer>boxing(100);
	}

}
