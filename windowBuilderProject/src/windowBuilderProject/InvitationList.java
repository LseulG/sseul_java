package windowBuilderProject;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.table.*;

public class InvitationList extends JFrame implements ActionListener {

	Label lbl1, lbl2, lbl3;

	TextField txt1, txt2, txt3;

	JButton btn1, btn2;

	JTable table;

	JScrollPane scroll; /* 스크롤 추가를 위해 JScrollPane 선언 */

	DefaultTableModel tablemodel; /* addRow를 호출하기 위한 선언 */

	public InvitationList(String str)

	{

		super(str);

		/* DefaultTableModel을 구현하여 JTable을 생성한다. */

		tablemodel = new DefaultTableModel();

		tablemodel.setColumnIdentifiers(new String[] { "이름", "나이", "성별" });

		table = new JTable(tablemodel);

		scroll = new JScrollPane(table);

		lbl1 = new Label("이름");

		lbl2 = new Label("나이");

		lbl3 = new Label("성별");

		txt1 = new TextField(null, 10);

		txt2 = new TextField(null, 5);

		txt3 = new TextField(null, 3);

		btn1 = new JButton("추가");

		btn1.addActionListener(this);

		btn2 = new JButton("삭제");

		btn2.addActionListener(this);

		Panel panel = new Panel(new FlowLayout());

		panel.add(lbl1);

		panel.add(txt1);

		panel.add(lbl2);

		panel.add(txt2);

		panel.add(lbl3);

		panel.add(txt3);

		panel.add(btn1);

		panel.add(btn2);

		/* 화면의 레이아웃을 구성함 */

		getContentPane().add(panel, BorderLayout.SOUTH);

		getContentPane().add(table.getTableHeader(), BorderLayout.NORTH);

		getContentPane().add(scroll, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(500, 300);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		/* 추가 버튼이 눌린 경우 */

		if ((JButton) obj == btn1)

		{

			/* TextField에 입력된 데이터를 JTable에 삽입함 */

			tablemodel.addRow(
					new String[] { txt1.getText().toString(), txt2.getText().toString(), txt3.getText().toString() });

			txt1.setText(null);

			txt2.setText(null);

			txt3.setText(null);

		}

		/* 삭제 버튼이 눌린 경우 */

		else if ((JButton) obj == btn2)

		{

			/* 예외처리. 선택된 row가 있어야 한다 */

			if (table.getSelectedRow() >= 0)

			{

				tablemodel.removeRow(table.getSelectedRow());

			}

		}

	}

	public static void main(String[] args) {

		new InvitationList("JTable 예제");

	}

}
