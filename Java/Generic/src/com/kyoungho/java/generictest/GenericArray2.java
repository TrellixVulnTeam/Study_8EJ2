package com.kyoungho.java.generictest;

import java.lang.reflect.Array;

public class GenericArray2<T> {

	int count = 0;
	T array[];
	
	public GenericArray2() {
		int capacity = 16;
		array = (T[]) new Object[capacity];
		
	}
	
	public GenericArray2(int index) {
		array = (T[]) new Object[count];
	}
	
	public T[] capacityAdd() {
		T newArray[] = (T[])new Object[array.length+16];
		for(int i=0 ; i<array.length ; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	public void add(T object) {
		try {
			//set(Ÿ��, �ε���, ��) - Ÿ���� �ε����� ���� �Է�
			Array.set(array, count, object);
			count++;
		} catch(Exception e) {
			Array.set(capacityAdd(), count, object);
			count++;
		}
	}
	
	public int size() {
		return count+1;
	}
	
	public void remove(int index) {
		if(index > count) {
			// ������ �ͼ��� ó��
			throw new IndexOutOfBoundsException ("�������");
		}
		for(int i = index; i<count; i++) {
			array[i] = array[i+1];
		}
		array[count] = null;
	}
}