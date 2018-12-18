package j5_OOP;

public class M_Exer_TV {
	public static void main(String args[]) {
		TV lg = new TV();
		lg.powerOn();
		lg.powerOn();
		lg.changeChanel(13);
		lg.channelUp();
		lg.channelDown();
		lg.volumeUp();
		lg.volumeDown();
		lg.mute();
		lg.powerOff();
	}
}

class TV{
	String maker; //������
	int screenSize; //ȭ��ũ��
	int channel = 8; //ä�� 1~15
	int volume = 3; //���� 0~10
	boolean power = false; //����
	
	//�ѱ�
	void powerOn() {
		if(power == false) {
			power = true;
			System.out.println("TV ON");
			System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
		} else {
			System.out.println("�̹� �����ֽ��ϴ�");
			System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
		}
	}
	
	//���� >>>>power(boolean power)
	void powerOff() {
		System.out.println("TV OFF");
		power = false;
	}
	
	//��ä����
	int channelUp() { 
		if(power) {
			if (channel < 15) channel += 1;
			else channel = 1;
			System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
			System.out.println("ä�� " + channel + "�� ���� �Ǿ����ϴ�.");
			return channel;
		}
		System.out.println("TV�� ���ּ���");
		return 0;
	}
	
	//��ä�ξƷ�
	int channelDown() {
		if(power) {
			if (channel > 1 ) channel -= 1;
			else channel = 15;
			System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
			System.out.println("ä�� " + channel + "�� ���� �Ǿ����ϴ�.");
			return channel;
		}
		System.out.println("TV�� ���ּ���");
		return 0;
	}
	
	//ä�κ���
	int changeChanel(int chChannel) {
		if(power) {
			if(chChannel>0 && chChannel<=15) {
				channel = chChannel;
				System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
				System.out.println("ä�� " + channel + "�� ���� �Ǿ����ϴ�.");
				return channel;
			} else {
				System.out.println("���� ä�� �Դϴ�.");
				System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
				return channel;
			}
		}
		System.out.println("TV�� ���ּ���");
		return 0;
	}
	
	//������ _�ִ뺼��10
	void volumeUp() {
		if(power) {
			if (volume < 10) {
				volume += 1;
				System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
				System.out.println("���� " + volume + "�� ���� �Ǿ����ϴ�.");
			} else {
				System.out.println("10�� �ִ� ���� �Դϴ�.");
				System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
			}
		} else 	System.out.println("TV�� ���ּ���");
	}
	
	//�����ٿ�
	void volumeDown() {
		if(power) {
			if (volume > 0) {
				volume -= 1;
				System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
				System.out.println("���� " + volume + "�� ���� �Ǿ����ϴ�.");
			} else {
				System.out.println("�̹� ������ 0 �Դϴ�.");
				System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
			}
		} else System.out.println("TV�� ���ּ���");
	}
	
	//���Ұ�
	int tempVol = volume; // ���� ������ temp�� ����
	
	void mute() {
		if(power) {
			if (volume == 0) {
				// �̹� ���Ұ� �϶�, �����ص� temp �������� ���ư�.
				volume = tempVol;
				System.out.println("���� ä��:" + channel + ", ���� ����:" + volume);
			} else {
				// ���Ұ�
				volume = 0;
				System.out.println("���� ä��:" + channel + ", ���� ����:���Ұ�");
			}
		} else System.out.println("TV�� ���ּ���");
	}
}
