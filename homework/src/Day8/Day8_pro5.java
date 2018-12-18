package Day8;

import java.awt.*;
import java.awt.event.*;

public class Day8_pro5 {
	//??????????????????????
	//아래의 이벤트핸들러를 익명클래스(anonymous class)로 변경하시오
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new EventHandler());
	}
}

//class EventHandler extends WindowAdapter{
//	public void windowClosing(WindowEvent e) {
//		e.getWindow().setVisible(false);
//		e.getWindow().dispose();
//		System.exit(0);
//	}
//}

class EventHandler {
	
}