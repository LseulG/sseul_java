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


public class LoginEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("Action");
		
		JPanel panel = new JPanel();
		
		JLabel lableID = new JLabel("  ID  ");
		JLabel lablePW = new JLabel("  PW  ");
		JTextField fieldID = new JTextField(10);
		JPasswordField fieldPW = new JPasswordField(10);

		JButton btn = new JButton("login");
		
		panel.setLayout(new GridLayout(2,2));
		panel.add(lableID);
		panel.add(fieldID); //tfID
		panel.add(lablePW);
		panel.add(fieldPW);
		panel.setSize(200, 200);
		
		f.setLayout(new GridLayout(2,1));
		f.add(panel);
		f.add(btn);
		
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("id:" + fieldID.getText() + ", pw:"+ fieldPW.getPassword());
			}
		});
		
		f.setSize(200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
