package oop06.inter03;

public abstract class RemoteTV implements IRemoteControl {
	int channel = 0;		//ä��
	boolean power = false;  //����
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("RemoteTV ������ �մϴ�.");
		
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("RemoteTV ������ ���ϴ�.");
		
	}

	@Override
	public void channelUp() {
		channel++;
		System.out.println("TV ä���� �ø��ϴ�. ���� ä�� : " + channel + "��");
		
	}
}
