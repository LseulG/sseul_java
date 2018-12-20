package windowBuilderProject;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.EventObject;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.EventListenerList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.tree.TreeCellEditor;


public class JtableEx4 extends JFrame {
	JLabel lab;
	DefaultTableModel secTabModel;
	JTable secTab;
	JScrollPane secSc;
	private JPanel contentPane;

	// 구분, 색상, 사이즈, 등록
	JComboBox divCB, colorCB, sizeCB;
	String divS[] = { "판매", "반품" }, colorS[] = { "BK", "WH", "NV" }, sizeS[] = { "S", "M", "L" };
	JButton reg;

	public static void main(String[] args) {
		new JtableEx4();
	}

	public JtableEx4() {
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
		JTable table = new JTable(1, 9) {
			public TableCellRenderer getCellRenderer(int row, int col) {
				TableColumn tabCol = getColumnModel().getColumn(col);
				TableCellRenderer renderer = tabCol.getCellRenderer();
				if (renderer == null) {
					Class c = getColumnClass(col);
					if (c.equals(Object.class)) {
						Object o = getValueAt(row, col);
						if (o != null)
							c = getValueAt(row, col).getClass();
					}
					renderer = getDefaultRenderer(c);
				}
				return renderer;
			} // renderer end

			public TableCellEditor getCellEditor(int row, int col) {
				TableColumn tableColumn = getColumnModel().getColumn(col);
				TableCellEditor editor = tableColumn.getCellEditor();
				if (editor == null) {
					Class c = getColumnClass(col);
					if (c.equals(Object.class)) {
						Object o = getValueAt(row, col);
						if (o != null)
							c = getValueAt(row, col).getClass();
					}
					editor = getDefaultEditor(c);
				}
				return editor;
			} // editor end
		};

		table.setValueAt(divCB, 0, 0);
		table.setValueAt(colorCB, 0, 2);
		table.setValueAt(sizeCB, 0, 3);
		table.setValueAt(new JLabel("29,000"), 0, 4);
		table.setValueAt(new JLabel("5"), 0, 5);
		table.setValueAt(1, 0, 6);
		table.setValueAt("29,000", 0, 7);
		table.setValueAt(reg, 0, 8);

		table.setDefaultRenderer(JComponent.class, new JComponentCellRenderer());
		table.setDefaultEditor(JComponent.class, new JComponentCellEditor());

		JScrollPane sp = new JScrollPane(table);
		getContentPane().add(sp);

		// 3 ( 9개 )
		String secTabName[] = { "구분", "품번", "색상", "사이즈", "판매단가", "재고", "수량", "실판매금액", "등록" };
		Object secData[][] = { { "판매", "000", "선택", "선택", "88000", "3", "1", "88000", "등록" } };
		secTabModel = new DefaultTableModel(secData, secTabName);
		secTab = new JTable(secTabModel);

		secTab.setValueAt(new JButton("btn"), 0, 0);

		secSc = new JScrollPane(secTab);
		secSc.setPreferredSize(new Dimension(450, 100));
		getContentPane().add(secSc);

		setVisible(true);
	}

	class JComponentCellRenderer implements TableCellRenderer {
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			return (JComponent) value;
		}
	}

	class JComponentCellEditor implements TableCellEditor, Serializable {

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
				e2 = new MouseEvent(dispatchComponent, MouseEvent.MOUSE_CLICKED, e.getWhen() + 100001, e.getModifiers(),
						3, 3, 1, e.isPopupTrigger());
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

//		// implements javax.swing.tree.TreeCellEditor
//		public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded,
//				boolean leaf, int row) {
//			String stringValue = tree.convertValueToText(value, isSelected, expanded, leaf, row, false);
//
//			editorComponent = (JComponent) value;
//			container = tree;
//			return editorComponent;
//		}

		// implements javax.swing.table.TableCellEditor
		public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
				int column) {

			editorComponent = (JComponent) value;
			container = table;
			return editorComponent;
		}

	}
}
