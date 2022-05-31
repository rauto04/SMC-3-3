import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		
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
