package j2_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx8 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();

	      set.add(new Student(1, "홍길동"));
	      set.add(new Student(2, "신용권"));
	      set.add(new Student(1, "조민우")); // 학번이 같으므로 저장되지 않음

	      Iterator<Student> iterator = set.iterator();

	      while (iterator.hasNext()) {
	         Student st = iterator.next();
	         System.out.println(st.Stu_no + ":" + st.Stu_name);
	      }

	   }

	}

	class Student {
	   public int Stu_no;
	   public String Stu_name;

	   Student(int Stu_no, String Stu_name) {
	      this.Stu_no = Stu_no;
	      this.Stu_name = Stu_name;
	   }

	   @Override
	   public boolean equals(Object obj) {
	      if (obj instanceof Student) {
	         Student s = (Student) obj;
	         return s.Stu_no == Stu_no;
	      } else {
	         return false;
	      }
	   }

	   @Override
	   public int hashCode() {
	      return Stu_no;
	   }
	}