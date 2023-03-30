import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		
		Random r = new Random();

		int number = r.nextInt(100)+1;//0~99
		System.out.println("랜덤숫자 : " + number);
		
		System.out.println("나머지 값 : " + (number%2));
		
		
		/*
		int number2 = r.nextInt(26)+65;//아스키문자 65번~
		System.out.println(number2);
		char c = (char)number2;
		System.out.println(c);
		*/
	}
}
