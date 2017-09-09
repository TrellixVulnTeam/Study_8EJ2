package oop12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest01 {
	public static void main(String[] args) {
		Connection cn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "oj", "oj");
			
			System.out.println("����Ǿ����ϴ�.");
			
		} catch (Exception e) {
			System.out.println("���� ����");
			e.printStackTrace();
		} finally {
			if(cn != null) try {cn.close();} catch(Exception e) {}
		}
		
	}
}
