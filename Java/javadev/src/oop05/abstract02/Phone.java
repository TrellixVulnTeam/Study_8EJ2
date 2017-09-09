package oop05.abstract02;

public abstract class Phone {
	String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println(owner + "�� �� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println(owner + "�� �� ������ ���ϴ�.");
	}
	
	public abstract void internetSearch();
	
}
