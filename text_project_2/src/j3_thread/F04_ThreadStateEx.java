package j3_thread;

public class F04_ThreadStateEx {

	public static void main(String[] args) {
		F04_StatePrintThread statePrintThread = 
				new F04_StatePrintThread(new F04_TargetThread));
		statePrintThread.start();
	}

}
