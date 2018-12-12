package j1_bbb;

import java.util.Arrays;

public class WildCardEx {
	public static void registerCourse( Course<?> course) {
		System.out.println(course.getName() + "수강생: " +
				Array.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent( Course<? extends Student> course ) {
		System.out.println(course.getName() + "수강생: " + 
				Array.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? super Worker> course ) {
		System.out.println(course.getName() + "수강생: " + 
				Array.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정",5);
		 personCourse.add(new Person("일반인"));
		 personCourse.add(new Worker("직장인"));
		 personCourse.add(new Student("학생"));
		 personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정",5);
		 workerCourse.add(new Worker("직장인"));
		 
		Course<Person> studentCourse = new Course<Student>("학생과정",5);
		 studentCourse.add(new Student("학생"));
		 studentCourse.add(new HighStudent("고등학생"));
		
		Course<Person> highStudentCourse = new Course<HighStudent>("학생과정",5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		registerCourseStudent(personCourse);
		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		registerCourseWorker(studentCourse);
		registerCourseWorker(highStudentCourse);
		System.out.println();
		
		
		
	}

}

class Course<T>{
	private String name;
	private T[] students;
	
	public Course (String name, int capacity) {
		this.name= name;
		students = (T[]) (new Object[capacity]);
	}
		
	public String getName() { return name; }
	public T[] getStudents() { return students; }
		
	public void add(T t) {
		for (int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}

