package oop02.static05;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("������", "Korean");
		Person p2 = new Person("�迬��", "Korean");
		
		System.out.println(p1);		//tostring�� �ڵ����� ȣ���
		System.out.println(p2.toString());
		
		System.out.println("-----------------------------------");
		
		p1.setName("���丣 ��");
		p1.setNation("Russian");
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}
}
