package DAY9;

public class Day9_pro2 {

	public static void main(String[] args) {
		Member member = new Member("blue", "���Ķ�");
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
	
	//���⼭ �ڵ带 �ۼ��ϼ���
	@Override
	public String toString() {
		return id + ": " + name ;
	}
}