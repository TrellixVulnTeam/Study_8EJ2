package basic;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� 1,3 ���ڸ� 2,4 �Է� : ");
		
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
		case 3:
			System.out.println("����");
			break;
		case 2:
		case 4:
			System.out.println("����");
			break;
		default:
			System.out.println("����");
			break;
		}
		
		sc.close();
	}
}
