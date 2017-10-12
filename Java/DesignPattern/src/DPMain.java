import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Observer Pattern�� ���ؼ�
 * 
 * Subject <- Observer
 * 
 */
public class DPMain {

	public static void main(String[] args) {
		Subject server = new Subject();
		server.start();
		
		ClientDeamon deamon = new ClientDeamon(server);
		deamon.start();
	}
}

class Client1 implements Subject.IObserver {
	
	@Override
	public void noti() {
		System.out.println("Ŭ���̾�Ʈ 1�� ��������� �ݿ���");
	}
}


class Client2 implements Subject.IObserver {
	String title = "";
	public Client2(String title) {
		this.title = title;
	}
	@Override
	public void noti() {
		System.out.println("Ŭ���̾�Ʈ 2�� ��������� �ݿ���");
	}
}

class Subject extends Thread {
	List<IObserver> clients = new ArrayList<>();
	public void run() {
		Random random = new Random();
		while(true) {
			for(IObserver observer : clients) {
				observer.noti();
			}
			System.out.println("[Subject] �޼����� �����Ͽ����ϴ�.");
			
			
			// ���ֱ��� ������ ���� �׽�Ʈ �ڵ�
			try {
				Thread.sleep((random.nextInt(10)+1)*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public interface IObserver {
		public void noti();
	}
}

/**
* Ŭ���̾�Ʈ ����� ���� ���� Ŭ����
*/

class ClientDeamon {
	Subject server;
	Public ClientDeamon(Subject server) {
		this.server = server;
	}
	public void start () {
		while(true) {
			if(count%2 ==0) {
				server.clients.add(new Client1());
			} else {
				server.clients.add(new Client2());
			}
		}
	}
}