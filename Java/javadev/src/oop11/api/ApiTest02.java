package oop11.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Ctrl+Shift+O(���ĺ�)  �� �ʿ��� ����Ʈ�� �ٷ� �־��� �� �ִ�. �ʿ���°� �˾Ƽ� ��������.

/*
 * List�� Ư¡
 *  1. ������� ����
 *  2. ������ �ߺ� ���
 */

public class ApiTest02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("�Ѱ���");
		list.add("������");
		list.add("�Ѱ���");
		list.add("������");
		list.add("�̹���");
		
		System.out.println(list.size());
		
		/*Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}*/
		
		/*for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}
