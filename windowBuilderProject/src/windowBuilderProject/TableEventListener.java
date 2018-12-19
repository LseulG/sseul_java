package windowBuilderProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TableEventListener implements ActionListener {
	// 필드에 Table과 TextField를 선언
	JTable list_table;
	JTextField name_field, address_field, tel_field;

	// TableTest클래스에서 값을 넘겨 받음
	public TableEventListener(JTable list_table, JTextField name_field, JTextField address_field,
			JTextField tel_field) {
		this.list_table = list_table;
		this.name_field = name_field;
		this.address_field = address_field;
		this.tel_field = tel_field;
	}

	// ActionListener 재정의
	public void actionPerformed(ActionEvent ae) {
		// 추가 버튼이 눌렸을때 실행
		if (((JButton) ae.getSource()).getText().equals("추가")) {
			// 텍스트 필드에 있는 문자열을 가지고 와서 배열에 저장 하고 테이블에 출력해줌
			String emty_row[] = { this.name_field.getText(), this.address_field.getText(), this.tel_field.getText() };
			DefaultTableModel model = (DefaultTableModel) this.list_table.getModel();
			model.addRow(emty_row);
		} // 삭제 버튼이 눌렸을때 선택된 줄을 삭제
		else if (((JButton) ae.getSource()).getText().equals("삭제")) {
			int selected_list = this.list_table.getSelectedRow();
			// 선택되지 않았을때 아무것도 안함 선택한 행이 있을때만 지움
			if (selected_list == -1) {
				return;
			} else {
				DefaultTableModel model = (DefaultTableModel) this.list_table.getModel();
				model.removeRow(selected_list);
			}
		} // 출력버튼을 클릭시 콘솔화면에 입력되어 있는 내용들을 출력
		else if (((JButton) ae.getSource()).getText().equals("출력")) {
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
