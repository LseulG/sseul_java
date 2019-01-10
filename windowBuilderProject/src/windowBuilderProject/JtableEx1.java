package windowBuilderProject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class JtableEx1 extends JFrame implements ActionListener {
	JLabel lab;
	DefaultTableModel secTabModel;
	JTable secTab;
	JScrollPane secSc;
	private JPanel contentPane;

	// 구분, 색상, 사이즈, 등록
	JComboBox divCB, colorCB, sizeCB;
	String divS[] = { "판매", "반품" }, colorS[] = { "BK", "WH", "NV" }, sizeS[] = { "S", "M", "L" };
	JButton reg;
	private JButton btnBtn;

	public static void main(String[] args) {
		new JtableEx1();
	}

	public JtableEx1() {
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

		btnBtn = new JButton("btn");
		btnBtn.addActionListener(this);
		p1.add(btnBtn);

		// 3
		String secTabName[] = { "구분", "품번", "색상", "사이즈", "판매단가", "재고", "수량", "실판매금액", "등록" };
		Object secData[][] = { { "판매", "001", "선택", "선택", "88000", "3", "1", "88000", "등록" },
				{ "판매", "002", "선택택", "선택", "88000", "3", "1", "88000", "등록" },
				{ "판매", "003", "선택", "선택", "88000", "3", "1", "88000", "등록" },
				{ "판매", "004", "선택", "선택", "88000", "3", "1", "88000", "등록" } };
		secTabModel = new DefaultTableModel(secData, secTabName);
		secTab = new JTable(secTabModel) {
			@Override
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component compo = super.prepareRenderer(renderer, row, column);
				
				if(!isRowSelected(row)) {
					String type = (String)getModel().getValueAt(row, 2);
					if(type.equalsIgnoreCase("선택")) {
						//compo.setBackground(Color.RED);
						compo.setForeground(Color.RED);
					} else {
						//compo.setBackground(Color.BLUE);
						compo.setForeground(Color.BLUE);
					}
				}
				return compo;
			}
		};

		TableCellEditor editor = new DefaultCellEditor(divCB);
		secTab.getColumnModel().getColumn(0).setCellEditor(editor);

		Object value = editor.getCellEditorValue();
		System.out.println("Selected value = " + value);

		secSc = new JScrollPane(secTab);
		secSc.setPreferredSize(new Dimension(450, 100));
		getContentPane().add(secSc);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBtn) { // 삭제
			// 선택한 테이블 행 삭제
			// 선택한 테이블 데이터 넘기기

			if (secTab.getSelectedRow() >= 0) {
				int row = secTab.getSelectedRow();
				int col = secTab.getSelectedColumn();

				System.out.println(secTabModel.getValueAt(row, col));

				secTabModel.removeRow(secTab.getSelectedRow());

			} else {
				JOptionPane.showMessageDialog(null, "삭제할 행을 클릭하세요.");
			}

			// myDBcon.salesDelete(firstTab, secTab,group,s_qty,s_price);
		}
	}

}

