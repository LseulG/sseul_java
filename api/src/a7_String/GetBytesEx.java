package a7_String;

import java.io.UnsupportedEncodingException;

public class GetBytesEx {
	/* 3
	 * getBytes()
	 * 문자열을 바이트 배열로 변환(인코딩)
	 * 
	 * 네트워크로 문자열을 전송하거나 문자열을 암호화 할때
	 */
	public static void main(String[] args) {
		String str = "NIKE";
		
		byte[] bytes1 = str.getBytes(); 	// 기본 문자셋으로 인코딩
		
		for (int i=0; i<bytes1.length; i++) {
			System.out.print(bytes1[i] + " ");	 // 바이트 배열 출력
		}
		System.out.println();
		
		String strD = new String(bytes1);	 // 기본 문자셋으로 디코딩 후 문자열 출력
		System.out.println(strD);
		System.out.println();
		
		
		
		String str2 = "안녕하세오";
		try {
			byte[] bytes2 = str2.getBytes("UTF-8");		// 특정 문자셋으로 인코딩
			System.out.println("UTF-8 길이: " + bytes2.length);
			
			byte[] bytes3 = str2.getBytes("EUC-KR");
			System.out.println("EUC-KR 길이: " + bytes3.length);
			
			// UTF-8 : 알파벳 1바이트, 한글 3바이트
			// EUC-KR : 알파벳 1바이트, 한글 2바이트
			
			String str2D = new String(bytes2, "UTF-8"); 	// 특정 문자셋으로 디코딩
			System.out.println(str2D);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace(); 	// 잘못된 문자셋을 매개값으로 줄 경우 예외처리
		}
	}

}
