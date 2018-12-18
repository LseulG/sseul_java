package windowBuilderProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class JTableEx3 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableEx3 frame = new JTableEx3();
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
	public JTableEx3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		String columnNames[] = { "판매일자", "총판매금액" };
		Object fisrtData[][] = {{"2018-11-02", "20,000"},{"gg","gg"}};
		DefaultTableModel firstTabModel = new DefaultTableModel(fisrtData,columnNames);
		table = new JTable(firstTabModel);
		JScrollPane jScollPane = new JScrollPane(table);
		contentPane.add(jScollPane, BorderLayout.NORTH);
	}

}
