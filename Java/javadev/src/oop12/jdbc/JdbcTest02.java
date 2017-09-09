package oop12.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcTest02 {
	public static void main(String[] args) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		
		String sql = 
				"SELECT no, name, title " +
				"FROM j_board " +
				"ORDER BY no DESC ";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oj", "oj");
			
			st = cn.createStatement();
			rs = st.executeQuery(sql);  //�۾��� ����, ������ executeUpdate, �ܼ� DB ������°� executeQuery
			
			System.out.println("�۹�ȣ\t\t�̸�\t\t����");
			System.out.println("========================================================");
			while(rs.next()) {
				System.out.println(rs.getInt("no") + "\t\t" +
								   rs.getString("name") + "\t\t" +
								   rs.getString("title"));   
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			if(rs!=null) try {rs.close();} catch(Exception e) {}
			if(st!=null) try {st.close();} catch(Exception e) {}
			if(cn!=null) try {cn.close();} catch(Exception e) {}
		}
	}
}
