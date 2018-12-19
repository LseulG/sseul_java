package windowBuilderProject;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Test1 extends JFrame implements ActionListener{

	JPanel contentPane;
	
	JMenuItem mntmItem,mntmItem_1;
	CardLayout card = new CardLayout();

	
	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 409);

		contentPane = new JPanel();
		contentPane.setLayout(card);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("menu1");
		menuBar.add(mnMenu);
		
		mntmItem = new JMenuItem("item1");
		mnMenu.add(mntmItem);
		
		JMenu mnMenu_1 = new JMenu("menu2");
		menuBar.add(mnMenu_1);
		
		mntmItem_1 = new JMenuItem("item2");
		mnMenu_1.add(mntmItem_1);
		
		//contentPane.add("item1", new Item1_p());
		contentPane.add("item1", new Item111());
		contentPane.add("item2", new Item2_p());
		
		add(contentPane);		
		
		mntmItem.addActionListener(this);
		mntmItem_1.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mntmItem) {
			card.show(contentPane, "item1");
		} else if(e.getSource() == mntmItem_1) {
			card.show(contentPane, "item2");
		}
	}
	
	public static void main(String[] args) {
		new Test1();
	}

}
