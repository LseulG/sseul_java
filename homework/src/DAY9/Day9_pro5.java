package DAY9;

import java.util.StringTokenizer;

public class Day9_pro5 {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		//���1 splict() �̿�
		String[] infos = str.split(",");
		
		for (String info : infos) {
			System.out.println(info);
		}		
		System.out.println();
		
		//���2 StringTokenizer �̿�
		StringTokenizer st = new StringTokenizer(str, ",");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
