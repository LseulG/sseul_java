package a7_String;

import java.text.DecimalFormat;

public class fromatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		
		String sum = "a";
		sum = df.format(num) + sum;
		
		System.out.println(sum);
	}

}
