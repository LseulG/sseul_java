package j2_conditionLoopFunction;

public class B_01_IfElse {
	public static void main(String[] args) {
		int score = 85;

//		char grade2 = (score >= 90) ? 'A' : (
//					  (score >= 80) ? 'B' : (
//					  (score >= 70) ? 'C' : 'D' )) ;
//		System.out.println(score + "점은 " + grade2 + "등급입니다.");
		
		//A+ :95이상, B+:85이상, C+75이상, D+:65이상
		
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		if((score%10)>=5) {
			System.out.println(score + "점은 " + grade  + "+등급입니다.");
		} else {
			System.out.println(score + "점은 " + grade + "등급입니다.");
		}
		
	}

}
