package oop06.inter02;

public interface BodySign {
	public static final int CENTER = 1;   //��Ӱ��� �˼� �ְ� �빮�ڷ� ǥ��
	public static final int LEFT = 2;
	public static final int RIGHT = 3;
	public static final int DOWN = 4;
	public static final int UP = 5;
	
	public abstract void throwBall(int how);
	
	
}
