public class Calc {
	//��Ʈ���� ������ ��� �Ž����� ���
	public static void main(String[] args) {
		Calc c = new Calc();
		c.calc(12222, 3750);
	}
	
	public void calc(int payment, int price) {
		int totalChange = payment - price;
		int fiveThousand = totalChange / 5000;
		totalChange %= 5000;
		int thousand = totalChange / 1000;
		totalChange %= 1000;
		int fiveHundred = totalChange / 500;
		totalChange %= 500;
		int hundred = totalChange / 100;
		totalChange %= 100;
		int fifty = totalChange / 50;
		totalChange %= 50;
		int ten = totalChange / 10;
		
		System.out.println("�� �Ž����� : " + totalChange +"��");
		System.out.println("��õ�� : " + fiveThousand + "��");
		System.out.println("õ�� : " + thousand + "��");
		System.out.println("����� : " + fiveHundred + "��");
		System.out.println("��� : " + hundred + "��");
		System.out.println("���ʿ� : " + fifty + "��");
		System.out.println("�ʿ� : " + ten + "��");
	}
}