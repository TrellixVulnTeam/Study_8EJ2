package oop12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[�α���]");
		String id = null;
		String name = null;
		String password = null;
		
		System.out.print("id : "); id = sc.nextLine();
		System.out.print("password : "); password = sc.nextLine();
		
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		sc.close();
		
		String sql = 
				"SELECT name " +
				"FROM j_member " +
				"WHERE id=? AND password=?";
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oj", "oj");
					
			ps = cn.prepareStatement(sql);   //jdbc �ۼ��Ҷ� prepareStatement�� �ۼ�
			ps.setString(1, id);
			ps.setString(2, password);
			rs = ps.executeQuery();  //�̸� �Ѱ�� ������ sql�� �����
					
			if(rs.next()) {
				name = rs.getString("name");
				System.out.println(name + "(" + id + ")���� �α��� �Ͽ����ϴ�.");
			}else {
				System.out.println("���̵� Ȥ�� �н����尡 Ʋ���ϴ�.");
			}
		}catch(Exception e) {
				e.printStackTrace();
		}finally {
			if(rs!=null) try {rs.close();} catch(Exception e) {}
			if(ps!=null) try {ps.close();} catch(Exception e) {}
			if(cn!=null) try {cn.close();} catch(Exception e) {}
		}			
	}
}