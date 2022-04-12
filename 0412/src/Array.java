import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int max = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println(i+1 + "번 입력 : ");
			arr[i] = sc.nextInt();
			if(max < arr[i]) { 
				max = arr[i];
				count = i+1;
			}
		}
		
		System.out.println("가장 큰 수는 " + count + "번째 숫자인" + max);
	}

}
