package test6;

public class TVProgram {
	String title;
	String broadcast;
	
	public TVProgram(String title, String broadcast) {
		this.title = title;
		this.broadcast = broadcast;
	}
	
	public String toString() {
		return title + " (" + broadcast + ")\n";
	}
}
