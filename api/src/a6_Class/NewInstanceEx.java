package a6_Class;

public class NewInstanceEx {
	/* 3
	 * newInstance()
	 * 동적 객체 생성
	 */
	public static void main(String[] args) {
		try {
			Class clazzS = Class.forName("a6_Class.Send");
			Action action = (Action) clazzS.newInstance();
			action.execute();
			
			Class clazzR = Class.forName("a6_Class.Receive");
			action = (Action) clazzR.newInstance();
			action.execute();
			
			Class getClass = Class.forName("a6_Class.GetEx");
			Object ob = getClass.newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	// 매개값으로 주어진 클래스를 찾지 못하면 예외 처리
		} catch (InstantiationException e) {
			e.printStackTrace(); 	// 해당 클래스가 추상 클래스이거나 인터페이스일 경우 예외 처리
		} catch (IllegalAccessException e) {
			e.printStackTrace();	// 클래스나 생성자가 접근 제한자로 인해 접근할 수 없을 경우 예외 처리
		}
	}

}

//	public interface Action {
//		public void execute();
//	}

class Send implements Action{
	@Override
	public void execute() {
		System.out.println("Send execute");
	}
}

class Receive implements Action{
	@Override
	public void execute() {
		System.out.println("Receive execute");
	}
}