package basic;

public class ArrayTest02 {
	public static void main(String[] args) {
		int[][] score = {	//score.length = 3 (1���� �迭�� ����)
				{100,90,80,70},
				{ 90,80,70,60},
				{ 80,70,60,50}
		};
		
		System.out.println("\t\t[����ǥ]");
		System.out.println("============================================");
		System.out.println("����\t����\t����\tö��\t����\t���");

		for (int row = 0; row < score.length; row++) {
			int total = 0;
			for (int col = 0; col < score[row].length; col++) {
				System.out.print(score[row][col] + "\t"); // \t �� tap�� ���ڷ� '����'�� �ǹ�
				total += score[row][col];
			}
			System.out.println(total + "\t" + (total / score[row].length));
		}
		
	}
}
