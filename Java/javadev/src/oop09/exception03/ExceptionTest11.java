package oop09.exception03;

public class ExceptionTest11 {
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			//e.printStackTrace();  //���ܰ� �߻��ؼ� ���޵Ǵ� ������ ���
			System.out.println(e.getMessage()); //���ܤ������� �߻��� ������ ���� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		}
		System.out.println("����");
	}

	private static void test() throws Exception {
		System.out.println("test() �޼��� ���� ����");
		
		
		throw new Exception("����ڰ� ������ ���� �߻�");
		
	}
}
