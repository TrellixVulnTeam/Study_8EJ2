package School;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Student {
	
	public static void main (String[] args) {
		
		
		// �����Է����α׷��� �ʱ�ȭ �κ� Ŭ����, ArrayList
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		ArrayList list = new ArrayList();
		
		
		while (true) {
			System.out.println("==============�����Է�================");
			System.out.println("1. ���� �� 2. ���");
			
			int temp = sc.nextInt();
			if (temp == 1) {
				
				sc.nextLine();
				
				// ������ �Է��ϴ� �Էº�
				System.out.println("==============�̸��Է�================");
				student.name = sc.nextLine();
				
				System.out.println("==============������Է�================");
				student.score_korea = sc.nextInt();
				
				System.out.println("==============������Է�================");
				student.score_eng = sc.nextInt();
				
				System.out.println("==============���м����Է�================");
				student.score_math = sc.nextInt();
				
				student.number = 1;

				list.add(student);	
			}
			
			if (temp == 2) {
				
				// ���� �Է� �� �����͸� ������ִ� ��º�
				
				Student studentInput = null ;
				
				for(int i = 0 ; i < list.size(); i++) {
					studentInput = (Student) list.get(i);
				}
				
				System.out.println("=============���==============");
				System.out.println("�̸� : " + studentInput.name);
				System.out.println("��ȣ : " + studentInput.number);
				System.out.println("����� : " + studentInput.score_korea);
				System.out.println("�����: " + studentInput.score_eng);
				System.out.println("���м��� : " + studentInput.score_math);			
			}
		}
				
	}
}
