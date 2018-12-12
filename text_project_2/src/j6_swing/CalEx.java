package j6_swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CalEx {

	public static void main(String[] args) {
		new Cal();
	}
}

class Cal{
	public Cal() {
		JFrame f = new JFrame("Calculator");
		f.setLayout(new GridLayout(4,4));
		
//		JButton[] btn = new JButton[10];
//		for(int i = 0; i<10; i++) {
//			btn[i] = String.valueOf(?);
//		}
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn0 = new JButton("0");
		
		JButton btnStar = new JButton("*");
		JButton btnSharp = new JButton("#");
		
		JButton btnPlus = new JButton("+");
		JButton btnMinus = new JButton("-");
		JButton btnMultiply = new JButton("x");
		JButton btnDivide = new JButton("/");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btnMultiply);
		
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		f.add(btnDivide);
		
		f.add(btn7);
		f.add(btn8);
		f.add(btn9);
		f.add(btnMinus);
		
		f.add(btnStar);
		f.add(btn0);
		f.add(btnSharp);
		f.add(btnPlus);
		
		f.setSize(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}