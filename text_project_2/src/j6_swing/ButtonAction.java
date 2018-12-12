package j6_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonAction {
	static int cnt = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame("Action");
		JButton btn = new JButton("~start~");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				++cnt;
				btn.setText(String.valueOf(cnt));
			}
		});
		
		f.add(btn);
		
		f.setSize(200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
