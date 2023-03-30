import java.util.Random;
import java.util.Scanner;

public class MainClass_if {
	public static void main(String[] args) {
		//임의의 값을 발생하여 홀수 짝수를 판단하는 프로그램 만들기 - 나머지값을 출력하여 홀수인지 짝수인지 판단
		Random r = new Random();
		int randomValue = r.nextInt(100);
		System.out.println("랜덤숫자는 " + randomValue);
		
		if( randomValue % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		int a = 100;
		
		if(a < 10) {
			System.out.println("111");
		}else if(a < 20) {
			System.out.println("2222");
		}else if(a < 30) {
			System.out.println("3333");
		}else {
			System.out.println("4444");
		}
		
		//국어 점수 입력을 받아서 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60이상이면 D, 그 아래면 F를 출력하세요.
		
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt()+1;
		System.out.println("국어점수를 입력해주세요.");
		System.out.println(i);
		if(i >= 90){
			System.out.println("A");
		}else if(i >= 80){
			System.out.println("B");
		}else if(i >= 70) {
			System.out.println("C");
		}else if(i >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
