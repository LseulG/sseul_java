package test6;

public class Drama extends TVProgram{
	String director;
	String actor;
	String actress;

	public Drama(String title, String broadcast) {
		super(title, broadcast);
	}
	
//	public Drama(String director, String actor, String actress) {
//		this.director = director;
//		this.actor = actor;
//		this.actress = actress;
//	}
	
	public Drama(String title, String broadcast, String director, String actor, String actress) {
		super(title, broadcast);
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}
	
	public String toString() {
		String str = "";
		return super.toString() + str;
	}
	
}
