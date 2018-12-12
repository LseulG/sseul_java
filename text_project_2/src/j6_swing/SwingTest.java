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
		// 창 위치 조정 시

		//JFrame jframe = new JFrame("Hello JFrame"); 1
		JFrame jframe = new JFrame(title);
		jframe.setLayout(new FlowLayout()); // 옆으로 쭉쭉 라벨 붙이기

		JLabel jlabel1 = new JLabel("Input1 : ");
		JLabel jlabel2 = new JLabel("Input2 : ");
		JTextField jtext = new JTextField(20);
		jtext.setText("text field");
		jtext.setFont(new Font("Atial Bold", Font.ITALIC, 20));
		
		jframe.add(jlabel1);
		jframe.add(jtext);
		jframe.add(jlabel2);
		
		jframe.setVisible(true); // 창 보여줌
		jframe.setSize(400, 300); // 크기 설정
		// jframe.setLocation(300, 300); // 켜지는 위치 조정
		jframe.setLocation(screenSize.width / 3, screenSize.height / 3); // 켜지는 위치 조정
		jframe.setResizable(false); // 창 크기 조정 불가
		jframe.setTitle("Hi Everyone"); // 창 타이틀 설정. 기존엔 Hello JFrame
		
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 클릭하면 프로그램 종료

	}
}