package basic;
/*
 *1.  return �� ���
 *  1) �޼ҵ��� ��������
 *  2) ���� ��ȯ
 *  
 *2. �޼ҵ� �����ε� (Overloading)
 *	: �޼ҵ���� ������ �Ķ������ ������ Ÿ���� �ٸ� ���
 */
public class MethodTest01 {
	public static void main(String[] args) {
		print();
		print();
		print("Kim");
		print("KH");
		int a = 7, b = 4;
		System.out.println(a+"+"+b+"="+add(a, b));
		System.out.println(a+"-"+b+"="+sub(a, b));
		System.out.println(a+"*"+b+"="+mul(a, b));
		System.out.println(a+"/"+b+"="+div(a, b));
		System.out.println(a+"%"+b+"="+mod(a, b));
		
	}    //Public�� �ٸ����� ��밡�� (ȣ���Ҽ� �ִ�. = ����)
	// �޼ҵ� ����!!!
	
	
	private static int add(int a, int b) {
		
		return a + b;
	}

	private static int sub(int a, int b) {

		return a - b;
	}

	private static int mul(int a, int b) {

		return a * b;
	}

	private static int div(int a, int b) {

		return a / b;
	}

	private static int mod(int a, int b) {

		return a % b;
	}

	private static void print(String name) {
		System.out.println("Hello " + name);
		
	}

	private static void print() {
		System.out.println("Hello World");
		return;  //return : ����
	}    //Private �� ���⼭�� ��밡��, �ٸ������� ȣ�����
	
	
}
