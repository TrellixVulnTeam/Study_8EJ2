package oop10.thread;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("����ȯ : ������̿� �����϶�!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
