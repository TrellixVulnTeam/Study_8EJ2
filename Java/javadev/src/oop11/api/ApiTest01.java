package oop11.api;
/*
 * Set�� Ư¡
 *  1. ������� ������� ����
 *  2. �ߺ��� ������ ��� X
 */
import java.util.HashSet;
import java.util.Iterator;

public class ApiTest01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();	//String ����ֱ� = generate
		set.add("�Ѱ���");
		set.add("������");
		set.add("�Ѱ���");
		set.add("������");
		set.add("�̹���");
		
		System.out.println(set.size());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
