package oop07.anony01;

public class Anony {
	Person field = new Person() {

		public void work() {
			System.out.println("����մϴ�.");
		}
		
		@Override
		public void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
		
	};	// {} �ȿ� �ִ� �ڽİ�ü �̸��� ��� �͸�Ŭ����

	public void method1() {
		Person localVar = new Person() {
			public void walk() {
				System.out.println("��å�մϴ�.");
			}
			
			@Override
			public void wake() {
				System.out.println("7�� 30�п� �Ͼ�ϴ�.");
				walk();
			}
			
		};
		
		localVar.wake();
		
	}

	public void method2(Person person) {
		person.wake();
	}
	
}
