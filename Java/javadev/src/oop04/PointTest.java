package oop04;

public class PointTest {
	public static void main(String[] args) {
		
		//up casting(�� ĳ����) �ڵ� ����ȯ
		Point2D up = new Point3D();
		up.x = 100;
		up.y = 200;
		//up.z = 300;
		
		//�ڽ�(3D)��� ��ü�� ����������.. �����Ϸ��� 2D(�θ�)�� �ν��� 
		
		
		//�ٿ� ĳ����
		Point3D dn = (Point3D) up;
		dn.x = 1000;
		dn.y = 2000;
		dn.z = 3000;
		
		//���� ����ȯ���� �ڽ�Ŭ���� �νİ���   -   �ڽ��� �� �θ�ü�̱⵵��. ���ε���X
		
		// ex)   �ڽ�Ŭ���� < �θ�Ŭ���� < Object
		
	}
}
