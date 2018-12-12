package j1_bbb;

import java.util.Arrays;

public class WildCardEx {
	public static void registerCourse( Course<?> course) {
		System.out.println(course.getName() + "������: " +
				Array.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent( Course<? extends Student> course ) {
		System.out.println(course.getName() + "������: " + 
				Array.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? super Worker> course ) {
		System.out.println(course.getName() + "������: " + 
				Array.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���",5);
		 personCourse.add(new Person("�Ϲ���"));
		 personCourse.add(new Worker("������"));
		 personCourse.add(new Student("�л�"));
		 personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���",5);
		 workerCourse.add(new Worker("������"));
		 
		Course<Person> studentCourse = new Course<Student>("�л�����",5);
		 studentCourse.add(new Student("�л�"));
		 studentCourse.add(new HighStudent("����л�"));
		
		Course<Person> highStudentCourse = new Course<HighStudent>("�л�����",5);
		highStudentCourse.add(new HighStudent("����л�"));
		
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

