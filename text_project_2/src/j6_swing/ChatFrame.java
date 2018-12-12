package j6_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatFrame {

	public static void main(String[] args) {
		JFrame chatF = new JFrame("ChatFrame");
		chatF.setVisible(true);
		chatF.setLayout(new BorderLayout());
		chatF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar(); // �޴��� ����
		JMenu file = new JMenu("File"); // �޴��� - �޴� ����
		JMenu help = new JMenu("help");
		menubar.add(file); // �޴� �ٿ� �޴� ���̱�
		menubar.add(help);
		
		JMenuItem newFile = new JMenuItem("New"); // �޴��� - �޴� - ������� ����
		JMenuItem saveFile = new JMenuItem("Save");
		JMenuItem infoHelp = new JMenuItem("info"); 
		file.add(newFile); // �޴��� ������� ���̱�
		file.add(saveFile);		
		help.add(infoHelp); 
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JTextField tf = new JTextField(20);
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		
		JTextArea ta = new JTextArea();		
		
		chatF.add(menubar, BorderLayout.NORTH);		
		chatF.add(ta, BorderLayout.CENTER);		
		chatF.add(panel, BorderLayout.SOUTH);		
		
		chatF.setSize(400,400);
		
		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = tf.getText();
				temp += "\r\n";
				ta.setText(temp);
			}
		});
	}
}
