package j1_generic;

public class W02_Product <K,V> {
	private K kind;
	private V model;
	
	public K getKind() {
		return this.kind;
	}
	
	public void setKind(K kind) {
		this.kind = kind;
	}

	public V getModel() {
		return this.model;
	}
	
	public void setModel(V model) {
		this.model = model;
	}
}


class Car{
	String kind = "EU";
}