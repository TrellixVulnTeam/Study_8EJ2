package oop09.exception04;

public class Account {
	private long balance;  // ���� ���� �ܾ�
	
	public Account() {}
	
	public long getBalance() { // ���� ���� ���� Ȯ��
		return balance;
	}
	public void desposit(int money) {  //�Ա��ϴ� �޼���
		balance += money;
	}
	
	public void withdraw(int money) throws MyException { //����ϴ� �޼���
		if(balance < money) {
			
			throw new MyException("�ܰ���� : " + (money-balance) + "���ڶ�");
		}
		
		balance -= money;
	}
	
}
