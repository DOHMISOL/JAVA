import java.util.Scanner;

public class Test {
	
	String catagory;
	int korScore;
	int engScroe;
	int mathScore;
	
	public void setCategory(String test) {
		this.catagory = test;
	}
	
	public void inputScore(String className, String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("학생의" + this.catagory + "점수를 입력해주세요.");
		System.out.println("국어 점수 : ");
		this.korScore = scanner.nextInt();
		System.out.println("영어 점수 :");
		this.engScroe = scanner.nextInt();
		System.out.println("수학 점수 :");
	}
}
