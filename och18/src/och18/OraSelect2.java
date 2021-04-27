package och18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class OraSelect2 {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql    = "Select * From emp";
		Connection conn = null;  //DB
		Statement  stmt = null;	 //Sql
		ResultSet  rs   = null;	 //
		System.out.println("사원명단");
		System.out.println("사원코드\t 사원명\t 업무\t\t 급여\t 일자");
		System.out.println("===============================================");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement(); //stmt
			rs   = stmt.executeQuery(sql); //SQL
			
			if(rs.next()) {
				do {
					int    empno   = rs.getInt(1);
					String ename = rs.getString(1);
					String job   = rs.getString(2);
					int    sal   = rs.getInt("sal");
					Date   date  = rs.getDate("hiredate");
					if  (job.length() < 7)
						 System.out.printf("%d\t%s\t%s\t\t%d\t%TF\n",empno,ename,job,sal,date);
					else System.out.printf("%d\t%s\t%s\t%d\t%TF\n",empno,ename,job,sal,date);
				}while(rs.next());
			}
			else {
				System.out.println("자료가 없습니다");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			if( rs  != null)  rs.close();
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
		}

	}

}
