package oop09.exception03;

public class ExceptionTest09 {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);  // a��� ���ڶ����� ���ڷ� �ν� X : NumberFormatException �߻�
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { //������ : �������� �̿��ؼ� or ���� ��� ����
			System.out.println("���� �Ű԰��� ���� �����ϰų� ���ڷ� ��ȭ�� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("�� �� ���� ���� �߻�.");	
		} finally {
			System.out.println("finally ��");
		}
	}
}
