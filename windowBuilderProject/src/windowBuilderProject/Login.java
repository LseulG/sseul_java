package windowBuilderProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Login extends JFrame {
	private JPanel contentPane;
	private JTextField idField;
	private JPasswordField pwField;
	private Start1 main;

	public Login() {
		//layout
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// label, field
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(228, 134, 57, 15);
		contentPane.add(lblId);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setBounds(228, 191, 36, 15);
		contentPane.add(lblPw);
		
		idField = new JTextField();
		idField.setBounds(263, 131, 116, 21);
		contentPane.add(idField);
		idField.setColumns(10);
		
		pwField = new JPasswordField();
		pwField.setBounds(263, 188, 116, 21);
		contentPane.add(pwField);
		
		// button
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginCheck();
			}
		});
		btnNewButton.setBounds(251, 252, 97, 23);
		contentPane.add(btnNewButton);
		
		// show
		setVisible(true);
	}
	
	// login check
	public void loginCheck() {
		if(idField.getText().equals("a") && new String(pwField.getPassword()).equals("a")) {
			JOptionPane.showMessageDialog(null, "�α��� �Ǿ����ϴ�.");
			
			main.showMainFrame();			
		} else {
			JOptionPane.showMessageDialog(null, "ID/PW�� Ȯ�����ּ���.");			
		}
	}
	
	// main conn
	public void setMain(Start1 main) {
		this.main = main;
	}
}