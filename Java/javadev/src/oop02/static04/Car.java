package oop02.static04;

public class Car {
	int speed;
	
	public void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.speed = 40;
		car.run();
	}
	
}
