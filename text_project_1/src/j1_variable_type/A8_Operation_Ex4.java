package j1_variable_type;

public class A8_Operation_Ex4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// >, <, >=, <=, ==, !=
				
		/*
		boolean b1 = (a>=b); //F
		boolean b2 = (a<=b); //T
		boolean b3 = (a>b); //F
		boolean b4 = (a<b);  //T
		boolean b5 = (a==b); //F
		boolean b6 = (a!=b); //T
		*/
		
		boolean b1 = (a>=b)&&(a<=b); // F&T : F 
		boolean b2 = (a<=b)||(a<=b); // T|T : T
		boolean b3 = (a>b)^(a==b); 	 // F^F : F
		boolean b4 = !(a<b);		 // !T : F
		boolean b5 = (a==b)|(a==b);  // F|F : F
		boolean b6 = (a!=b)&(a==b);  // T&F : F
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}

}
