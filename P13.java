import java.util.Random;
import java.util.Scanner;

public class P13 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		for(int i=0; i<99999;i++) {
			System.out.println((i+1)+"번째 게임");
			System.out.println("게임을 진행하실려면 엔터, 종료하실려면 q를 입력해주세요.");
			System.out.println("화면에 주사위를 굴릴까요?");
//			scanner.nextLine(); //입력받을필요 없으니까 Scanner s 생략
			String userInput = scanner.nextLine();
			if(userInput.equals("q")) {
				break;
			}
			
			int userDice = random.nextInt(6) + 1;
			System.out.println("사용자 주사위 : " + userDice);
			
			System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
			scanner.nextLine(); //입력받을필요 없으니까 'String s ='생략
			int comDice = random.nextInt(6)+1;
			System.out.println("사용자 주사위 : " + comDice);
			
			if(userDice == comDice ) {
				System.out.println("You Win");
			}else if(userDice < comDice) {
				System.out.println("You lose");
			}else {
				System.out.println("You Draw");
			}
		}
	}
}	



