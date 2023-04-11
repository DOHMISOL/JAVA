import java.util.Scanner;

public class Test {
	String category; //중간, 기말
	int korScore;
	int mathScore;
	int engScore;
	int total; 
	Scanner scanner = new Scanner(System.in);
	
	//중간,기말 구분 입력
	public void category(String category) {
		this.category = category;
	}
	
	//성적입력
		public void doTest() {
			
			System.out.println("국어점수 : ");
			korScore = scanner.nextInt();
			System.out.println("수학점수 : ");
			mathScore = scanner.nextInt();
			System.out.println("영어점수 : ");
			engScore= scanner.nextInt();
			
		}
		
		public int total() {
			total = korScore + mathScore + engScore;
			//System.out.println("총점 : " + total);
			return total;
		}
}
