package j5_OOP;

public class M_06_MemberServiceEx {
	public static void main(String[] args) {
		MemberService memSer = new MemberService();
		boolean result = memSer.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ϸ�");
			memSer.logout("hong");
		} else {
			System.out.println("id/pw Ʋ�Ƚ��ϴ�");
		}
	}
}

class MemberService{
	String id;
	String pw;
		
	boolean login(String _id, String _pw) {
		boolean result = false;
		if(_id=="hong" && _pw=="12345") {
			result =  true;
		}
		return result;		
	}
	
	void logout(String _id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}
}

class MemberService2{
	//String id = "hong";
	String id;
	String pw;
	
	//�ʱ�ȭ
	MemberService2(){
		id = "hong";
		pw = "12345";
	}
	
	boolean login(String _id, String _pw) {
		boolean result = false;
		if(id.equals(_id)) {
			result =  true;
		}
		return result;		
	}
	
	void logout(String _id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}
}