package basic;

import java.util.Scanner;

public class OpTest01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //System.in�� �ܼ��Է�(ǥ���Է�) ��, Ű���� �Է��� �ǹ�
		
		// shift f2 �� ����Ȯ�ΰ���
		
		System.out.print("���� a�� �Է� : ");
		
		int a = sc.nextInt();
		
		System.out.print("���� b�� �Է� : ");
		
		int b = sc.nextInt();
				
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));  // ������ ������ ������ ����� ����
		System.out.println(a+"%"+b+"="+(a%b));  // �������������
		
		sc.close();
	}
}
