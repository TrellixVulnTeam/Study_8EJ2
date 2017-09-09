package memo2;

import java.util.Scanner;

public class View {
	
	Scanner scanner = new Scanner(System.in);

	//�Է�â
	public void intro() {
		println("------------��ɾ �Է��ϼ���------------");
        println("c : ����, r : �б�, u : ����, d : ����, l : ���");
        println("exit : ����");
        println("-------------------------------------");
        print("����>");
	}
	
	// �߰�
	public Memo create() {
		// �ϳ��� �޸� ��ü ����
		Memo memo = new Memo();
		print("������ �Է��ϼ���>");
		memo.title = scanner.nextLine();
		print("������ �Է��ϼ���>");
		memo.content = scanner.nextLine();
		return memo;
	}

	// �޸� �ϳ� �� ���
	public int readMemo() {
		print("�ε����� �Է��ϼ���>");
		int index = Integer.parseInt(scanner.nextLine());
		return index;
	}
	
	public void showMemo(Memo memo) {
		print("No : " + memo.no);
		print("|Title : " + memo.title);
		print("|Content : " + memo.content);
		println("|Date : " + memo.date);
	}
	
	public int updateMemo() {
		Memo memo = new Memo();
		print ("�ε����� �Է��ϼ���>");
		memo.no = Integer.parseInt(scanner.nextLine());
		print("Title : ");
		memo.title = scanner.nextLine();
		print("Content : ");		
		memo.content = scanner.nextLine();
		return memo;
	}
	
	public int deleteMemo() {
		
	}
	
	public void println(String str) {
		System.out.println(str);
	}
	
	public void print(String str) {
		System.out.print(str);
	}
}
