package basic;

public class DataType {
	public static void main(String[] args) {
		boolean b1 = false;
		System.out.println("b1 : " + b1);
		
		byte b2 = 127;
		System.out.println("b2 : " + b2);
		
		//char c = 'A';
		char c = 65;
		System.out.println("c : " + c);
		
		int i = 2147483647;
		System.out.println("i: " + i);
		
		short s = 32767;
		System.out.println("s: " + s);
	
		long l1 = 2147483648L;
		System.out.println("l1 : " + l1);
		
		double d = 3.1415926535;
		System.out.println("d : " +d);
		
		float f = 3.141592f;
		System.out.println("f : " +f);
		
		
		//�̽������� ������(Escape Sequence)
		System.out.println("�ظ��� ���ƴ�, \"�� ���ٶ˲پ�~!!\"");
		System.out.println("�ȳ��ϼ���\n�ݰ����ϴ�.");
		System.out.println("0\t1\t2\t3");
		
		
	}
}
