package oop09.exception03;

public class ExceptionTest07 {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);  // a��� ���ڶ����� ���ڷ� �ν� X : NumberFormatException �߻�
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű԰��� ���� �����մϴ�.");
			System.out.println("[������]");
			System.out.println("[java ExceptionTest07 ��1 ��2]");
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("finally ��");
		}
	}
}
