package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20200603.MemberDto;

public class EmpDao {
	//1. Singleton Pattern 코딩
	// 1) 생성자의 접근한정자를 private 으로 설정한다.
	// 2) 해당 클래스의 객체를 생성할 수 있는 변수를 static으로 선언한다.
	// 3) 해당 클래스의 객체를 생성할 수 있는 메서드를 static으로 만든다.
	
	private static EmpDao dao;
	
	public static EmpDao getInstance() {
		if(dao == null) {
			dao = new EmpDao();
		}
		return dao;
	}
	
	private EmpDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int insert(EmpDto e) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12",
					"kpc1234"
					);
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp (empno,ename,job,mgr, ");
			sql.append("hiredate, sal, comm, deptno) VALUES ");
			sql.append("(?, ?,?, ?, CURDATE(), ?, ?, ?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, e.getNo());
			pstmt.setString(++index, e.getName());
			pstmt.setString(++index, e.getJob());
			pstmt.setInt(++index, e.getMgr());
			pstmt.setInt(++index, e.getSal());
			pstmt.setInt(++index, e.getComm());
			pstmt.setInt(++index, e.getDeptNo());
			
			resultCount = pstmt.executeUpdate();
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			try {
				if(pstmt !=null)pstmt.close();
				if(con !=null)con.close();
				pstmt.close();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
		return resultCount;
	}
	
	public int update(EmpDto e) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost/kpc","kpc12","kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp ");
			sql.append("SET ename = ?, job = ?, mgr = ?, ");
			sql.append("hiredate = CURDATE(), sal = ?, comm = ?, deptno = ? ");
			sql.append("WHERE empno = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setString(++index, e.getName());
			pstmt.setString(++index, e.getJob());
			pstmt.setInt(++index, e.getMgr());
			pstmt.setInt(++index, e.getSal());
			pstmt.setInt(++index, e.getComm());
			pstmt.setInt(++index, e.getDeptNo());
			pstmt.setInt(++index, e.getNo());
			resultCount = pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			close(con, pstmt);
			
		}
		return resultCount;
	
	}
	
	public int delete(int no) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost/kpc","kpc12","kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM emp  ");
			sql.append("WHERE empno = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, no);
			resultCount = pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			close(con, pstmt);
			
		}
		return resultCount;
	}

	private void close(Connection con, PreparedStatement pstmt) {
		try {
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public ArrayList<EmpDto> select(int start, int len) {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost/kpc","kpc12","kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr,date_format(hiredate,'%Y.%m.%d'), ");
			sql.append("sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("ORDER BY empno DESC ");
			sql.append("LIMIT ? ,?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
		
			pstmt.setInt(++index, start);
			pstmt.setInt(++index, len);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 0;
				int no = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hireDate = rs.getString(++index);
				int sal = rs.getInt(++index);
				int comm = rs.getInt(++index);
				int deptNo = rs.getInt(++index);
				list.add(new EmpDto(no,name,job,mgr,hireDate,sal,comm,deptNo));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			close(con, pstmt, rs);
			
		}
		return list;
	}
	public EmpDto select(int no) {
		EmpDto empDto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost/kpc","kpc12","kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr,date_format(hiredate,'%Y.%m.%d'), ");
			sql.append("sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("WHERE empno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
		
			pstmt.setInt(++index, no);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				index = 0;
				int _no = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hireDate = rs.getString(++index);
				int sal = rs.getInt(++index);
				int comm = rs.getInt(++index);
				int deptNo = rs.getInt(++index);
				empDto = new EmpDto(_no,name,job,mgr,hireDate,sal,comm,deptNo);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			close(con, pstmt, rs);
			
		}
		return empDto;
	}
	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	
	
	
	
}
