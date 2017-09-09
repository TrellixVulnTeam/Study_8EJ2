package oop07.anony02;

public class Anony {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
			
		}
		
		//�������̽��� �����ϴ� �͸�ü
	};
	
	public void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
				
			}
		};
		localVar.turnOn();
	}
	
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
