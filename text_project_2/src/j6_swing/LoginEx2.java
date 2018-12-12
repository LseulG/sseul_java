package j6_swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginEx2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Action");
		f.setLayout(new FlowLayout());
		
		JLabel lableID = new JLabel("  ID  ");
		JLabel lablePW = new JLabel("  PW  ");
		JTextField fieldID = new JTextField(10);
		JPasswordField fieldPW = new JPasswordField(10);

	//	f.setLayout(new FlowLayout());
		JButton btn = new JButton("login");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
	
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2,2));
		p1.add(lableID);
		p1.add(fieldID);
		p1.add(lablePW);
		p1.add(fieldPW);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(btn);
		
		f.setSize(200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
