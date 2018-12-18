package j2_conditionLoopFunction;

public class B_12_BreakContinue {

	public static void main(String[] args) {
		int i=1;
		boolean run = true;
		while (run) {
			i++;
			System.out.println(i++);
			if(i==100) {
				continue;
			}
			System.out.println(i);
			if(i==102) {
				run = false;
				break;
			}
		}
	}

}
