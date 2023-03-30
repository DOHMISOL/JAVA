import java.util.Scanner;

public class Scanner_H {
	public static void main(String[] args) {
		
		System.out.println("화면에 숫자를 입력해주세요!");
		
		Scanner s = new Scanner(System.in);
		
		int number1 = s.nextInt();
		
		System.out.println("입력받은 숫자는 " + number1 + "입니다.");
		
	}
}