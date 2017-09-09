package oop01;

public class Point3D extends Point2D{   //extends �θ��� Point2D�� �״�� ��������
	private int z;		//���� �ϳ��ۿ� ������ ����ٿ��� ���콺 ���ٵ��� �ٷ� get set ������ ����

	public Point3D() {
		//super();  //���� �������ϸ� �ڵ����� �θ�ü�� ȣ���ϰ� �Ǿ��ִ�.
		this(10, 20, 30);
		System.out.println("Point3D() ���� ��");
	}
	
	
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D(x,y,z) ���� ��");
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void print() {
		//���θ޼ҵ�, ����� ���θ޼ҵ� ����� ���´�
				super.print();  // super �θ�Ŭ������ ����(�θ�Ŭ������ �ִ� print�޼ҵ带 ȣ��)
				System.out.println("z=" + getZ());
	}
	// �θ� public�ε� �ڽ��� private�� ���ϼ� ����. ������ - ��κ� ���빰�� ��������
	
}
