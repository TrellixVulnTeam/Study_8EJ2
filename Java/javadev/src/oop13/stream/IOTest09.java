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
		
		/* BufferedOutputStream을 사용하지 않은 경우 */
		
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
		System.out.println("사용하지 않았을 때 : " + (end-start) + "ms");
		
		
		/* BufferedOutputStream을 사용한 경우 */
		
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
		System.out.println("사용 했을때 : " + (end-start) + "ms");
		
	}
}
