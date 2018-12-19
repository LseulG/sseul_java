package windowBuilderProject;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBtnTest extends JPanel {

	JRadioButton[] rdbtn = new JRadioButton[2];
	String[] radioText = {"����", "����"};
	
	public RadioBtnTest() {
		
		// ������ ������
		MyItemListener itemlis = new MyItemListener();
		
		// ���� ��ư ���� �׷�
		ButtonGroup g = new ButtonGroup();
		
		// ���� ��ư �׷쿡 ��ư 2�� �����Ͽ� ����
		for (int i=0; i<rdbtn.length; i++) {
			rdbtn[i] = new JRadioButton(radioText[i]);
			g.add(rdbtn[i]);
			add(rdbtn[i]);
			
			// ������ ����
			rdbtn[i].addItemListener(itemlis);
		}
		
		rdbtn[0].setSelected(true); // �ش� ��ư�� ���õ� ����
				
	}
	
	class MyItemListener implements ItemListener {
		
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if (rdbtn[0].isSelected()) {
				// ���� ����
			} else {
				// ���� ����
			}
		}	
	}
}


