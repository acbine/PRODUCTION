package production.management.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JBDCTest {
	
	
	@Test
	public void Testcon() {
		
		Connection conn;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			log.info("드라이버 연결완료");
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mit","aaa","1234");
			log.info("주소연결 확인");
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
	}
	
	
	

}
