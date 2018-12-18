package ex2;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Test extends JFrame implements ActionListener {
	
	CardLayout card = new CardLayout();

	JPanel main_panel; // ��ư�� �ٿ��� ���� �г� ����

	JMenuBar mb_bookManager;
	JMenu mn_bookManager, mn_userManager, mn_exit;
	JMenuItem mni_LoansCurrently, mni_bookInfo, mni_userRegister, mni_userDelete;

	public Test() {
		setTitle("JMenuItem ����"); // ������ Ÿ��Ʋ�� �ؽ�Ʈ ����
		setSize(400, 400); // ������ ũ�� ����(�ȼ�)
		// �����ӹ� ������ܿ� X��ư�� ���� �������� ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		main_panel = new JPanel(); // �г� ��üȭ
		main_panel.setLayout(card);

		mb_bookManager = new JMenuBar();

		mn_bookManager = new JMenu("å����");
		mn_userManager = new JMenu(" ����ڰ���");
		mn_exit = new JMenu("����");
		mn_exit.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// ���� �޴� Ŭ���� ���α׷� ����
				System.exit(1);
			}
		});

		mni_LoansCurrently = new JMenuItem("������Ȳ");
		mni_bookInfo = new JMenuItem("å����");
		//                                //
		mni_userRegister = new JMenuItem("����ڵ��");
		mni_userDelete = new JMenuItem("���������");

		mn_bookManager.add(mni_LoansCurrently);
		mn_bookManager.add(mni_bookInfo);
		mn_userManager.add(mni_userRegister);
		mn_userManager.add(mni_userDelete);

		mb_bookManager.add(mn_bookManager);
		mb_bookManager.add(mn_userManager);
		mb_bookManager.add(mn_exit);

		setJMenuBar(mb_bookManager);
		
		/////////////////////////////////////////////////
		
		main_panel.add("loansCurrentlyPan", new LoansCurrently_panel());
		main_panel.add("bookInfoPan", new BookInfo_panel());
		
		////////////////////////////////////////////////
		
		add(main_panel);
		
		////////////////////////////////////////////////
		
		mni_LoansCurrently.addActionListener(this);
		mni_bookInfo.addActionListener(this);

		setVisible(true); // ������ ���̰� �ϱ�
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mni_LoansCurrently) {
			card.show(main_panel, "loansCurrentlyPan");
		} else if(e.getSource() == mni_bookInfo) {
			card.show(main_panel, "bookInfoPan");
		}
	}

	public static void main(String[] args) {
		new Test();
	}
}
