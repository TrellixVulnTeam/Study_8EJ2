package oop05.abstract02;

public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void internetSearch() {
		System.out.println(owner + "�� ������ ���ͳ� �˻��� �����մϴ�.");
	}

	
}
