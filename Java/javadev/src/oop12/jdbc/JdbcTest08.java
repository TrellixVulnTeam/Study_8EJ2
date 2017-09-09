package oop12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = 0;
		String password = null;
		
		System.out.println("������ ���ڵ� no : ");
		
		try {
			no = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			System.exit(1);
		}
		
		System.out.println("ó�� �� �ۼ��� �Է��� ��й�ȣ�� ���Է��ϼ��� : ");
		password = sc.nextLine();
		
		sc.close();
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql = 
				"DELETE FROM j_board " + 
				"WHERE no =? AND password=? ";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oj", "oj");
			
			ps = cn.prepareStatement(sql);
			ps.setInt(1, no);
			ps.setString(2, password);
					
			
			if(ps.executeUpdate() > 0) {
				System.out.println("�����Ǿ����ϴ�.");
			}else {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			}
			
		}catch(Exception e) {
			System.out.println("���� ���� : " + e.getMessage());
		}finally {
			if(ps!=null) try {ps.close();} catch(Exception e) {}
			if(cn!=null) try {ps.close();} catch(Exception e) {}
		}
	}
}
