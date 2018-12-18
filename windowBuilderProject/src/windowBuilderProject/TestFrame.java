package windowBuilderProject;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TestFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSales = new JMenu("sales");
		menuBar.add(mnSales);
		
		JMenuItem mntmAdd = new JMenuItem("add");
		mnSales.add(mntmAdd);
		
		JMenuItem mntmTotal = new JMenuItem("total");
		mnSales.add(mntmTotal);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(54, 75, 57, 15);
		contentPane.add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(54, 113, 57, 15);
		contentPane.add(lblPw);
		
		textField = new JTextField();
		textField.setBounds(133, 72, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setAction(action);
		btnLogin.setBounds(116, 171, 97, 23);
		contentPane.add(btnLogin);
		
		String a[] = {"a","b","c" };
		JComboBox comboBox = new JComboBox(a);
		comboBox.setBounds(132, 110, 117, 21);
		contentPane.add(comboBox);
		
		//btnNewButton.addActionListener(new ActionListenner());
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
