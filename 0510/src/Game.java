import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int play = (int)(Math.random()*3+1);
		System.out.println("���� ���� ��!");
		String game = sc.next();
		sc.close();
		
		if(play == 1) {
			System.out.println("����");
			if(game.equals("����")) {
				System.out.println("����");
			}
			else if(game.equals("����")) {
				System.out.println("�̰��");
			}
			else if(game.equals("��")) {
				System.out.println("����");
			}
		}
		else if(play == 2) {
			System.out.println("����");
			if(game.equals("����")) {
				System.out.println("����");	
			}
			else if(game.equals("����")) {
				System.out.println("����");
			}
			else if(game.equals("��")) {
				System.out.println("�̰��");	
			}
		}
		else if(play == 3) {
			System.out.println("��");
			if(game.equals("����")) {
				System.out.println("�̰��");		
			}
			else if(game.equals("����")) {
				System.out.println("����");
			}
			else if(game.equals("��")) {
				System.out.println("����");
			}
		}
	}

}
