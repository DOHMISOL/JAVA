import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		
		//사용자로부터 숫자를 2개 입력받아서 합을 출력하세요.
		
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int n1 = s2.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int n2 = s2.nextInt();
		
		int sum = n1 + n2;
		System.out.println("두자리 숫자의 합은" + sum + "입니다.");
	}
}
