package oop09.exception04;

public class MyExceptionTest {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.desposit(10000); //�Ա��ϱ�
		System.out.println("�Աݾ� : " + account.getBalance());
		
		try {
			account.withdraw(30000); //����ϱ�
		} catch (MyException e) {
			//e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		} 
	}
}
