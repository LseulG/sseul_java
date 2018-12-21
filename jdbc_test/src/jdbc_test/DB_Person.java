package jdbc_test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DB_Person extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JTextField tf1, tf2, tf3;
	JPanel panel;

	Object ob[][] = new Object[0][3]; // 데이터표시(행x) 열만 나오게 설정
	DefaultTableModel model; // 데이터 저장
	JTable table;
	JScrollPane js;
	String str[] = { "이름", "나이", "전화번호" }; // 컬럼명

	// db 연동
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public DB_Person() {
		super("테이블에 데이터입력");
		panel = new JPanel();

		l1 = new JLabel("이름", JLabel.CENTER);
		l2 = new JLabel("나이", JLabel.LEFT);
		l3 = new JLabel("전화번호", JLabel.RIGHT);

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();

		panel.setLayout(new GridLayout(3, 4));
		panel.add(l1);
		panel.add(tf1);
		panel.add(l2);
		panel.add(tf2);
		panel.add(l3);
		panel.add(tf3);
		this.add("North", panel);

		model = new DefaultTableModel(ob, str);
		table = new JTable(model);
		js = new JScrollPane(table);
		this.add("Center", js);
		setBounds(250, 250, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);

		// 메소드
		connect(); //db접속
		select(); // select 하여 jtable에 보여줌
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try { //프로그램 종료전에 메모리에 db연동 해제
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e2) {
					System.exit(0);
				}
			}
		});
	}

	//내부적으로 호출하기때문에 다른클래스에서 호출되면 안됨
	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "ora_user8", "ora8");
			System.out.println("접속:" + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("DB접속오류");
		} catch (SQLException e) {
			System.out.println("DB접속오류");
		}
	}
	
	
	public void select() {
		try {
			String sql = "select * from person";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name=rs.getString("name");
				String age=rs.getString("age");
				String tel=rs.getString("tel");
				
				Object data[] = {name, age, tel};
				model.addRow(data);
			}
			
		}catch(Exception e) {
			System.out.println("select 실행오류");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf1) { //이름입력후 enter친 경우
			tf2.requestFocus(); //커서입력
		} else if (e.getSource() == tf2) {
			tf3.requestFocus();
		} else if (e.getSource() == tf3) {
			if(tf1.getText().equals("") && tf2.getText().equals("") && tf3.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "값입력");
				tf1.requestFocus(); //이름필드로 커서이동
				return;
			}
			//입력값을 모델에 입력하여 jtable에 결과 출력
			Object data[] = {tf1.getText(), tf2.getText(), tf3.getText()};
			model.addRow(data);
			
			// model에 저장한 데이터를 오라클테이블에 insert
			try {					
				String sql = "insert into person values(?,?,?)"; //? 파라미터인수
				pstmt = conn.prepareStatement(sql);
				
				//setString, setInt,...
				pstmt.setString(1, tf1.getText());
				pstmt.setString(2, tf2.getText());
				pstmt.setString(3, tf3.getText());
				
				int insert = pstmt.executeUpdate(); //1성공 0실패
				System.out.println("성공유무"+insert);
				
				// 들어갔는지 콘솔에서 확인
				sql = "select * from person";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String name=rs.getString("name");
					String age=rs.getString("age");
					String tel=rs.getString("tel");
					
					System.out.println(name + age + tel);
				}
				
			} catch(Exception e2) {
				System.out.println("데이터입력실패");
			}
			
			// 재입력을 위한 필드 초기화
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf1.requestFocus();	//커서 이동		
		}
	} // 생성자 종료
	
	public static void main(String[] args) {
		new DB_Person();
	}
}
