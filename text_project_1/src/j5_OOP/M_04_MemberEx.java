package j5_OOP;

public class M_04_MemberEx {

	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
		
		System.out.println(user1.name + user1.id);
		System.out.println(user2.name + user1.id);

	}

}

class Member{
	String name;
	String id;
	String password;
	int age;
	
	Member(String _name, String _id){
		name = _name;
		id = _id;
	}
}
