package j8_interface;

public class T_05_QueueClass implements T_05_Queue{
	char[] arr = new char[5];
	int pushPointer = 0;
	int popPoiner = 0;
	
	@Override
	public int size() {// ���� ����
		int cnt = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] >=65 && arr[i]<=86) {
				cnt++;
			}
		}
		return cnt;
	}
	
	@Override
	public Object top() {// �б� 
		char result = arr[popPoiner];
		System.out.println("top:" + result);
		return result;
	}
	
	@Override
	public Object pop() { // �а� ����
		char result = arr[popPoiner];
		if(empty() == true) {
			System.out.println("����ֽ��ϴ�.");
		} else {
			System.out.println("pop:" + result);
			arr[popPoiner] = ' ';
			popPoiner++;
			if(popPoiner == 5) {
				popPoiner = 0;
			}
		}
		return result;
	}
	
	@Override
	public boolean push(Object ob){ // ���� 
		if(size() < 5) { //arr��  ��ĭ�� ������
			arr[pushPointer++] = (char)ob;
			System.out.println("push:"+arr[pushPointer-1]);
			if(pushPointer == 5) {
				pushPointer = 0;
			}
			return true;
		} else { // arr�� �� á����
			System.out.println("��á���ϴ�.");
			return false;
		}
	}
	
	@Override
	public boolean empty(){ // Ȯ�� ��������� true 1���̻� false
		int cnt=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] >=65 && arr[i]<=86) {
				cnt++;
			}
		}
		
		if(cnt == 0) {
			return true; // ���������
		} else {
			return false; // 1���̻� ��������
		}
	}
}
