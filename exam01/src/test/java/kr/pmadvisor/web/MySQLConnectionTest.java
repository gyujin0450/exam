package kr.pmadvisor.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	// private static final String DRIVER = "com.mysql.jdbc.Driver";
	// Loading class `com.mysql.jdbc.Driver'. This is deprecated.
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	// he server time zone value '���ѹα� ǥ�ؽ�' is unrecognized or represents more than one time zone.
	// https://offbyone.tistory.com/318	
	// private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex?serverTimezone=Asia/Seoul";
	private static final String USER = "pmsadmin00";
	private static final String PW = "qwer@asdF1";
	
	@Test
	public void testConnection() throws Exception {
		
		Class.forName(DRIVER);
		
		try(Connection conn = DriverManager.getConnection(URL, USER, PW)){
			
			System.out.println(conn);
			
		}catch(Exception e) {
			
			System.out.println("오류");
			
			e.printStackTrace();
		}
		
	}
	
}
