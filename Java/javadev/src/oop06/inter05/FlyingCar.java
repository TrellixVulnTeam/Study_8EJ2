package oop06.inter05;

public class FlyingCar implements Drivable, Flyable {

	@Override
	public void fly() {
		System.out.println("�ϴ��� ���ϴ�");
		
	}

	@Override
	public void drive() {
		System.out.println("������ �մϴ�");
		
	}
	
}
