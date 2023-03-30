import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {
	//국어 점수 입력을 받아서 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60이상이면 D, 그 아래면 F를 출력하세요.
	
		Scanner s = new Scanner(System.in);
		int Score = s.nextInt();
		System.out.println("국어점수를 입력해주세요.");
		
		if(Score < 0 || Score >100) {
			System.out.println("0~100까지의 숫자를 입력해주세요.");
			return;
		}	
			
		if(Score >= 90) {
			System.out.println("Grade A");
		}else if(Score >=80){
			System.out.println("Grade B");
		}else if(Score >=70) {
			System.out.println("Grade C");
		}else if(Score >=60) {
			System.out.println("Grade D");
		}else {
			System.out.println("Grade F");
		}
	}	
}

