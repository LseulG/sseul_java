package j1_generic;

public class W06_WildCardEx {
	public static void registerCourse ( Cousre<?> course) {
		System.out.println(course.getName() + "������: " +
	Array.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
		
	}

}
