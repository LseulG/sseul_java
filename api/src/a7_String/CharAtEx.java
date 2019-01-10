package a7_String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class CharAtEx {
	/*
	 * 1 charAt() 매개값으로 주어진 인덱스의 문자 리턴 매개값 : 0 ~ 문자열길이-1
	 * 
	 * substring() 문자열 잘라내기
	 */
	public static void main(String[] args) {
		String ssn = "991102-1888888";
		// 9 9 1 1 0 2 - 1 8 8 8 8 8 8
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13

		/***************** charAt() *********************/
		char sex = ssn.charAt(7); // 1

		if (sex == '1' || sex == '3') {
			System.out.println("남자");
		} else if (sex == '2' || sex == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 주민등록번호 입니다");
		}

		/***************** substring() *********************/
		String firstSSN = ssn.substring(0, 6); // 0포함 ~ 6제외 문자열 추출
		System.out.println("앞자리: " + firstSSN);

		String secondSSN = ssn.substring(7); // 7포함~ 문자열 추출
		System.out.println("뒷자리: " + secondSSN);

		//
		String a = "s";
		String b = "m";
		String c = a + "," + b;
		
		System.out.println(c);

	}

}
