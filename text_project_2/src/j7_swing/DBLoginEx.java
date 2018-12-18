package j7_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DBLoginEx {

	public static void main(String[] args) {
		new dblogin();
	}

}

class dblogin {
	public dblogin() {
		JFrame frame = new JFrame("JDBC Login");
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ID/PW panel
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2));

		JLabel labelID = new JLabel("     ID");
		JLabel labelPW = new JLabel("     PW");
		JTextField fieldID = new JTextField();
		JPasswordField fieldPW = new JPasswordField();

		panel1.add(labelID);
		panel1.add(fieldID);
		panel1.add(labelPW);
		panel1.add(fieldPW);

		// btn panel
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());

		JButton btnLogin = new JButton("login");
		panel2.add(btnLogin);


		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String URL = "jdbc:oracle:thin:@localhos:1521:orcl";
				String ID = "ora_user8";
				String PW = "ora8";

				String query1 = "SELECT * FROM EMP";

				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;

				// DB 드라이버 로딩
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

				try {
					conn = DriverManager.getConnection(URL, ID, PW);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(query1);

					String db_id = null;
					String db_pw = null;
					int cnt = 0;

					while (rs.next()) {
						db_id = rs.getString(1);
						db_pw = rs.getString(2);
						
						if (fieldID.getText().equals(db_id)) {
							if (fieldPW.getText().equals(db_pw)) {
								cnt = 1; // id o / pw o
							} else {
								cnt = 2; // id o / pw x
							}							
						} else {
							cnt = 3; // id x
						}
					} // while end
					
					if (cnt == 1) {
						//JOptionPane.showMessageDialog(null, "yoyo");
						System.out.println("로그인 성공");
					} else if (cnt == 2) {
						System.out.println("비밀번호 오류");
					} else if (cnt == 3) {
						System.out.println("아이디 오류");
					} else { }
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						rs.close();
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}); // action end
		
		// frame
		frame.add(panel1, BorderLayout.CENTER);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.setSize(250, 150);
		frame.setLocation(500, 400);
		frame.setResizable(false);
	}
}// class end
