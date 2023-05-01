import java.util.Scanner;

public class Q1_maxmin {
	public static void main(String[] args) {
		//잔돈문제
		
		int answer = 0 ;
		System.out.println("금액을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		  if(input % 500==0) {
	          answer = answer + input/500;
	          
	       }else if((input % 500) % 100==0) {
	          answer = answer + (input % 500)/100;
	          
	       }else if(((input % 500) % 100) % 50==0) {
	          answer = answer + ((input % 500) % 100)/50;
	          
	       }else if((((input % 500) % 100) % 50) % 10==0) {
	          answer = answer + (((input % 500) % 100) % 50)/10;
	          
	       }else if(((((input % 500) % 100) % 50) % 10) % 5==0) {
	          answer = answer + ((((input % 500) % 100) % 50) % 10)/5;
	          
	       }else if((((((input % 500) % 100) % 50) % 10) % 5) % 1==0) {
	          answer = answer + (((((input % 500) % 100) % 50) % 10) % 5)/1;
	       }

		  System.out.println(answer);
	}
}
