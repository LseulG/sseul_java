package a7_String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class CharAtEx {
	/*
	 * 1 charAt() �Ű������� �־��� �ε����� ���� ���� �Ű��� : 0 ~ ���ڿ�����-1
	 * 
	 * substring() ���ڿ� �߶󳻱�
	 */
	public static void main(String[] args) {
		String ssn = "991102-1888888";
		// 9 9 1 1 0 2 - 1 8 8 8 8 8 8
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13

		/***************** charAt() *********************/
		char sex = ssn.charAt(7); // 1

		if (sex == '1' || sex == '3') {
			System.out.println("����");
		} else if (sex == '2' || sex == '4') {
			System.out.println("����");
		} else {
			System.out.println("�߸��� �ֹε�Ϲ�ȣ �Դϴ�");
		}

		/***************** substring() *********************/
		String firstSSN = ssn.substring(0, 6); // 0���� ~ 6���� ���ڿ� ����
		System.out.println("���ڸ�: " + firstSSN);

		String secondSSN = ssn.substring(7); // 7����~ ���ڿ� ����
		System.out.println("���ڸ�: " + secondSSN);

		//
		String a = "s";
		String b = "m";
		String c = a + "," + b;
		
		System.out.println(c);

	}

}
