import java.util.Random;
import java.util.Scanner;

public class Game{
	public static void main(String[] args) {
//		1. 가위바위보 게임을 만드세요. 사용자로부터 가위바위보 입력을 받음. 컴퓨터도 가위바위보를 발생함. 가위바위보 입력은 숫자로 함.(가위 : 0, 바위 : 1, 보:2)
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int Total = 0;  //게임 플레이 수
		int Pcnt = 0;   //플레이어 승리
		int Ccnt = 0;   //컴퓨터 승리
		
		for(int i = 0; i<999999999; i++) {
			System.out.println("##가위바위보 게임##");
			System.out.println("가위 : 0, 바위 : 1, 보:2");
			System.out.println("숫자를 입력하세요 : ");
			System.out.println("종료시 \"q\"");
			
			String user =s.nextLine(); 
			if(user.equals("q")) {
				System.out.println("종료되었습니다.");
				System.out.println("총 플레이 수 : "+ Total + "승리 : " + Pcnt + "패배 : "+ Ccnt);
				break;
			}
			
			int com = r.nextInt(3);  
			if(user.equals("0")){   
				if(com == 1) {
					System.out.println("패배");
					Ccnt++;
				}else if(com == 2) {
					System.out.println("승리");
					Pcnt++;
				}else {
					System.out.println("무승부");
					Pcnt++;
					Ccnt++;
				}
			}else if(user.equals("1")){
				if(com == 0) {
					System.out.println("승리");	
					Pcnt++;
				}else if(com == 2) {
					System.out.println("패배");
					Ccnt++;
				}else {
					System.out.println("무승부");
					Pcnt++;
					Ccnt++;
				}
			}else if(user.equals("2")){
				if(com == 0) {
					System.out.println("패배");
					Ccnt++;
				}else if(com == 1) {
					System.out.println("승리");
					Pcnt++;
				}else {
					System.out.println("무승부");
					Pcnt++;
					Ccnt++;
				}
			}else{
				System.out.println("다시 입력해주세요.");				
			}
		}	
	}
}



