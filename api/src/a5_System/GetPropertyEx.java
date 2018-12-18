package a5_System;

public class GetPropertyEx {
	/* 4
	 * getProperty()
	 * System Property : 자동 설정되는 시스템의 속성값
	 * 
	 * String value = System.getProperty(String key);
	 * key를 매개값으로 받아 문자열로 리턴
	 * 
	 * 5
	 * getenv()
	 * 환경 변수 읽기
	 */

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("운영체제 이름: " + osName);
		
		System.out.println("자바 버전: " + System.getProperty("java.version"));
		System.out.println("JRE 파일 경로: " + System.getProperty("java.home"));
		System.out.println("사용자 이름: " + System.getProperty("user.name"));
		System.out.println("사용자의 홈 디렉토리: " + System.getProperty("user.home"));
		System.out.println("사용자가 현재 작업중인 디렉토리: " + System.getProperty("user.dir"));
		System.out.println();
		
		System.out.println("환경 변수: " + System.getenv("JAVA_HOME"));
		
	}

}
