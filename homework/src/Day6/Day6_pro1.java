package Day6;

public class Day6_pro1 {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§:" + s.name); //È«±æµ¿
		System.out.println("ÃÑÁ¡:" + s.getTotal()); //236
		System.out.println("Æò±Õ:" + s.getAverage()); //78.7
	}
}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return (kor+eng+math);
	}
	
	double getAverage() {
		return Math.round(((double)(kor+eng+math)/3) *10) /10.0;
	}
}
