package oop09.exception01;
/*
 * Runtime Exception3 (Unchecked Exception)
 * 
 *  	: NumberFormatException
 */
public class ExceptionTest03 {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "100a";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);  // a��� ���ڶ����� ���ڷ� �ν� X : NumberFormatException �߻�
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		
	}
}
