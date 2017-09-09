package oop10.thread;

public class User extends Thread{ //�������� ����� ���ÿ� Account Ŭ������ ����� �� �ִ� ȯ���� �����ϱ� ����
                                  //Thread�� ��ӹ޴´�.
	boolean flag = false;
	// flag : true -> �Ա�
	// flag : false-> ���
	
	Account obj; // �ܾ��� �����ϱ� ���� ���� �������
	
	public User(Account obj, String name) {     
		this.obj = obj;
		this.setName(name);
	}
	
	
	
	@Override
	public void run() {
		for(int i=0; i <= 1; i++, flag = !flag) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(flag) { //�Ա�
				obj.deposit(
					(int)(Math.random() * 20 +6)*100, //600 ~ 2500 ������ ����� ���� 
					this.getName());
			} else {   //���
				obj.withdraw(
					(int)(Math.random() * 20 +6)*100, 
					this.getName());
			}
		}
	}
	
	
	
}
