package design;

// �������̽��� �����ϴ� ���
// ���������� + interface + �̸�
public interface IChange {
	public void clac(int pay, int buy);
	public void move();
	// 
}

interface IChangeMove {
	public void move();
}

// ���� �ٸ� �����̶�� �����ϰ�~

// �������̽��� �����ϱ�
// class + Ŭ�����̸� + implements + �������̽� �̸�
class Change implements IChange, IChangeMove {

	@Override
	public void clac(int pay, int buy) {
		// �������� �ڵ带 �ۼ�
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}