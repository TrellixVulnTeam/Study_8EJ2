package oop01;

public class Point2D {
	private int x;
	private int y;   // �ٷ� �Ʒ� ������ ������
	
	//�޼ҵ� �̸� ���� ; �ҹ��ڷ� ���� �����ܾ �빮��
	
	//alt shift s : Source �޴��� ���� - getter setter Ŭ���ϸ� ���ϰ� �޼ҵ� �߰���ų �� �ִ�.
	
	
	public Point2D() {
		this(1, 2);
		System.out.println("Point2D() ������");
	}	//�⺻ ������ ���� (Ư¡ : Ŭ���� �̸��� ������, ��ȯ�� (ex int)�� ����.) ��ü�� ���� ���ÿ� �ٷ� ����!
		//this�� �̿��ϸ� �Ʒ� int x, y �� ������ ����
	
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) ������");
	}
	
	//�����ڵ� �޼ҵ� �����ε��� ����.. ������ �����ϴ°�.
	//�ѹ� ������ �����ϸ� �⺻ �����ڸ� �����Ϸ��� �ڵ����� ������ ���� �ʴ´�.
	

	public int getX() {
		return x;
	}
	public void setX(int x) {   //�ٱ��� �ִ� int x�� �ٸ���!
		this.x = x;  //������ x �� public�� �ִ� x�� ����.  this.x�� �ٱ��� �ִ� x�� ����. this�� �̿��ؼ� ������ ���´�.
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print() {
		//���θ޼ҵ�, ����� ���θ޼ҵ� ����� ���´�
				System.out.println("x=" + getX());
				System.out.println("y=" + getY());		//get �ҷ�����
	}
	

	// getter setter �̿��Ͽ� ���� ���� ����! getter(�ҷ�����) setter(����) �Ѵ� ���ÿ� ���Ǹ� 
	
	
	
	
	
}
