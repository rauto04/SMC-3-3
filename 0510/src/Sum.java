import java.util.Scanner;

public class Sum {
	static int sum = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		int a = sc.nextInt();
		System.out.print("������ ����: ");
		int b = sc.nextInt();
		sc.close();
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(a + "���� " + b + "������ ���� " + sum);
	}

}
