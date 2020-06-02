package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo2 {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		}catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"",
					"",
					""
					);
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member1 (num, NAME, addr) VALUES(?,?,?)");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 9);
			pstmt.setString(2,  "샤넬");
			pstmt.setString(3, "프랑스");
			
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : "+resultCount);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con !=null)con.close();
				if(pstmt !=null)pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
