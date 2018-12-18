package j8_interface;

public class T_05_QueueEx {

	public static void main(String[] args) {
		T_05_QueueClass qu = new T_05_QueueClass();
		qu.push('A');
		qu.push('B');
		qu.push('C');
		qu.push('D');
		qu.push('E');
		
		qu.pop();
		qu.pop();
		
		qu.push('F');
		qu.pop();
		qu.pop();
		qu.pop();
		qu.pop();
		qu.pop();
		
		qu.push('A');
		qu.push('B');
		qu.pop();
	}
}
