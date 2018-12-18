package j10_aa;

public class M_03_Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}

class CallListener implements M_03_Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}

