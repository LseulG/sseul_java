package j8_interface;

public class T_05_QueueClass implements T_05_Queue{
	char[] arr = new char[5];
	int pushPointer = 0;
	int popPoiner = 0;
	
	@Override
	public int size() {// 원소 개수
		int cnt = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] >=65 && arr[i]<=86) {
				cnt++;
			}
		}
		return cnt;
	}
	
	@Override
	public Object top() {// 읽기 
		char result = arr[popPoiner];
		System.out.println("top:" + result);
		return result;
	}
	
	@Override
	public Object pop() { // 읽고 삭제
		char result = arr[popPoiner];
		if(empty() == true) {
			System.out.println("비어있습니다.");
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
	public boolean push(Object ob){ // 삽입 
		if(size() < 5) { //arr이  빈칸이 있으면
			arr[pushPointer++] = (char)ob;
			System.out.println("push:"+arr[pushPointer-1]);
			if(pushPointer == 5) {
				pushPointer = 0;
			}
			return true;
		} else { // arr이 다 찼으면
			System.out.println("꽉찼습니다.");
			return false;
		}
	}
	
	@Override
	public boolean empty(){ // 확인 비어있으면 true 1개이상 false
		int cnt=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] >=65 && arr[i]<=86) {
				cnt++;
			}
		}
		
		if(cnt == 0) {
			return true; // 비어있으면
		} else {
			return false; // 1개이상 차있으면
		}
	}
}
