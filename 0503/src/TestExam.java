import java.util.Scanner;

public class TestExam {
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=num; i++) {
			if(i % 21 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("1~" + num + "���� 3�� ����̸鼭 7�� ����� ���� ���� " + sum + "�Դϴ�.");
	}

}
