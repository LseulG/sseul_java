package Day8;

import java.awt.*;
import java.awt.event.*;

public class Day8_pro5 {
	//??????????????????????
	//�Ʒ��� �̺�Ʈ�ڵ鷯�� �͸�Ŭ����(anonymous class)�� �����Ͻÿ�
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