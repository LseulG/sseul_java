package j6_swing;

import java.awt.*;
import javax.swing.*;


public class SwingTest {

	public static void main(String[] args) {
		//new MyFrame(); 1
		new MyFrame("HiHi");
	}
}

class MyFrame {
	//public MyFrame() { 1
	public MyFrame(String title) {
		Dimension screenSize = new Dimension();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		screenSize = toolkit.getScreenSize();
		// â ��ġ ���� ��

		//JFrame jframe = new JFrame("Hello JFrame"); 1
		JFrame jframe = new JFrame(title);
		jframe.setLayout(new FlowLayout()); // ������ ���� �� ���̱�

		JLabel jlabel1 = new JLabel("Input1 : ");
		JLabel jlabel2 = new JLabel("Input2 : ");
		JTextField jtext = new JTextField(20);
		jtext.setText("text field");
		jtext.setFont(new Font("Atial Bold", Font.ITALIC, 20));
		
		jframe.add(jlabel1);
		jframe.add(jtext);
		jframe.add(jlabel2);
		
		jframe.setVisible(true); // â ������
		jframe.setSize(400, 300); // ũ�� ����
		// jframe.setLocation(300, 300); // ������ ��ġ ����
		jframe.setLocation(screenSize.width / 3, screenSize.height / 3); // ������ ��ġ ����
		jframe.setResizable(false); // â ũ�� ���� �Ұ�
		jframe.setTitle("Hi Everyone"); // â Ÿ��Ʋ ����. ������ Hello JFrame
		
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x Ŭ���ϸ� ���α׷� ����

	}
}