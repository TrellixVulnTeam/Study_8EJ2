
public class ControlFlow {
	//���ǹ�
	// if switch
	public void checkIf() {
		int a = 10;
		int b = 5;
		
		if (a > b) {
			// a�� b���� ũ�� ����Ǵ� ����
			System.out.println("a�� b���� Ů�ϴ�");
		}else if (a == b){
			// a�� b�� ������ ����Ǵ� ����
		}else {
			// �� �� ������ �� ����Ǵ� ����
		}
	}
	
	public void checkSwitch() {
		int a = 10;
		int b = 5;
		switch(a) {
			case 5 :
				System.out.println("a�� ���� 5�Դϴ�.");
				break;
			case 10 :
				System.out.println("a�� ���� 10�Դϴ�.");
				break;
		}
		
	}
	//�ݺ���
	//for while
	public void checkFor() {
		int array[] = {1 ,2 ,3 ,4 ,5 ,6 ,7};
		// �ε����� 0���� �����Ѵ�.
		array[0] = 1;
		array[1] = 2;
		
		//�Ϲ����� for��
		//	���۰� ; ���ᰪ ; ������
		for (int i = 0; i<array.length ; i++) {
			System.out.println(array[i]);
		}
		
		//���� for��
		for(int item : array) {
			System.out.println(item);
		}
		/*
		 1
		 2
		 3
		 4
		 5
		 6
		 7
		 */
	}
	
	// for while 
	public void checkWhile() {
		int array[] = {1 ,2 ,3 ,4 ,5 ,6 ,7};
		// �ݺ��� ������ if��
		int count = 0; // ���۰�
		while (count < array.length) { // ���ᰪ
			System.out.println(array[count]);
			count = count + 1; // ������
		}
	}
	public void checkDoWhile() {
		int array[] = {};
		int count = 0;
		// while ���� ���ǿ� ������� do ���� �ѹ��� �� ����ȴ�
			do {
				System.out.println(array[count]);
				count = count + 1; // ������
			} 
			while (count < array.length);
	}
}
