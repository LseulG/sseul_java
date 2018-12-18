package j9_exception;

public class F_09_ii{
	public static void main(String[] args) {
		try {
			int i = 0;
			if (i==0) {
				throw new UserException("i=0");
			}
		} catch ( UserException ue) {
			System.out.println("user ex");
			System.out.println(ue.getMessage());
			ue.printStackTrace();
		}
	}
	
}

class UserException extends RuntimeException{
	UserException(){
	}
	
	UserException(String meg){
		super(meg); 
	}
}
