package oop07.anony01;

public class AnonyTest {
	public static void main(String[] args) {
		Anony anony = new Anony();
		anony.field.wake();
		
		anony.method1();
		anony.method2(new Person() {

			public void study() {
				System.out.println("�ڹٸ� �����մϴ�.");
			}
			
			@Override
			public void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
			//�͸�ü
		});
	}
}
