package oop06.inter01;

public class SonyTV implements TV{   //�������̽��� �����Ѵ�.
	
	private Speaker speaker = new IntelSpeaker();
	
	public void turnOn() {
		System.out.println("SonyTV : ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("SonyTV : ������ ���ϴ�.");
	}
	
	public void channelUp() {
		System.out.println("SonyTV : ä���� �ø��ϴ�.");
	}
	
	public void channelDown() {
		System.out.println("SonyTV : ä���� �����ϴ�.");
	}
	
	public void soundUp() {
		//System.out.println("SonyTV : �Ҹ��� Ű��ϴ�.");
		speaker.soundUp();
	}
	
	public void soundDown() {
		//System.out.println("SonyTV : �Ҹ��� ���Դϴ�.");
		speaker.soundDown();
	}
}
