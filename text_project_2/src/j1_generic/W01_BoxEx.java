package j1_generic;

public class W01_BoxEx {

	public static void main(String[] args) {
		W01_Box<String> box = new W01_Box<String>();
		box.set("sleeeeeeeeeeeeeep");
		String sbox = box.get();
		System.out.println(sbox);
		
		W01_InterBox<String> ibox = new W01_InterBox<String> () {
			private String t;
			
			@Override
			public String get() {
				return t;
			}

			@Override
			public void set(String t) {
				this.t = t;
			}
			
		};
	}

}
