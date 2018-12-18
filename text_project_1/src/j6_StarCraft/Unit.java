package j6_StarCraft;

public class Unit {
	int hp;
	int mp;
	int power;
	int speed;
	String type;
	
	Unit(String type){
		this.type = type;
	}
	
	void move(int x, int y) {
		System.out.println(x + "," + y + "∑Œ ¿Ãµø");
	}
}
