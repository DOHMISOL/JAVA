import java.util.Scanner;

public class P0315 {
	public static void main(String[] args) {
//		[문제]다음 중 원하는 메뉴를 선택하세요.
//	 	1 : Hello 출력
//		q : 종료
		
		Scanner s = new Scanner(System.in);
		System.out.println("다음 중 원하는 메뉴를 선택하세요.");
		System.out.println("1 : Hello 출력");
		System.out.println("q : 종료");
		
		String inputStr = s.nextLine();
		
		if(inputStr.equals("q")) {
			System.out.println("종료되었습니다.");
					
		} else if(inputStr.equals ("1")) {
			System.out.println("Hello");
		}else {
			System.out.println("입력값이 잘못되었습니다. 다시 입력해주세요.");
		}
	}
}
