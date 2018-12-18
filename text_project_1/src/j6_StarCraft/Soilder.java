package j6_StarCraft;

public class Soilder extends Unit{
	Soilder(){
		super("Soilder");
		super.hp = 100;
		super.mp = 0;
		super.power = 10;
		super.speed = 5;
	}
	
	void attack(SCV scv) {
		scv.hp -= super.power;
	}
	
	void attack(Marine marine) {
		marine.hp -= super.power;
	}
}
