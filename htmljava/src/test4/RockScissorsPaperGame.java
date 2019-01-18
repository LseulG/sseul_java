package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RockScissorsPaperGame {
	int com;
	BufferedReader in;
	Random random;
	String gbbStr[] = { "가위", "바위", "보" };

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
		System.out.println("==== 컴퓨터와 가위바위보 한판!!! =====");
		//System.out.print("가위(0), 바위(1), 보(2) 선택하세요. : ");
		
	}

	public void game() throws NumberFormatException, IOException {
		while (true) {
			int com = random.nextInt(3);

			System.out.print("가위(0), 바위(1), 보(2) 선택하세요. : ");
			int my = Integer.parseInt(in.readLine());

			if(my>2) {
				System.out.println("012 중 입력해라!");
				continue;
			}
			
			int result = (my - com + 2) % 3;

			if (result == 0) {
				System.out.println("나:" + gbbStr[my] + "\t컴:" + gbbStr[com] + "이겼다");
			} else if (result == 1) {
				System.out.println("나:" + gbbStr[my] + "\t컴:" + gbbStr[com] + "졌다");
			} else {
				System.out.println("나:" + gbbStr[my] + "\t컴:" + gbbStr[com] + "비겼다.");
			}

			System.out.println("계속(1), 종료(0):");
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
