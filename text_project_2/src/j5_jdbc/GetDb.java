package j5_jdbc;

import java.io.*;
import java.sql.*;

public class GetDb {
	public static void main(String[] args) {
		String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String ID = "ora_user";
		String PW = "yeo";

		String query = "SELECT * FROM ENROL";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String filePath = "c:/Enrol Data";
		String fileName = "/enrol.txt";
		File dir = new File(filePath) ;
		File file = new File(filePath + fileName);
		
		if (dir.exists() == false) { dir.mkdirs(); }		
		
		// DB 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // 1try end

		// DB USER 접속
		try {
			conn = DriverManager.getConnection(URL, ID, PW);

			stmt = conn.createStatement();

			rs = stmt.executeQuery(query);

			String subNo = null;
			String stuNo = null;
			String enrGrade = null;
			String set = null;
			
			byte[] writeBytes = new byte[1024];
			FileOutputStream fos = new FileOutputStream(file);
			
			while (rs.next()) {
				subNo = rs.getString(1);
				stuNo = rs.getString(2);
				enrGrade = rs.getString(3);
				System.out.println(subNo+ " " + stuNo + " " + enrGrade);
				
				set = subNo + " " + stuNo + " " + enrGrade + " " + "\r\n";
				
				writeBytes = set.getBytes();				
				try {
					fos.write(writeBytes, 0, writeBytes.length);					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // 2try end

	}// main end
}
