package basic;

import java.util.Scanner;

public class OpTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int n = sc.nextInt();
		
		System.out.println(n%2==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.");
		
		sc.close();
	}
}
