import java.util.Arrays;
import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		//학생 10명의 성적을 입력
		
//		int s1 = scanner.nextint();
//		int s2 = scanner.nextint();
//		int s3 = scanner.nextint();
//		int s4 = scanner.nextint();
//		int s5 = scanner.nextint();
//		int s6 = scanner.nextint();
//		int s7 = scanner.nextint();
//		int s8 = scanner.nextint();
//		int s9 = scanner.nextint();
//		int s10 = scanner.nextint();  //각각의 성적에 변수를 선언하여 값을 넣는다.
//		
//		int total = s1 + s2 + s3 + s10;
		
		int[] score =new int[10];  
//		score[0] = scanner.nextInt();
//		score[1] = scanner.nextInt();  //배열은 한번에 여러개의 변수를 선언할 수 있고, 각 배열은 꺽새가 들어가고, 각변수는 score를 
//		score[2] = scanner.nextInt();
// ....	
//		score[9] = scanner.nextInt();
		Scanner scanner = new Scanner(System.in);
		for(int i =0; i<10; i++) {
			System.out.println((i+1) + "번째 학생의 점수를 입력해주세요.");
			score[i] = scanner.nextInt();
		}
		System.out.println("입력된 점수 확인");
		System.out.println(Arrays.toString(score));
		System.out.println("2번째 학생 점수 : " + score[1]);
		int totalScore = 0;
		for(int i=0; i<10; i++) {
			totalScore = totalScore + score[i];
		}
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + (totalScore/ (double)10));
	}
}
