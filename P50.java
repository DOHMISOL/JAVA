import java.util.Scanner;

public class P50 {
	public static void main(String[] args) {
		//사용자로부터 숫자를 입력받아서 해당 숫자가 짝수인지 홀수인지 출력하시오. 단 한버만 이루어지는게 아니라 종료(q)입력을 할때까지 실행하도록 만드세요.(답안)
		Scanner s = new Scanner(System.in);
		for(int i= 0; i<9999; i++) {
			System.out.println("숫자를 입력해주세요.(종료 시 q 입력)");
			String inputString = s.nextLine();
			if(inputString.equals("q")) {
				System.out.println("종료되었습니다.");
				break;//for 문이 종료
			}
			
			int inputNumber = Integer.parseInt(inputString);
			if(inputNumber % 2 == 0 ) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}
	}
}
