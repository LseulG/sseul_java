package j6_StarCraft;

public class Worker extends Unit{
	Worker(){
		super("Worker");
		super.hp = 100;
		super.mp = 0;
		super.power = 5;
		super.speed = 3;
	}
	
	void attack(SCV scv) {
		if (scv.hp > 0) {
			scv.hp -= super.power;
		} else {
			System.out.println("상대가 전사했습니다.");
		}
	}
	
	void attack(Marine marine) {
		if (marine.hp > 0) {
			marine.hp -= super.power;
		} else {
			System.out.println("상대가 전사했습니다.");
		}
	}
	
	int mineral = 0;
	void mind(int x, int y){
		if(x==10 && y==10) {
			mineral += 10;
			System.out.println("미네랄 캤다!!");
			System.out.println("현재 미네랄:" + mineral);
		}
	}
}
