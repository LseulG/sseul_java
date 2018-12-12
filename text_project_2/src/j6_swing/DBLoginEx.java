package j6_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DBLoginEx {

	public static void main(String[] args) {
		new dblogin();
	}

}


class dblogin{
	public dblogin() {
		JFrame frame = new JFrame("JDBC Login");
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ID/PW panel
		JPanel panel1 = new JPanel();		
		panel1.setLayout(new GridLayout(2, 2));
		
		JLabel labelID = new JLabel("     ID");
		JLabel labelPW = new JLabel("     PW");
		JTextField fieldID = new JTextField();
		JPasswordField fieldPW = new JPasswordField();
		
		panel1.add(labelID);
		panel1.add(fieldID);
		panel1.add(labelPW);
		panel1.add(fieldPW);		
		
		// btn panel
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		
		JButton btnLogin = new JButton("login");
		panel2.add(btnLogin);
		
		// frame
		frame.add(panel1, BorderLayout.CENTER);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.setSize(250,150);
		frame.setLocation(500, 400);
		frame.setResizable(false);		
		
	}
}