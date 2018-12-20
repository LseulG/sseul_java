package jtableEx;

import java.awt.Component;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.table.TableCellRenderer;


//OUR MAIN CLASS

public class ButtonClumn extends JFrame {

	public ButtonClumn() {

		super("Button Column Example");

		Object[][] data = { { "1", "Man Utd", new Integer(2013), "21" }, { "2", "Man City", new Integer(2014), "3" },

				{ "3", "Chelsea", new Integer(2015), "7" }, { "4", "Arsenal", new Integer(1999), "10" },

				{ "5", "Liverpool", new Integer(1990), "19" }, { "6", "Everton", new Integer(1974), "1" }, };

		String columnHeaders[] = { "Position", "Team", "Last Year Won", "Trophies" };

		JTable table = new JTable(data, columnHeaders);

		table.getColumnModel().getColumn(1).setCellRenderer(new ButtonRenderer());

		table.getColumnModel().getColumn(1).setCellEditor(new ButtonEditor(new JTextField()));

		JScrollPane pane = new JScrollPane(table);

		getContentPane().add(pane);

		setSize(450, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		ButtonClumn bc = new ButtonClumn();

		bc.setVisible(true);

	}

}

class ButtonRenderer extends JButton implements TableCellRenderer {

	public ButtonRenderer() {

		setOpaque(true);

	}

	@Override

	public Component getTableCellRendererComponent(JTable table, Object obj, boolean selected, boolean focused, int row,

			int col) {

		setText((obj == null) ? "" : obj.toString());

		return this;

	}

}

class ButtonEditor extends DefaultCellEditor {

	protected JButton btn;

	private String lbl;

	private Boolean clicked;

	public ButtonEditor(JTextField txt) {

		super(txt);

		btn = new JButton();

		btn.setOpaque(true);

		btn.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				fireEditingStopped();

			}

		});

	}

	@Override

	public Component getTableCellEditorComponent(JTable table, Object obj, boolean selected, int row, int col) {

		lbl = (obj == null) ? "" : obj.toString();

		btn.setText(lbl);

		clicked = true;

		return btn;

	}

	@Override

	public Object getCellEditorValue() {

		if (clicked) {

			JOptionPane.showMessageDialog(btn, lbl + " Clicked");

		}

		clicked = false;

		return new String(lbl);

	}

	@Override

	public boolean stopCellEditing() {

		clicked = false;

		return super.stopCellEditing();

	}

	@Override

 protected void fireEditingStopped() {

  super.fireEditingStopped();

 }

}