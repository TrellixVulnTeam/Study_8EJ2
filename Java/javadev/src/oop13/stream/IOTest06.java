package oop13.stream;

import java.io.File;
import java.io.FileWriter;

public class IOTest06 {
	public static void main(String[] args) throws Exception {
		File f = new File("sample2.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("�׷�, �� ���븸." + "\r\n");   // \r ���� Ŀ���� ���� \n �����ٷ��̵� : EnterŰ ȿ��
		fw.write("����� �������� �ʴ� ������!");
		
		fw.close();
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}
