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

	Object ob[][] = new Object[0][3]; // ������ǥ��(��x) ���� ������ ����
	DefaultTableModel model; // ������ ����
	JTable table;
	JScrollPane js;
	String str[] = { "�̸�", "����", "��ȭ��ȣ" }; // �÷���

	// db ����
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public DB_Person() {
		super("���̺� �������Է�");
		panel = new JPanel();

		l1 = new JLabel("�̸�", JLabel.CENTER);
		l2 = new JLabel("����", JLabel.LEFT);
		l3 = new JLabel("��ȭ��ȣ", JLabel.RIGHT);

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

		// �޼ҵ�
		connect(); //db����
		select(); // select �Ͽ� jtable�� ������
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try { //���α׷� �������� �޸𸮿� db���� ����
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

	//���������� ȣ���ϱ⶧���� �ٸ�Ŭ�������� ȣ��Ǹ� �ȵ�
	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "ora_user8", "ora8");
			System.out.println("����:" + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("DB���ӿ���");
		} catch (SQLException e) {
			System.out.println("DB���ӿ���");
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
			System.out.println("select �������");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf1) { //�̸��Է��� enterģ ���
			tf2.requestFocus(); //Ŀ���Է�
		} else if (e.getSource() == tf2) {
			tf3.requestFocus();
		} else if (e.getSource() == tf3) {
			if(tf1.getText().equals("") && tf2.getText().equals("") && tf3.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "���Է�");
				tf1.requestFocus(); //�̸��ʵ�� Ŀ���̵�
				return;
			}
			//�Է°��� �𵨿� �Է��Ͽ� jtable�� ��� ���
			Object data[] = {tf1.getText(), tf2.getText(), tf3.getText()};
			model.addRow(data);
			
			// model�� ������ �����͸� ����Ŭ���̺� insert
			try {					
				String sql = "insert into person values(?,?,?)"; //? �Ķ�����μ�
				pstmt = conn.prepareStatement(sql);
				
				//setString, setInt,...
				pstmt.setString(1, tf1.getText());
				pstmt.setString(2, tf2.getText());
				pstmt.setString(3, tf3.getText());
				
				int insert = pstmt.executeUpdate(); //1���� 0����
				System.out.println("��������"+insert);
				
				// ������ �ֿܼ��� Ȯ��
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
				System.out.println("�������Է½���");
			}
			
			// ���Է��� ���� �ʵ� �ʱ�ȭ
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf1.requestFocus();	//Ŀ�� �̵�		
		}
	} // ������ ����
	
	public static void main(String[] args) {
		new DB_Person();
	}
}
