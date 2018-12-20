package jtableEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.Component;
import javax.swing.event.*;
import java.util.EventObject;
import javax.swing.tree.*;
import java.io.Serializable;



public class Table {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Window win = e.getWindow();
				win.setVisible(false);
				win.dispose();
				System.exit(0);
			}
		});

		JTable table = new JTable(6, 4) {
			public TableCellRenderer getCellRenderer(int row, int column) {
				TableColumn tableColumn = getColumnModel().getColumn(column);
				TableCellRenderer renderer = tableColumn.getCellRenderer();
				if (renderer == null) {
					Class c = getColumnClass(column);
					if (c.equals(Object.class)) {
						Object o = getValueAt(row, column);
						if (o != null)
							c = getValueAt(row, column).getClass();
					}
					renderer = getDefaultRenderer(c);
				}
				return renderer;
			}

			public TableCellEditor getCellEditor(int row, int column) {
				TableColumn tableColumn = getColumnModel().getColumn(column);
				TableCellEditor editor = tableColumn.getCellEditor();
				if (editor == null) {
					Class c = getColumnClass(column);
					if (c.equals(Object.class)) {
						Object o = getValueAt(row, column);
						if (o != null)
							c = getValueAt(row, column).getClass();
					}
					editor = getDefaultEditor(c);
				}
				return editor;
			}

		};

		// Buttons
		table.setValueAt(new JButton("Button"), 0, 0);
		table.setValueAt(new JButton("Button"), 0, 1);

		// Combobox
		JComboBox combo = new JComboBox(new String[] { "First", "Second", "Third" });
		table.setValueAt(combo, 1, 1);

		// Labels
		table.setValueAt(new JLabel("Label"), 1, 0);
		//JLabel label = new JLabel("Label", new ImageIcon(table.getClass().getResource("new.gif")), JLabel.LEFT);
		//table.setValueAt(label, 1, 2);

		// Scrollbar
		table.setValueAt(new JScrollBar(JScrollBar.HORIZONTAL), 2, 1);

		// RadioButtons
		JRadioButton b1 = new JRadioButton("Group1 Button1");
		JRadioButton b2 = new JRadioButton("Group1 Button2");
		JRadioButton b3 = new JRadioButton("Group1 Button3");

		ButtonGroup g1 = new ButtonGroup();
		g1.add(b1);
		g1.add(b2);
		g1.add(b3);

		table.setValueAt(b1, 3, 0);
		table.setValueAt(b2, 3, 1);
		table.setValueAt(b3, 3, 2);

		table.setDefaultRenderer(JComponent.class, new JComponentCellRenderer());
		table.setDefaultEditor(JComponent.class, new JComponentCellEditor());
		JScrollPane sp = new JScrollPane(table);

		frame.getContentPane().add(sp);
		frame.pack();
		frame.show();
	}
}

class JComponentCellRenderer implements TableCellRenderer {
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		return (JComponent) value;
	}
}

class JComponentCellEditor implements TableCellEditor, TreeCellEditor, Serializable {

	protected EventListenerList listenerList = new EventListenerList();
	transient protected ChangeEvent changeEvent = null;

	protected JComponent editorComponent = null;
	protected JComponent container = null; // Can be tree or table

	public Component getComponent() {
		return editorComponent;
	}

	public Object getCellEditorValue() {
		return editorComponent;
	}

	public boolean isCellEditable(EventObject anEvent) {
		return true;
	}

	public boolean shouldSelectCell(EventObject anEvent) {
		if (editorComponent != null && anEvent instanceof MouseEvent
				&& ((MouseEvent) anEvent).getID() == MouseEvent.MOUSE_PRESSED) {
			Component dispatchComponent = SwingUtilities.getDeepestComponentAt(editorComponent, 3, 3);
			MouseEvent e = (MouseEvent) anEvent;
			MouseEvent e2 = new MouseEvent(dispatchComponent, MouseEvent.MOUSE_RELEASED, e.getWhen() + 100000,
					e.getModifiers(), 3, 3, e.getClickCount(), e.isPopupTrigger());
			dispatchComponent.dispatchEvent(e2);
			e2 = new MouseEvent(dispatchComponent, MouseEvent.MOUSE_CLICKED, e.getWhen() + 100001, e.getModifiers(), 3,
					3, 1, e.isPopupTrigger());
			dispatchComponent.dispatchEvent(e2);
		}
		return false;
	}

	public boolean stopCellEditing() {
		fireEditingStopped();
		return true;
	}

	public void cancelCellEditing() {
		fireEditingCanceled();
	}

	public void addCellEditorListener(CellEditorListener l) {
		listenerList.add(CellEditorListener.class, l);
	}

	public void removeCellEditorListener(CellEditorListener l) {
		listenerList.remove(CellEditorListener.class, l);
	}

	protected void fireEditingStopped() {
		Object[] listeners = listenerList.getListenerList();
// Process the listeners last to first, notifying
// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == CellEditorListener.class) {
// Lazily create the event:
				if (changeEvent == null)
					changeEvent = new ChangeEvent(this);
				((CellEditorListener) listeners[i + 1]).editingStopped(changeEvent);
			}
		}
	}

	protected void fireEditingCanceled() {
// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();
// Process the listeners last to first, notifying
// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == CellEditorListener.class) {
// Lazily create the event:
				if (changeEvent == null)
					changeEvent = new ChangeEvent(this);
				((CellEditorListener) listeners[i + 1]).editingCanceled(changeEvent);
			}
		}
	}

// implements javax.swing.tree.TreeCellEditor
	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded,
			boolean leaf, int row) {
		String stringValue = tree.convertValueToText(value, isSelected, expanded, leaf, row, false);

		editorComponent = (JComponent) value;
		container = tree;
		return editorComponent;
	}

// implements javax.swing.table.TableCellEditor
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

		editorComponent = (JComponent) value;
		container = table;
		return editorComponent;
	}

}
