package oop12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[�Խ��� �Է�]");
		String title = null;
		String name = null;
		String password = null;
		String content = null;
		
		System.out.print("���� : "); title = sc.nextLine();
		System.out.print("�̸� : "); name = sc.nextLine();
		System.out.print("��й�ȣ : "); password = sc.nextLine();
		System.out.print("���� : "); content = sc.nextLine();
		
		sc.close();
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = 
				"INSERT INTO j_board(no, title, name, password, content) " + 
				"VALUES(j_board_seq.nextval,?,?,?,?) ";
		
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oj", "oj");
			
			ps = cn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, content);
			ps.executeUpdate();
			
			System.out.println("���� ��ϵǾ����ϴ�.");
					
		} catch(Exception e) {
			System.out.println("�� ��� ���� : " + e.getMessage());
		} finally {
			if(ps!=null) try {ps.close();} catch(Exception e) {}
			if(cn!=null) try {ps.close();} catch(Exception e) {}
			
		}
		
	}
}
