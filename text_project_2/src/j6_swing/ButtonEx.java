package j6_swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonEx {

	public static void main(String[] args) {
		new Login();
	}

}

class Login{
	public Login() {
		JFrame f = new JFrame("Log In");
		JLabel labelid = new JLabel("  ID  ");
		JLabel labelpw = new JLabel("  PW  ");
		JTextField tfID = new JTextField(10);
		JTextField tfPW = new JTextField(10);
		//f.setLayout(new FlowLayout());
		f.setLayout(new GridLayout(2,2));
		
		f.add(labelid);
		f.add(tfID);
		f.add(labelpw);
		f.add(tfPW);
		
		f.setSize(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Count{
	public Count() {
		JFrame f = new JFrame();
		
		JButton btn = new JButton("Press");
		btn.setText("1");		
		
		f.add(btn);
		
		f.setVisible(true);
		f.setSize(200, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i=0; i<10; i++) {
			btn.setText(String.valueOf(i));
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
