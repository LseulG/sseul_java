package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RockScissorsPaperGame {
	int com;
	BufferedReader in;
	Random random;
	String gbbStr[] = { "����", "����", "��" };

	public RockScissorsPaperGame() {
		/*
		 * 1. network InputStream is = s.getInputStream(); 2. file File file = new
		 * File("a.txt"); InputStream is = new FileInputStream(file); 3. system(console)
		 * InputStream is = System.in; Reader r = new InputStreamReader(is); in = new
		 * BufferedReader(r);
		 * 
		 */
		in = new BufferedReader(new InputStreamReader(System.in));
		random = new Random();

	}

	public void comRandom() {

	}

	public static void menu() {
		System.out.println("==== ��ǻ�Ϳ� ���������� ����!!! =====");
		//System.out.print("����(0), ����(1), ��(2) �����ϼ���. : ");
		
	}

	public void game() throws NumberFormatException, IOException {
		while (true) {
			int com = random.nextInt(3);

			System.out.print("����(0), ����(1), ��(2) �����ϼ���. : ");
			int my = Integer.parseInt(in.readLine());

			if(my>2) {
				System.out.println("012 �� �Է��ض�!");
				continue;
			}
			
			int result = (my - com + 2) % 3;

			if (result == 0) {
				System.out.println("��:" + gbbStr[my] + "\t��:" + gbbStr[com] + "�̰��");
			} else if (result == 1) {
				System.out.println("��:" + gbbStr[my] + "\t��:" + gbbStr[com] + "����");
			} else {
				System.out.println("��:" + gbbStr[my] + "\t��:" + gbbStr[com] + "����.");
			}

			System.out.println("���(1), ����(0):");
			int num = Integer.parseInt(in.readLine());
			if (num == 0) {
				break;
			}
		}
	}

	public void exit() {

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		menu();
		RockScissorsPaperGame gbb = new RockScissorsPaperGame();
		gbb.game();
	}

}
