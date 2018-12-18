package j9_exception;

public class F_10_Ex7 {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String pw) throws NotExistIDException, WrongPasswordException{
		//id�� blue�� �ƴ϶�� notexistidexception �߻�
		if(!id.equals("blue")) {
			throw new NotExistIDException("id nono");
		}
		
		//pw�� 12345�� �ƴϸ� wrongpasswordexception
		if(!pw.equals("1234")) {
			throw new WrongPasswordException("pw nono");
		}
	}

}

class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}

class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}