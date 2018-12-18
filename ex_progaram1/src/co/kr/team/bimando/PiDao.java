package co.kr.team.bimando;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Vector;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.*;

public class PiDao {
	// DAO : Data Access Object = DB 처리 클래스

	public static PiDto selectId(String b) {
		PiDto dto = null;
		String sql = "select * from joindiet where id =?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, b);
			rs = ps.executeQuery();
			if (rs.next()) {
				dto = new PiDto();
				dto.setId(rs.getString("id"));
				dto.setHeight(rs.getDouble("height"));
				dto.setWeight(rs.getDouble("weight"));
				}// if
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbclose(con, ps, rs);
		}// finally
		return dto;
	}// selectId

	public static PiDto selectFood(String date,String b) {
		PiDto dto = null;
		String sql = "select * from pi_food where id =? and h_day=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//System.out.println("123");
		try {
			con = getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, b);
			ps.setString(2, date);
			rs = ps.executeQuery();
			if (rs.next()) {
				dto = new PiDto();
				dto.setFood(rs.getDouble("food"));
			}// if
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbclose(con, ps, rs);
		}// finally
		return dto;
	}// selectId
	
	public static PiDto selectSports(String date,String b) {
		PiDto dto = null;
		String sql = "select * from pi_sports where id =? and h_day=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//System.out.println("123");
		try {
			con = getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, b);
			ps.setString(2, date);
			rs = ps.executeQuery();
			if (rs.next()) {
				dto = new PiDto();
				dto.setSports(rs.getDouble("sports"));
			}// if
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbclose(con, ps, rs);
		}// finally
		return dto;
	}// selectId
	
	public static boolean insertPi(PiDto dto) {
		// JDBC 프로그래밍 5단계
		boolean ok = false;
		Connection con = null;
		PreparedStatement ps = null;
		// insert into 테이블명(컬럼들) values(값들)
		String sql = "insert into pi(H_DAY, ID, HEIGHT, WEIGHT, FOOD, SPORTS, BIMAN, HEIGHT_E, WEIGHT_E, BIMAN_E,BIMAN_R) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			con = getCon();
			ps = con.prepareStatement(sql);
			// ? 13 개를 채우자
			ps.setString(1, dto.getH_Day());
			ps.setString(2, dto.getId());
			ps.setDouble(3, dto.getHeight());
			ps.setDouble(4, dto.getWeight());			
			ps.setDouble(5, dto.getFood());			
			ps.setDouble(6, dto.getSports());			
			ps.setDouble(7, dto.getBiman());
			ps.setDouble(8, dto.getHeight_e());
			ps.setDouble(9, dto.getWeight_e());
			ps.setDouble(10, dto.getBiman_e());
			ps.setString(11, dto.getBiman_r());
			int res = ps.executeUpdate(); // 실행
			if (res == 1)
				ok = true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(dto);
		} finally {
			dbclose(con, ps);
		}// finally
		return ok;
	}// insertMem

	private static void dbclose(Connection con, PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// if
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// if
	}// dbclose

	private static void dbclose(Connection con, PreparedStatement ps,
			ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// if
		dbclose(con, ps);
	}// dbclose

	// 데이터베이스 연결 메소드
	public static Connection getCon() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "";
		String user = "";
		String password = "";
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}// getCon

}// end