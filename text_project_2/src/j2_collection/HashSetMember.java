package j2_collection;

import java.util.HashSet;

public class HashSetMember {

	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<>();
				
		Member a = new Member("hong", 30);
		Member b = new Member("hong", 30);

		System.out.println(a.equals(b));
		
		set.add(a);
		set.add(b);
		
		System.out.println(set.size());
	}

}

class Member{
	public String name;
	public int age;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
			//이름과 나이가 같으면 true return
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}