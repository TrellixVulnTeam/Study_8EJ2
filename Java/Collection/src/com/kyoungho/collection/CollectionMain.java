package com.kyoungho.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		CollectionMain main = new CollectionMain();
		//main.checkArray();
		//main.checkGeneric();
		main.checkSet();
	}
	
	public void checkArray() {
		// ����
		// Ÿ�� �̸�[] = new Ÿ�� [�迭����ũ��];
		// �⺻���� int, long ���� ������ �Ҵ��ϴ� �͸����� �⺻���� 0�� �Ҵ�
		int intArray[] = new int[10];
		System.out.println(intArray[7]);

		Item itemArray [] = new Item[10];
		int itemLength = itemArray.length;
		for(int i=0 ; i<itemLength ; i++) {
			itemArray[i] = new Item();
		}
		System.out.println(itemArray[7].getMyName());
	}
	// index�� �����ϴ� ���� ��ü�迭
	public void checkList() {
		// ������ �Ϲ� ��ü�� �ʱ�ȭ �ϴ°Ͱ� ����
		ArrayList list = new ArrayList();
		
		// �Է�
		list.add(new Item()); // <- ��0�� index�� ����
		list.add(new Item()); // <- ��1�� index�� ����
		
		// ��ȸ		
		list.get(0); // <- index�� 0��°�� ���� �����´�
		
		// ����
		list.set(1, new Item()); // <- 1�� index�� �������� ��ü
		
		// add�� �ٸ� ���
		list.add(1, new Item()); // <- 1������ ������ ������ index�� �ϳ��� ������Ű�� �ڽ��� 1������ ����.
		
		// ����
		list.remove(1); // ������ �������� index�� �����Ѵ�.
						// �����ϸ� ���� �����͵��� ������ ��ĭ�� �̵��ؼ� ������� ä���.
	}
	public void checkGeneric() {
		// ���׸��� ����ϴ� ���
		// Ÿ��<���׸�Ÿ��> �����̸�; // <- ���׸�Ÿ���� Ŭ������ ����
		ArrayList<Item> list = new ArrayList<>();
		
//		list.add(123);
//		list.add("Hello");
		list.add(new Item());
//		list.add(new Student());
		
		/*for(int i=0; i<list.size(); i++) {
			System.out.println();
		}*/
		
		for(Item item : list) {
			item.getMyName();
		}
	}
	
	// List�� �����ѵ� �ߺ����� ������� �ʴ� ���� ��ü�迭
	public void checkSet() {
		HashSet set = new HashSet();
		set.add("Hello");
		set.add("Good to see you");
		set.add("Hello");
		
		// set�� iterator �� �޾Ƽ� ������� ó���� �� �� �ִ�. ��ġ listó��
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	// Key, Value�� ������ ���� ��ü�迭
	public void checkMap() {
		// ����
		HashMap<String, Integer> map = new HashMap<>();
		
		// �Է�
		map.put("key01", 123456);
		map.put("key02", 123456789);
		
		// ��ȸ
		System.out.println(map.get("key01"));
		
		// ���� �ݺ������� ó���ϱ�
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(map.get(key));
		}
		
	}
}

class Item {
	private String myName = "����";
	public String getMyName() {
		return myName;
	}

}

class Student {
	private String name = "student";
	public String getName() {
		return name;
	}
}