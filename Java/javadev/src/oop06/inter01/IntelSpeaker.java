package oop06.inter01;

public class IntelSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("IntelSpeaker : ������ Ű��ϴ�.");
		
	}

	@Override
	public void soundDown() {
		System.out.println("IntelSpeaker : ������ ���Դϴ�.");
		
	}

}
