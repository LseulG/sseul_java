package j1_variable_type;

public class A9_Operation_Ex5 {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C' ) ;
		System.out.println(score + "점은 " + grade + "등급입니다.");

		char grade2 = (score >= 90) ? 'A' : (
					  (score >= 80) ? 'B' : (
					  (score >= 70) ? 'C' : 'D' )) ;
		System.out.println(score + "점은 " + grade2 + "등급입니다.");
	}
}
