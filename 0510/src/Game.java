import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int play = (int)(Math.random()*3+1);
		System.out.println("가위 바위 보!");
		String game = sc.next();
		sc.close();
		
		if(play == 1) {
			System.out.println("가위");
			if(game.equals("가위")) {
				System.out.println("비겼다");
			}
			else if(game.equals("바위")) {
				System.out.println("이겼다");
			}
			else if(game.equals("보")) {
				System.out.println("졌다");
			}
		}
		else if(play == 2) {
			System.out.println("바위");
			if(game.equals("가위")) {
				System.out.println("졌다");	
			}
			else if(game.equals("바위")) {
				System.out.println("비겼다");
			}
			else if(game.equals("보")) {
				System.out.println("이겼다");	
			}
		}
		else if(play == 3) {
			System.out.println("보");
			if(game.equals("가위")) {
				System.out.println("이겼다");		
			}
			else if(game.equals("바위")) {
				System.out.println("졌다");
			}
			else if(game.equals("보")) {
				System.out.println("비겼다");
			}
		}
	}

}
