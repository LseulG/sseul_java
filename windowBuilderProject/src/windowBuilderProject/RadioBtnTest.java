package windowBuilderProject;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBtnTest extends JPanel {

	JRadioButton[] rdbtn = new JRadioButton[2];
	String[] radioText = {"매장", "본사"};
	
	public RadioBtnTest() {
		
		// 아이템 감시자
		MyItemListener itemlis = new MyItemListener();
		
		// 라디오 버튼 묶을 그룹
		ButtonGroup g = new ButtonGroup();
		
		// 라디오 버튼 그룹에 버튼 2개 생성하여 부착
		for (int i=0; i<rdbtn.length; i++) {
			rdbtn[i] = new JRadioButton(radioText[i]);
			g.add(rdbtn[i]);
			add(rdbtn[i]);
			
			// 감시자 부착
			rdbtn[i].addItemListener(itemlis);
		}
		
		rdbtn[0].setSelected(true); // 해당 버튼이 선택된 상태
				
	}
	
	class MyItemListener implements ItemListener {
		
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if (rdbtn[0].isSelected()) {
				// 매장 선택
			} else {
				// 본사 선택
			}
		}	
	}
}


