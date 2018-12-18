package j6_AccessGetSet;

public class T_02_Car {
	//�ʵ�
	private int speed;
	private  boolean stop;
	
	//������
	
	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed (int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	

	public static void main(String[] args) {
		T_02_Car myCar = new T_02_Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}

}


