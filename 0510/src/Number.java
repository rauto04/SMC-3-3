import java.util.Scanner;

public class Number {
	static int ox;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
		int num = sc.nextInt();
		sc.close();
		
		int []arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*50+1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(arr[i] == num) {
				System.out.println("��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�."); 
			    ox = 1;
				break;
			} 
		}
		if(ox != 1)
			System.out.println("��! ������ȸ��~");
	}

}
