package Day7;

public class Day7_pro3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Unit {
	int x, y;
	void move(int x, int y) { }
	void stop() {}
}

class Marine extends Unit{
	void stimPack() {}
}

class Tank extends Unit{
	void changeMode() {}
}

class Dropship extends Unit{
	void stop() {}
	void load() {}
	void unload() {}
}
