import java.util.Scanner;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	Scanner scanner = new Scanner(System.in);
	int [] StudentCount = new int[30];
	
	//수학입력
	public void math() {
		System.out.println("수학 점수를 입력해주세요.");
		String inputString = scanner.nextLine();
		int inputNum = Integer.parseInt(inputString);
		this.math = this.math + inputNum;
		System.out.println(this.name + "님의 수학점수는 " + this.math + "입니다.");
	}
	
	//영어입력
	public void english() {
		System.out.println("영어 점수를 입력해주세요.");
		String inputString = scanner.nextLine();
		int inputNum = Integer.parseInt(inputString);
		this.eng = this.eng + inputNum;
		System.out.println(this.name + "님의 영어점수는 " + this.eng + "입니다.");
	}
	
	//국어입력
	public void korean() {
		System.out.println("국어 점수를 입력해주세요.");
		String inputString = scanner.nextLine();
		int inputNum = Integer.parseInt(inputString);
		this.kor = this.kor + inputNum;
		System.out.println(this.name + "님의 국어점수는 " + this.kor + "입니다.");
	
		}
	// 성적총합 및 평균 구하기
	public void sum() {
		for(int i=0; i<StudentCount.length;i++) {
			this.math = this.math + StudentCount[i];
			this.eng = this.eng + StudentCount[i];
			this.kor = this.kor + StudentCount[i];
		}
		System.out.println("수학 총점은 " + this.math  + "입니다.");
		System.out.println("영어 총점은 " + this.eng  + "입니다.");
		System.out.println("국어 총점은 " + this.kor  + "입니다.");
		
		System.out.println("수학 평균은 " + this.math/StudentCount.length  + "입니다.");
		System.out.println("영어 평균은 " + this.eng/StudentCount.length  + "입니다.");
		System.out.println("국어 평균은 " + this.kor/StudentCount.length  + "입니다.");
	}
}
