package oop02.static05;

public class Person {
	String name;
	static String nation;  //static�� �Ժη� ���� �ȵǴ� ����!, static=���� ���ϸ��� �޸𸮿� �Ҵ��
	
	public Person(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", nation=" + nation + "]";
	}
}
