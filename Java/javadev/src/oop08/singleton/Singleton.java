package oop08.singleton;
/*
 * �̱��� ���� ���� ����
 * 		1. �����ڸ� �ۼ��ϰ� private���� ����
 * 		2. �ڱ��ڽ��� ������ �� �ִ� ������ ���� �� ����
 * 		3. ���� �޼ҵ� ���ο��� �ڱ��ڽ��� �ν��Ͻ� ����
 * 		4. Singleton.getInstance() �̿��ؼ� �ν��Ͻ� ������
 */
public class Singleton {
	
	private static Singleton singleton = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
}
