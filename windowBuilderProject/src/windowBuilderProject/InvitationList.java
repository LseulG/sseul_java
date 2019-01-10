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

	JScrollPane scroll; /* ��ũ�� �߰��� ���� JScrollPane ���� */

	DefaultTableModel tablemodel; /* addRow�� ȣ���ϱ� ���� ���� */

	public InvitationList(String str)

	{

		super(str);

		/* DefaultTableModel�� �����Ͽ� JTable�� �����Ѵ�. */

		tablemodel = new DefaultTableModel();

		tablemodel.setColumnIdentifiers(new String[] { "�̸�", "����", "����" });

		table = new JTable(tablemodel);

		scroll = new JScrollPane(table);

		lbl1 = new Label("�̸�");

		lbl2 = new Label("����");

		lbl3 = new Label("����");

		txt1 = new TextField(null, 10);

		txt2 = new TextField(null, 5);

		txt3 = new TextField(null, 3);

		btn1 = new JButton("�߰�");

		btn1.addActionListener(this);

		btn2 = new JButton("����");

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

		/* ȭ���� ���̾ƿ��� ������ */

		getContentPane().add(panel, BorderLayout.SOUTH);

		getContentPane().add(table.getTableHeader(), BorderLayout.NORTH);

		getContentPane().add(scroll, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(500, 300);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		/* �߰� ��ư�� ���� ��� */

		if ((JButton) obj == btn1)

		{

			/* TextField�� �Էµ� �����͸� JTable�� ������ */

			tablemodel.addRow(
					new String[] { txt1.getText().toString(), txt2.getText().toString(), txt3.getText().toString() });

			txt1.setText(null);

			txt2.setText(null);

			txt3.setText(null);

		}

		/* ���� ��ư�� ���� ��� */

		else if ((JButton) obj == btn2)

		{

			/* ����ó��. ���õ� row�� �־�� �Ѵ� */

			if (table.getSelectedRow() >= 0)

			{

				tablemodel.removeRow(table.getSelectedRow());

			}

		}

	}

	public static void main(String[] args) {

		new InvitationList("JTable ����");

	}

}
