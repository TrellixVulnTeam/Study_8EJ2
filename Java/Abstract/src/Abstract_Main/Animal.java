package Abstract_Main;

interface Building {
	public String getName();
}

//��� ��ȭ�� ���� �Ͼ�� ���� �߻� Ŭ������ ����
//��ɺ�ȭ�� ���� ���� �������̽��� ����
abstract interface Base {
	abstract void create();
	abstract void read();
	abstract void update();	
	abstract void delete();	
	abstract void showList();
}

abstract class Memo implements Base {
	public void deleteList() {
		delete();
		showList();
	}
	
	@Override	// annotation - �̳����̼� (�ΰ����� ����� �߰� Ȥ�� �ܼ����� ����)
	public void create() {
		System.out.println("called create!");
	}
	@Override
	public void read() {
		System.out.println("called read!");
	}
	@Override
	public void update() {
		System.out.println("called update!");
	}
	@Override
	public void delete() {
		System.out.println("called delete!");
	}
	@Override
	public void showList() {
		System.out.println("called showlist!");
	}
}

//����ü
class MemoIpml extends Memo {
	@Override
	public void read() {
		update();
	}
}

public class Animal {
	public static void main(String args[]) {
		MemoImpl memo = new MemoImpl();
		memo.read();
	}

	public String type() {
		// TODO Auto-generated method stub
		return null;
	}
}