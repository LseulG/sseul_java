package windowBuilderProject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class JtableEx3 extends JFrame {
	JLabel lab;
	DefaultTableModel secTabModel;
	JTable secTab;
	JScrollPane secSc;
	private JPanel contentPane;
	
	// 구분, 색상, 사이즈, 등록
	JComboBox divCB, colorCB, sizeCB;
	String divS[] = { "판매", "반품" }, colorS[] = {"BK","WH","NV"}, sizeS[] = {"S","M","L"};
	JButton reg;
	
	public static void main(String[] args) {
		new JtableEx3();
	}

	public JtableEx3() {
		EtchedBorder eborder;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		// combo
		divCB = new JComboBox(divS);
		colorCB = new JComboBox(colorS);
		sizeCB = new JComboBox(sizeS);
		reg = new JButton("등록");
		
		eborder = new EtchedBorder(EtchedBorder.RAISED);

		// 1
		JPanel p1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) p1.getLayout();
		flowLayout.setHgap(10);
		flowLayout.setVgap(10);
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(p1);
		lab = new JLabel("판매등록");
		lab.setFont(new Font("굴림", Font.PLAIN, 18));
		p1.add(lab);
		contentPane.add(p1);

		// 2
		JPanel p2 = new JPanel();
		contentPane.add(p2);
		p2.setLayout(new GridLayout(2, 9, 0, 0));
		
		JLabel label1 = new JLabel("1");
		p2.add(label1);
		JLabel label2 = new JLabel("2");
		p2.add(label2);
		JLabel label3 = new JLabel("3");
		p2.add(label3);
		JLabel label4 = new JLabel("4");
		p2.add(label4);
		JLabel label5 = new JLabel("5");
		p2.add(label5);
		JLabel label6 = new JLabel("6");
		p2.add(label6);
		JLabel label7 = new JLabel("7");
		p2.add(label7);
		JLabel label8 = new JLabel("8");
		p2.add(label8);
		JLabel label9 = new JLabel("9");
		p2.add(label9);
		
		p2.add(divCB);
		JTextField field1 = new JTextField();
		p2.add(field1);
		p2.add(colorCB);
		p2.add(sizeCB);
		JLabel lab1 = new JLabel("49,000");
		p2.add(lab1);
		JLabel lab2 = new JLabel("5");
		p2.add(lab2);
		JTextField field2 = new JTextField("1");
		p2.add(field2);
		JTextField field3 = new JTextField("49,000");
		p2.add(field3);
		p2.add(reg);
		
		label1.setBorder(eborder);
		label2.setBorder(eborder);
		label3.setBorder(eborder);
		label4.setBorder(eborder);
		label5.setBorder(eborder);
		label6.setBorder(eborder);
		label7.setBorder(eborder);
		label8.setBorder(eborder);
		label9.setBorder(eborder);

		
		// 3		
		String secTabName[] = { "구분", "품번", "색상", "사이즈", "판매단가", "재고", "수량", "실판매금액", "등록" };
		Object secData[][] = { { "판매", "000", "선택", "선택", "88000", "3", "1", "88000", "등록" } };
		secTabModel = new DefaultTableModel(secData, secTabName);
		secTab = new JTable(secTabModel);
		
		secTab.setValueAt(new JButton("btn"),0,0);
		
		secSc = new JScrollPane(secTab);
		secSc.setPreferredSize(new Dimension(450, 100));
		getContentPane().add(secSc);
		
		setVisible(true);
	}

}
