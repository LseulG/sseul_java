package windowBuilderProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboEx extends JFrame {
	private JPanel contentPane;
	JPanel main_panel; // ��ư�� �ٿ��� ���� �г� ����

	JComboBox<String> cbb_fruit;

	JLabel lb_print;

	// 1
	String Date[] = { "���", "�ٳ���", "����", "��" };

	public ComboEx() {
			setTitle("JComboBox ����(1)"); // ������ Ÿ��Ʋ�� �ؽ�Ʈ ����
			setSize(400,200); // ������ ũ�� ����(�ȼ�)
			// �����ӹ� ������ܿ� X��ư�� ���� �������� ��� ����
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			main_panel = new JPanel(); // �г� ��üȭ
			main_panel.setLayout(null);
			
			cbb_fruit = new JComboBox(Date);
			//2
			//cbb_fruit.setModel(new DefaultComboBoxModel(new String[] { "���", "�ٳ���", "����", "��" }));
			
			lb_print = new JLabel("���õ� ����:  ");
			
			cbb_fruit.setBounds(10, 10, 70, 25);
			lb_print.setBounds(100, 7, 200, 35);
			
			main_panel.add(cbb_fruit);
			main_panel.add(lb_print);
			
			add(main_panel); // ���� �����ӿ� �����г��� �ٿ��ִ� �۾�
			
			cbb_fruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String fruit = cbb_fruit.getSelectedItem().toString();
					lb_print.setText("���õ� ����:  " + fruit);
				}
			});
			
			setVisible(true); // ������ ���̰� �ϱ�
		}

	public static void main(String[] args) {
		new ComboEx();
	}
}