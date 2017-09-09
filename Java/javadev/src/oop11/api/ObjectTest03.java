package oop11.api;

public class ObjectTest03 {
	public static void main(String[] args) {
		String str1 = new String("������̿� �����϶�!");
		String str2 = new String("������̿� �����϶�!");  // new ��� �����ڸ� ���� ���ο� ��ü�� ���������.
		
		if(str1==str2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if(str1.equals(str2)) {  //������ ������ ���Ҷ� equals�� �̿��Ѵ�.
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		System.out.println(str1.toString());
		System.out.println(str1.hashCode());
		System.out.println(str1 = str1.replace("����", "����"));
		System.out.println(str1.hashCode());
	
		
		System.out.println("-----------------------------------------");
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode() + "." + sb.length() + "." + sb.capacity());
		
		sb.append("�Ǽ��� ");
		System.out.println(sb.hashCode() + "." + sb.length() + "." + sb.capacity());
		
		sb.append("���� �뼭�ϴ� ");
		System.out.println(sb.hashCode() + "." + sb.length() + "." + sb.capacity());
		
		sb.append("�ΰ��� �����̴�. ");
		System.out.println(sb.hashCode() + "." + sb.length() + "." + sb.capacity());
	}
}
