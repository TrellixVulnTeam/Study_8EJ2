package oop09.exception02;

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// ����ó�� �Ҷ� ����Ŭ���� Ÿ������ ����ִ°��� ����.
	}
}
