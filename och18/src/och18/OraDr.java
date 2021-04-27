package och18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OraDr {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		// Localhost -> 127.0.0.1; ,Port 번호 :1521 , xe(orcl) -> Service ID(Sid)
//		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Start");
			if(conn != null) {
				System.out.println("Success 연결 성공");
			}else {
				System.out.println("Fail 연결 실패");
			}
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
