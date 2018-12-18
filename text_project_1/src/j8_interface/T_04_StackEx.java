package j8_interface;

public class T_04_StackEx {

	public static void main(String[] args) {
		T_04_StackClass stc = new T_04_StackClass();
		stc.push('A');
		stc.push('B');
		stc.push('C');
		
		System.out.println(stc.length());
		System.out.println(stc.pop());
		System.out.println(stc.pop());
		System.out.println(stc.pop());
		
//		T_04_Stack stack = new T_04_Stack() {
//			char[] arr = new char[5];
//			int pointer = 0;
//					
//			@Override
//			public Object peek() {
//				int temp = pointer;
//				char result = arr[--temp];
//				return result;
//			}
//		};
//		stack.peek();
	}

}
