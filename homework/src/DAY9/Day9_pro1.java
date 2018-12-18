package DAY9;

import java.util.HashMap;

//import java.util.HashMap;

public class Day9_pro1 {

	public static void main(String[] args) {
		//Student Ű�� ������ �����ϴ� HashMap ��ü ����
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		//new Student("1")�� ���� 95�� ����
		hashMap.put(new Student("1"), "95");
		
		//new Student("1")�� ������ �о��
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ����: " + score);
	}

}

class Student {
	private String studentNum;

	public Student (String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
		
	//�ڵ�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student str = (Student) obj;
			if(this.studentNum == str.studentNum) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}