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

public class ApiTest02b {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("�Ѱ���"); printList(list);
		list.add("������"); printList(list);
		list.add("�Ѱ���"); printList(list);
		list.add("������"); printList(list);
		list.add("�̹���"); printList(list);
		
		list.add(2, "�̿���"); printList(list);
		list.remove("�̹���"); printList(list);  //����
		list.remove("�Ѱ���"); printList(list);  //����
		list.remove(1); printList(list);  //����
		
		list.set(1, "��ȿ��"); printList(list);  //��ü
		list.add("������"); printList(list);
		list.add("�̹���"); printList(list); 
		list.add("������"); printList(list);
		list.add("�̹���"); printList(list); 
		
		System.out.println("�������� ��ġ : " + list.indexOf("������"));   //���� ���ʺ��� �˻� 0 1 2 ������
		System.out.println("�������� ��ġ : " + list.lastIndexOf("������"));   //���� �����ʺ��� �˻�  
	}
	
	private static void printList(List<String> list) {
		System.out.print("size : " + list.size() + ",\t");
		for(String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
	}
}
