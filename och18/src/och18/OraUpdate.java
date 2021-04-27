package och18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraUpdate {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호을 입력해주세요");     String deptno = sc.nextLine();
		System.out.println("부서명을 입력해주세요");       String dname = sc.nextLine();
		System.out.println("위치를 입력해주세요");        String loc    = sc.nextLine();
		Connection conn = null;
		Statement stmt  = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql =
				String.format("Update Dept set dname = '%s',loc='%s' where deptno=%s", dname,loc,deptno);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			// result Set
			int result = stmt.executeUpdate(sql); // 수행 -> executeUpdate
			if (result > 0) System.out.println("Success 연결 성공");
			else            System.out.println("Fail 연결 실패");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
		}
		sc.close();

	}

}
