package a6_Class;

public class NewInstanceEx {
	/* 3
	 * newInstance()
	 * ���� ��ü ����
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
			e.printStackTrace();	// �Ű������� �־��� Ŭ������ ã�� ���ϸ� ���� ó��
		} catch (InstantiationException e) {
			e.printStackTrace(); 	// �ش� Ŭ������ �߻� Ŭ�����̰ų� �������̽��� ��� ���� ó��
		} catch (IllegalAccessException e) {
			e.printStackTrace();	// Ŭ������ �����ڰ� ���� �����ڷ� ���� ������ �� ���� ��� ���� ó��
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