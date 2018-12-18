package Test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SalesStatus extends JFrame {

	private JPanel contentPane;
	private JTable firstTab, secTab, thrTab;
	DefaultTableModel firstTabModel, secTabModel, thrTabModel;
	MainFrame main;
	
	public SalesStatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(main.contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));		
	
		JPanel p1 = new JPanel();
		contentPane.add(p1);
		p1.setLayout(null);
		JLabel lblSalesSta = new JLabel("�Ǹ���Ȳ");
		lblSalesSta.setBounds(12, 40, 53, 15);
		p1.add(lblSalesSta);	
		
		String firstTabName[] = { "�Ⱓ" };
		Object firstData[][] = {{"2018-11"}};
		firstTabModel = new DefaultTableModel(firstData,firstTabName);
		firstTab = new JTable(firstTabModel);
		JScrollPane firstSc = new JScrollPane(firstTab);
		contentPane.add(firstSc);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);		
		String secTabName[] = { "����", "����", "����", "�ܰ��ݾ�", "���Ǹűݾ�", "�����ݾ�(���Ǹ�)" };
		Object secData[][] = {{"2018-11-02", "��", "30", "748,600","748,600","748,600"}};
		secTabModel = new DefaultTableModel(secData,secTabName);
		secTab = new JTable(secTabModel);
		scrollPane.setViewportView(secTab);
		

		
		setVisible(true);
	}

}
