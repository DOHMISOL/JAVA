import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		SaveBox s1 = new SaveBox();
		SaveBox s2 = new SaveBox();
		SaveBox s3 = new SaveBox();
		
		s1.setName("리사심슨");
		s2.setName("호머심슨");
		s3.setName("바트심슨");
		
		Scanner scanner = new Scanner(System.in);
		for(int i =0; i<99999999;i++) {
		
		System.out.println("원하시는 메뉴를 선택해주세요.");
		System.out.println("1. 1번 저금통 입금");
		System.out.println("2. 2번 저금통 입금");
		System.out.println("3. 3번 저금통 입금");
		System.out.println("4. 1번 저금통 출금");
		System.out.println("5. 2번 저금통 출금");
		System.out.println("6. 3번 저금통 출금");
		System.out.println("q. 종료");
		
		String inputMenu = scanner.nextLine();
		
		if(inputMenu.equals("q")) {
			break;
		}else if(inputMenu.equals("1")) {
			s1.deposit();
		}else if(inputMenu.equals("2")) {
			s2.deposit();
		}else if(inputMenu.equals("3")) {
			s3.deposit();
		}else if(inputMenu.equals("4")) {
			s1.withdraw();
		}else if(inputMenu.equals("5")) {
			s2.withdraw();
		}else if(inputMenu.equals("6")) {
			s3.withdraw();
		}else {
			System.out.println("입력이 잘못되었습니다.");
		}
	}
	}
}