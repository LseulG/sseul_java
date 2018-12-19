package windowBuilderProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TableEventListener implements ActionListener {
	// �ʵ忡 Table�� TextField�� ����
	JTable list_table;
	JTextField name_field, address_field, tel_field;

	// TableTestŬ�������� ���� �Ѱ� ����
	public TableEventListener(JTable list_table, JTextField name_field, JTextField address_field,
			JTextField tel_field) {
		this.list_table = list_table;
		this.name_field = name_field;
		this.address_field = address_field;
		this.tel_field = tel_field;
	}

	// ActionListener ������
	public void actionPerformed(ActionEvent ae) {
		// �߰� ��ư�� �������� ����
		if (((JButton) ae.getSource()).getText().equals("�߰�")) {
			// �ؽ�Ʈ �ʵ忡 �ִ� ���ڿ��� ������ �ͼ� �迭�� ���� �ϰ� ���̺� �������
			String emty_row[] = { this.name_field.getText(), this.address_field.getText(), this.tel_field.getText() };
			DefaultTableModel model = (DefaultTableModel) this.list_table.getModel();
			model.addRow(emty_row);
		} // ���� ��ư�� �������� ���õ� ���� ����
		else if (((JButton) ae.getSource()).getText().equals("����")) {
			int selected_list = this.list_table.getSelectedRow();
			// ���õ��� �ʾ����� �ƹ��͵� ���� ������ ���� �������� ����
			if (selected_list == -1) {
				return;
			} else {
				DefaultTableModel model = (DefaultTableModel) this.list_table.getModel();
				model.removeRow(selected_list);
			}
		} // ��¹�ư�� Ŭ���� �ܼ�ȭ�鿡 �ԷµǾ� �ִ� ������� ���
		else if (((JButton) ae.getSource()).getText().equals("���")) {
			TableModel table_model = this.list_table.getModel();

			System.out.println();
			for (int i = 0; i < table_model.getColumnCount(); i++) {
				System.out.print(table_model.getColumnName(i) + "\t\t\t");
			}

			System.out.println();
			for (int i = 0; i < table_model.getRowCount(); i++) {
				for (int j = 0; j < table_model.getColumnCount(); j++) {
					System.out.print(table_model.getValueAt(i, j) + "\t\t\t");
				}
				System.out.println();
			}
		}

	}
}
