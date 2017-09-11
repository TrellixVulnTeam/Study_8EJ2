package com.kyoungho.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AnnoMain {

	public static void main(String[] args) {
		UseAnnotation use = new UseAnnotation();
		
		
		String key = use.getClass().getAnnotation(CustomAnnotation.class).key();
		if(key.equals("Student")) {
			// ��Ÿ�ӽÿ� ���� �ൿ�� ����
		}
	}

}

// Target = ������ ��� : ������, �������, Ÿ��(Ŭ����), �Ķ����, �޼ҵ�
// Retention = �������̼� ������ �����ܰ�
//			   �ҽ��ڵ�, Ŭ��, ��Ÿ��
// Documented = javadoc�� ����ȭ�Ǿ������ϴ� ������Ʈ
// Inherited = ��ӵǴ� �������̼�

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
	public String value() default "��" ;
	public String key();
}


// �ֳ����̼��� ����� ��ü�� �����ڴ� �ƴϴ�
// �ַ� ������Ʈ �������̳� ���¼ҽ� �����ڵ���
// ���̺귯���� ���� �� ���� ����ϰ� �ϱ� ���ؼ� ���� �����Ѵ�.


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface GetConnection {
	public String url();
	public String id();
	public String pw();
}


class UseAnnotation {
	String key = "Student";
	
	@GetConnection(url = "�ּ�", id = "���̵�", pw = "��й�ȣ")
	// �ڵ忡 ���� ����ó���� �ʿ����
	public void process() {
		
		int a = 156;
		int b = 121321;
		int result = a + b / 1450;
	
		try {
			DriverManager.getConnection("�ּ�", "���̵�", "�н�����");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		System.out.println("result:" + result);
		
		String array[] = {"a", "b", "c"};
		for (String item : array) {
			System.out.printf("������ %s�Դϴ�", item);
		}
	}
}	
