package windowBuilderProject;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Item1 extends JFrame {


	public static void main(String[] args) {
		new Item1();
	}

	public Item1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		add(new Item1_p());
		setVisible(true);
	}

}

class Item1_p extends JPanel {
	JLabel lab;
	DefaultTableModel firstTabModel;
	JTable firstTab;
	
	public Item1_p () {
		setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel p1 = new JPanel();
		add(p1);
		lab = new JLabel("label11111");
		lab.setBounds(100, 100, 450, 300);
		p1.add(lab);
		JLabel lblSalesReg = new JLabel("판매등록");
		lblSalesReg.setBounds(12, 40, 53, 15);
		p1.add(lblSalesReg);		
		JButton btnNewButton = new JButton("등록");
		btnNewButton.setBounds(123, 36, 97, 23);
		p1.add(btnNewButton);
		
		String firstTabName[] = { "판매일자", "총판매금액" };
		Object firstData[][] = {{"2018-11-02", "20,000"}};
		firstTabModel = new DefaultTableModel(firstData,firstTabName);
		firstTab = new JTable(firstTabModel);
		JScrollPane firstSc = new JScrollPane(firstTab);
		add(firstSc);
		
	}
}