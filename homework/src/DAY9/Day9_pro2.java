package DAY9;

public class Day9_pro2 {

	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		System.out.println(member);
	}
}

class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//여기서 코드를 작성하세오
	@Override
	public String toString() {
		return id + ": " + name ;
	}
}