package j1_bbb;

public class WildCard {
	public static void job(Course<Integer> course) {

	}
	public static void job1(Course<?> course) {
		
	}
	public static void job2(Course<? extends Student> course) {
		
	}
	public static void job3(Course<? super Worker> course) {
		
	}

	public static void main(String[] args) {
//		Course<Integer> c1 = new Course<>();
//		Course<Student> c2 = new Course<>();
//		Course<Person> c3 = new Course<>();
//		
//		WildCard.job(c1);
//		WildCard.job1(c1);
//		WildCard.job2(c2);
//		WildCard.job3(c3);
	}

}

class Person{}
class Worker extends Person{}
class Student extends Person{}
class HighStudent extends Student {}
