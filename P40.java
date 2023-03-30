import java.util.Scanner;

public class P40 {
	public static void main(String[] args) {
//		[문제]다음 중 원하는 메뉴를 선택하세요.
//		 	1 : Hello 출력
//			q : 종료
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<9999999; i++) {  //무한루프
			System.out.println("다음 중 원하는 메뉴를 선택하세요.");
			System.out.println(" 1 : Hello 출력");
			System.out.println("q : 종료");
			
			String inputMenu = s.nextLine(); // 문자열 입력을 받을 때는 nextLine을 사용
			//만약 입력받은 문자열을 숫자로 변경하고 싶은 경우 아래 부분 사용
			//int number = Integer.parseInt(inputMenu);
			if(inputMenu.equals("1")) { // 문자열 비교는 == 대신 .equals를 사용
				System.out.println("Hello");
			}else if(inputMenu.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			}else{
				System.out.println("입력값이 잘못 되었습니다. 다시 입력해주세요.");
			}

		}
//		[문제]다음 중 원하는 메뉴를 선택하세요.
//	 	1 : Hello 출력
//		q : 종료
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("다음 중 원하는 메뉴를 선택하세요.");
//		System.out.println("1 : Hello 출력");
//		System.out.println("q : 종료");
//		
//		String inputStr = s.nextLine();
//		
//		if(inputStr.equals("q")) {
//			System.out.println("종료되었습니다.");
//					
//		} else if(inputStr.equals ("1")) {
//			System.out.println("Hello");
//		}else {
//			System.out.println("입력값이 잘못되었습니다. 다시 입력해주세요.");
//		}
	}
}


	