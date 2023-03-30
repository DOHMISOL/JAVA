import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int n1 = s.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		double n2 = s.nextDouble();
		
		double sum = n1 + n2;
		
		System.out.println("두자리 숫자의 합은 " + sum + "입니다.");
	}
}
