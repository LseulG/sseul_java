package j8_interface;

public class T_04_StackClass implements T_04_Stack {
	char[] arr = new char[5];
	int pointer = 0;
		
	@Override
	public int length() {
		int cnt = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] >=65 && arr[i]<=86) {
				cnt++;
			}
		}
		return cnt;
	};
	
	@Override
	public Object pop() {
		char result = arr[--pointer];
		arr[pointer] = ' ';
		return result;
	}; //»èÁ¦
	
	@Override
	public boolean push(Object ob) {
		arr[pointer++] = (char)ob;
		return true;
	}; // »ðÀÔ
}
