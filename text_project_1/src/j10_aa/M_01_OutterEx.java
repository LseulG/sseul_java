package j10_aa;

public class M_01_OutterEx {

	public static void main(String[] args) {
		M_01_Outter outter = new M_01_Outter();
		M_01_Outter.NestedClass nested = outter.new NestedClass();
		
		System.out.println(outter.M_01_Outter); // Outter field
		outter.method(); // Outter method
		
		System.out.println(nested.nested); // nested field
		nested.method(); // nested method
		
	}

}
