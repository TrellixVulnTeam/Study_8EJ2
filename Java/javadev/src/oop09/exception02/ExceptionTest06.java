package oop09.exception02;

public class ExceptionTest06 {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű԰��� ���� �����մϴ�.");
			System.out.println("[������]");
			System.out.println("[java ExceptionTest06 ��1 ��2]");
			return; //�޼��� ��������
		}
		
		//��Ŭ���� Surround With Ŭ��  try - catch block Ŭ��
	
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);  // a��� ���ڶ����� ���ڷ� �ν� X : NumberFormatException �߻�
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("finally ��");
			//������ ���İ��� �� (�������� �������)
		}
		
	}
}
