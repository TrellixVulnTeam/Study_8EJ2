package com.kyoungho.java.generictest;

public class GenericArray<T> {

	private Object list[];
	
	public GenericArray() { //���� ���� ���� ���¿��� ������ ���� üũ�� �� �� �ֱ� ������
					   // ����Ҹ� �ʱ�ȭ ���ִ� �۾��� �ʿ��ϴ�.
		
		// if (Type instanceOf target)
		list = (T[]) new Object[1];
	}
	
	public void add(T item) {
		// �迭�� ũ�⸦ �ӽ÷� �÷��� ���
		Object tempList[] = new Object[size()+1];
		for (int i=0 ; i < list.length ; i++) {
			tempList[i] = list[i];
		}
		
		tempList[list.length] = item;
		list = tempList;
	}
	
	public void remove (int position) {
		// �迭�� ũ�⸦ �ӽ÷� �÷��� ���
		Object tempList[] = new Object[size()-1];
		
		// position ������ �����͸� �ӽð������� ����
		for (int i=0 ; i < position ; i++) {
			tempList[i] = list[i];
		}
		
		// position ������ �����͸� �ӽð������� ����
		for (int i = position+1 ; i<list.length ; i++) {
			tempList[i-1] = list[i];
		}
		list = tempList;
	}
	
	public int size() {
		return list.length-1;
	}
	
}

