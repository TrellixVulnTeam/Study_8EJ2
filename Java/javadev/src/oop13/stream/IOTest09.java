package oop13.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest09 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = 0;
		long start = 0;
		long end = 0;
		
		/* BufferedOutputStream�� ������� ���� ��� */
		
		fis = new FileInputStream("Marvel_Logo.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("Marvel_Logo2.jpg");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("������� �ʾ��� �� : " + (end-start) + "ms");
		
		
		/* BufferedOutputStream�� ����� ��� */
		
		fis = new FileInputStream("Marvel_Logo.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("Marvel_Logo3.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		bos.close();
		fis.close();
		System.out.println("��� ������ : " + (end-start) + "ms");
		
	}
}
