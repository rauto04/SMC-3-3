import java.util.Scanner;

public class Number {
	static int ox;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
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
				System.out.println("당첨! 일치하는 숫자가 있습니다."); 
			    ox = 1;
				break;
			} 
		}
		if(ox != 1)
			System.out.println("꽝! 다음기회에~");
	}

}
