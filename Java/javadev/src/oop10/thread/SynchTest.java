package oop10.thread;

public class SynchTest {

	public static void main(String[] args) {
		Account atm = new Account(2500);
		
		User user1 = new User(atm, "������");
		User user2 = new User(atm, "������");
		User user3 = new User(atm, "���ֳ�");
		
		user1.start();
		user2.start();
		user3.start();
		
		
		
		
	}

}
