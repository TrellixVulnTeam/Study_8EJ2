package oop09.exception03;

public class ExceptionTest10 {
	public static void main(String[] args) {
		test();
		System.out.println("����");
	}

	private static void test() {
		System.out.println("test() �޼��� ���� ����");
		
		try {
			throw new Exception("����ڰ� ������ ���� �߻�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
