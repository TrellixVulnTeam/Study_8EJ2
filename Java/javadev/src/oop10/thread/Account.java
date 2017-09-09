package oop10.thread;

public class Account {
	private int money;
	public Account(int money) {  
		// ù ���� ������ �ʱ� �Աݱݾ�
		this.money = money;
	}
			
	
	public synchronized void deposit(int amount, String name) { //�Ա�
		money += amount;
		System.out.println(name + ", �Աݱݾ� : " + amount);
		getMoney();
	}
			
	
	public synchronized void withdraw(int amount, String name) { //���
		if (money >= amount) { // �ܾ��� ��ݱݾ׺��� Ŭ ���
			Thread.yield();  //"�ڽ��� ������ �ٸ� �����忡 ��� �̾��ϰ� �ڽ��� ����."
                             //"��Ʈ��ũ Ʈ���� ��Ȳ�� ����"
			money -= amount;
			System.out.println(name + ", ��ݱݾ� : " + amount);
		} else {               // �ܾ׺��� ��ݱݾ��� Ŭ ���
			System.out.println(
				name + "���� " + amount + 
				"�ݾ��� ����Ϸ� ������, �ܾ׺������� ��ݵ��� �ʾҽ��ϴ�.");
		}
		getMoney();
	}
	
		
		
	public void getMoney() {
		System.out.println("���� �ܾ��� " + this.money + "�Դϴ�.");
	}
}
