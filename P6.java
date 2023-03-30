import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int n1 = s.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int n2 = s.nextInt();
		
		int sum = n1 + n2;
		System.out.println("입력하신 숫자의 합은 " + sum + "입니다.");
	}
}
