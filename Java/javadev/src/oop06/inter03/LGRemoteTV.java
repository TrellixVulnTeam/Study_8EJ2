package oop06.inter03;

public class LGRemoteTV extends RemoteTV {

	@Override
	public void channelDown() {
		channel--;
		System.out.println("TV ä���� �����ϴ�. ���� ä�� : " + channel + "��");
	}
}