package oop12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = 0;
		String title = null;
		String name = null;
		String password = null;
		String content = null;
		
		System.out.print("������ ���ڵ� no : ");
		try {
			no = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			System.exit(1);
		}
		
		System.out.print("���� : "); title = sc.nextLine();
		System.out.print("�̸� : "); name = sc.nextLine();
		System.out.print("���� �� �ۼ��� �̷��� ��й�ȣ �̷� : "); password = sc.nextLine();
		System.out.print("����: "); content = sc.nextLine();
		
		sc.close();
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql =
			"UPDATE j_board " +
			"SET title=?, name=?, content=? " +
			"WHERE no=? AND password=? ";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oj", "oj");
			
			ps = cn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, name);
			ps.setString(3, content);
			ps.setInt(4, no);
			ps.setString(5, password);
			
			if(ps.executeUpdate() > 0) {
				System.out.println("�����Ǿ����ϴ�.");
			}else {
				System.out.println("���ڵ尡 �������� �ʰų� ��й�ȣ�� Ʋ���ϴ�.");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(ps!=null) try {ps.close();} catch(Exception e) {}
			if(cn!=null) try {ps.close();} catch(Exception e) {}
			
		}
			
	}
}
