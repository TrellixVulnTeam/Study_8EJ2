
public class LambdaMain {

	public static void main(String[] args) {
		LambdaInterfaceBasic lib = new LambdaInterfaceBasic();
		lib.run();
		
		OneProcess process = OneProcess();
		process.process(
			// callback Ŭ������ lambda�� �����ϱ�
			
			// 1. �Լ����� ���ְ� () {} ���̿� ȭ��ǥ�� �ִ´�.
			//    (int x) -> {
			//	  System.out.println(x);
			//    }
			
			// 2. �Ķ���Ͱ� �ϳ��̸� Ÿ���� ������ �� �ִ�
			// -> {
			//	  System.out.println();
			//    }
			
			// 3. �ϳ��� �Ķ���͸� �Ķ�������� ��ȣ�� ����,
			//    ������ �����̸� �������� ��ȣ�� ����
			//    x -> System.out.println(x)
			
			// 4. �Ķ���Ͱ� ������ ��ȣ�� �ݵ�� �ۼ�
			//	  ()-> System.out.println("Hello")
			
			// 5. ���ϰ��� ���� ���
			//    () -> return "Hello"
			
			// 6. ������
			//    �Ķ������ ������ ���� ������ ��� ��ü :: �޼��� ���·� ȣ���� �� �ִ�.
			System.out::println
		);
	}
}

class OneProcess() {
	public void process(One one) {
		one.run(x, y, z);
	}
}

// 1. �ϳ��� Ŭ������ �ϳ��� �Լ� ( O )

interface One {
	public void run(int x, int y, int z);
	public void stop();
}