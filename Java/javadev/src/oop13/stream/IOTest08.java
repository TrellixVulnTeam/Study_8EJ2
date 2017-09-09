package oop13.stream;
import java.io.BufferedInputStream;
/*
 * : ��ǻ���� ���� �ð��� �������� 1970�� 1�� 1�� ���� ���ķ� ������ �ð���
 *   �и� ��(1/1000��) ������ ����ؼ� ��ȯ�ϴ� �޼ҵ�.
 */
import java.io.FileInputStream;

public class IOTest08 {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("Marvel_Logo.jpg");
		start = System.currentTimeMillis(); // �ð� ���� ����
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis(); // �ð� ���� ��
		System.out.println("BufferedInputStream�� ������� �ʾ��� �� : " + (end-start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("Marvel_Logo.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis(); // �ð� ���� ����
		while(bis.read() != -1) {}
		end = System.currentTimeMillis(); // �ð� ���� ��
		System.out.println("BufferedInputStream�� ����� �� : " + (end-start) + "ms");
		
		bis.close();
		fis2.close();
	}
}
