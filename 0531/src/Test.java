import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String sign = sc.next();
		sc.close();
		
		if(sign.equals("+")) 
			System.out.println(num1 + num2);
		else if(sign.equals("-")) 
			System.out.println(num1 - num2);
		else if(sign.equals("*")) 
			System.out.println(num1 * num2);
		else if(sign.equals("/")) 
			System.out.println(num1 / num2);
		
	}

}
