import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int number1 = s1.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int number2 = s1.nextInt();
		
		int sumnumber = number1 + number2;
		
        System.out.println("두 숫자의 합은 " + sumnumber + "입니다.");

	}
}