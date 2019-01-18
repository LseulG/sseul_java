package test5;

public class SonataArrayTest {

	public static void main(String[] args) {
		String arry[][] = { { "흰색", "5000", "NF", "승용" }, { "은색", "7000", "Brilliant", "업무" },
				{ "감홍색", "4000", "EF", "택시" }, { "검정색", "6000", "Hybrid", "승용" } };

		for (int i = 0; i < arry.length; i++) {
			Sonata sona = new Sonata(arry[i][0], Integer.parseInt(arry[i][1]), arry[i][2], arry[i][3]);
			System.out.println(sona.toString());
		}

	}

}
