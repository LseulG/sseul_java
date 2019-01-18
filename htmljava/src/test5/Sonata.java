package test5;

public class Sonata extends Car{
	String series;
	String use;
	
	public Sonata(String color, int account, String series, String use) {
		super(color, account);
		this.series=series;
		this.use=use;
	}
	
	public String toString() {
		String str = " [용도] " + use + "\t[시리즈] " + series;
		return super.toString() + str;
	}
}
