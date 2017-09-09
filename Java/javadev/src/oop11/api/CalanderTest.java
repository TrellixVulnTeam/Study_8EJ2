package oop11.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalanderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է� (ex. 2017) : ");
		int year = sc.nextInt();
		
		System.out.print("���� �Է� (ex. 7) : ");
		int month = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		int sweek = 0; //�� ���� ù ��°���� ���� (��:1, ��:2, ȭ:3 ... ��:7)
		int eday = 0; //������ ��¥
		
		cal.set(year, month-1, 1);
		
		sweek = cal.get(Calendar.DAY_OF_WEEK);
		eday = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println("   " + year + "�� " + month + "��");
		System.out.println(" �� �� ȭ �� �� �� ��");
		
		for(int i=1; i<sweek; i++) {  //ù° ���� ��µǱ� ������ ���� ó��
			System.out.print("   ");
		}
		
		for(int d=1, w=sweek; d<=eday; d++, w++) {  //1�Ϻ��� ������ ��¥���� ���
			System.out.print(d<10 ? "  "+d : " "+d);
			if(w%7==0) System.out.println();
		}
		
		sc.close();
		
	}
}
