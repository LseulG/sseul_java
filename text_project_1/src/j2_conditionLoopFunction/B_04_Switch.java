package j2_conditionLoopFunction;

public class B_04_Switch {

	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+1; // 1~100

		System.out.println(score);
		
//		char grade;		
		
//		if (score >= 90) { grade = 'A'; 
//		} else if (score >= 80) { grade = 'B';
//		} else if (score >= 70) { grade = 'C';
//		} else { grade = 'D';
//		}
//		
//		switch(grade) {
//			case 'A':
//				System.out.println(grade);
//				break;
//			case 'B':
//				System.out.println(grade);
//				break;
//			case 'C':
//				System.out.println(grade);
//				break;
//			case 'D':
//				System.out.println(grade);
//				break;
//			default:
//				System.out.println(grade);
//				break;		}
		
		int pNum = 0;
		pNum = score / 10;
		
		switch(pNum) {
		case 10:
		case 9:
			if (score%10 >= 5) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default :
			System.out.println("D");
			break;
		}
	}

}
