package j10_aa;

public class M_03_ButtonEx {

	public static void main(String[] args) {
		M_03_Button btn = new M_03_Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
	}

}
