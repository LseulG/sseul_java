package Day8;

//public interface Flyer {
//	int fast = 100;
//	void fly();
//	boolean isAnimal();
//}

public class Day8_pro1 {
	//????????????????????
	// bird, airplane�� flyer�� ����Ͽ� �Ʒ� ����Ŭ������ �����Ҽ� �ֵ��� �����ϰ� �ڵ� �ۼ�
	// 100 Birdflying true Airplaneflying Airplaneflying false Birdflying true true Birdflying true Birdflying true
	public static void main(String[] args) {
		System.out.println(Flyer.fast);
		
		Bird b = new Bird();
		FlyerUtil.show(b);
		
		Airplane ap = new Airplane();
		ap.fly();
		FlyerUtil.show(ap);
		
		Flyer f = new Bird();
		f.fly();
		System.out.println(f.isAnimal());
		FlyerUtil.show(f);
		
		Bird bf = (Bird)f;
		FlyerUtil.show(bf);
	}

}

class Bird implements Flyer{
	public void fly() {
		
	}	
	public boolean isAnimal() {
		return true;
	}	
//	public void FlyerUtil() {
//		
//	}	
//	public void show() {
//		
//	}
}

class Airplane implements Flyer{
	public void fly() {
		
	}	
	public boolean isAnimal() {
		return true;
	}
}
