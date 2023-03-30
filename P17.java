import java.util.Scanner;

public class P17 {
	public static void main(String[] args) {
//		1. 10명의 점수를 입력받아서 
//		2. 각 학생의 점수를 출력(arrays.toString말고 for문으로 접근해서 출력)
//		3. 가장 높은 점수를 가진 학생이 몇번째 인지 출력

		
		int[] score = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			System.out.println(i + "번째 학생 점수 입력");
			String inputNumber = scanner.nextLine();
			score[i] = Integer.parseInt(inputNumber);
		}
		
		for(int i = 0; i<10; i++) {		
			System.out.println(i+ "번째 학생 점수 : " + score[i]);
		}
		
		int highScore = 0;
		int highScoreIndex = -1;
		for(int i = 0; i<10; i++) {
			if(score[i] > highScore) {
				highScore = score[i];
				highScoreIndex = i;
			}
		}
		System.out.println(highScoreIndex + "번째 학생이 제일 점수가 높습니다.");
	}
}
