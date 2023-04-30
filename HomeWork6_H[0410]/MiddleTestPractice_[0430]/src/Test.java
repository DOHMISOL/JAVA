import java.util.Scanner;

public class Test {
	int kor = 0;
	int eng = 0;
	int math = 0;
	int total = 0;
	String name;
	
	Test(String name){
		this.name = name;
	}
	
	public void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수 : ");
		this.kor = scanner.nextInt();
		System.out.println("수학점수 : ");
		this.math = scanner.nextInt();
		System.out.println("영어점수 : ");
		this.eng = scanner.nextInt();
		this.total = this.kor + this.math + this.eng;
		System.out.println(this.name + "의 성적 총합은 " + this.total + "입니다.");
	}
}
