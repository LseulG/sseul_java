package windowBuilderProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Item2 extends JFrame {


	public static void main(String[] args) {
		new Item2();
	}

	public Item2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		add(new Item2_p());
		setVisible(true);
	}

}

class Item2_p extends JPanel {
	JLabel lab;
	public Item2_p () {
		setLayout(null);
		
		lab = new JLabel("label2222");
		lab.setBounds(100, 100, 450, 300);
		add(lab);
		
	}
}
