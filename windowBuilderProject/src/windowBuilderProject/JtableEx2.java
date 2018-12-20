package windowBuilderProject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class JtableEx2 extends JFrame {
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
		new JtableEx2();
	}

	public JtableEx2() {
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

	
		// 3		
		String secTabName[] = { "구분", "품번", "색상", "사이즈", "판매단가", "재고", "수량", "실판매금액", "등록" };
		Object secData[][] = { { "판매", "000", "선택", "선택", "88000", "3", "1", "88000", "등록" } };
		secTabModel = new DefaultTableModel(secData, secTabName);
		secTab = new JTable(secTabModel);
		
		TableCellEditor editor = new DefaultCellEditor(divCB);
		secTab.getColumnModel().getColumn(0).setCellEditor(editor);
		
		Object value = editor.getCellEditorValue();
		System.out.println("Selected value = " + value);
		
		secSc = new JScrollPane(secTab);
		secSc.setPreferredSize(new Dimension(450, 100));
		getContentPane().add(secSc);
		
		setVisible(true);
	}

}
