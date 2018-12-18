package DAY9;

import java.util.StringTokenizer;

public class Day9_pro5 {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1 splict() 이용
		String[] infos = str.split(",");
		
		for (String info : infos) {
			System.out.println(info);
		}		
		System.out.println();
		
		//방법2 StringTokenizer 이용
		StringTokenizer st = new StringTokenizer(str, ",");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
