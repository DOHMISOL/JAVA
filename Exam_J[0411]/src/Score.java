import java.util.Scanner;

public class Score {
	
//	String name;
//	int midkor;
//	int mideng;
//	int midmath;
//	int finalkor;
//	int finaleng;
//	int finalmath;
//	Scanner scanner = new Scanner(System.in);
//	
//	public void middleScore() {
//		System.out.println("국어 점수를 입력해주세요.");
//		String inputString1 = scanner.nextLine();
//		int midKorNum = Integer.parseInt(inputString1);
//		this.midkor = this.midkor + midKorNum;
//		System.out.println(this.name + "님의 중간고사국어점수는 " + this.midkor + "입니다.");
//		
//		System.out.println("수학 점수를 입력해주세요.");
//		String inputString2 = scanner.nextLine();
//		int midmathNum = Integer.parseInt(inputString2);
//		this.midmath = this.midmath + midmathNum;
//		System.out.println(this.name + "님의 중간고사수학점수는 " + this.midmath + "입니다.");
//
//		System.out.println("영어 점수를 입력해주세요.");
//		String inputString3 = scanner.nextLine();
//		int midengNum = Integer.parseInt(inputString3);
//		this.mideng = this.mideng + midengNum;
//		System.out.println(this.name + "님의 중간고사영어점수는 " + this.mideng + "입니다.");
//	}
//	
//	public void finalScore() {
//		System.out.println("국어 점수를 입력해주세요.");
//		String inputString1 = scanner.nextLine();
//		int finalKorNum = Integer.parseInt(inputString1);
//		this.finalkor = this.finalkor + finalKorNum;
//		System.out.println(this.name + "님의 기말고사국어점수는 " + this.finalkor + "입니다.");
//		
//		System.out.println("수학 점수를 입력해주세요.");
//		String inputString2 = scanner.nextLine();
//		int finalmathNum = Integer.parseInt(inputString2);
//		this.finalmath = this.finalmath + finalmathNum;
//		System.out.println(this.name + "님의 기말고사수학점수는 " + this.finalmath + "입니다.");
//
//		System.out.println("영어 점수를 입력해주세요.");
//		String inputString3 = scanner.nextLine();
//		int finalengNum = Integer.parseInt(inputString3);
//		this.finaleng = this.finaleng + finalengNum;
//		System.out.println(this.name + "님의 기말고사영어점수는 " + this.finaleng + "입니다.");
//		
//		}
	
	public void middleScoreSumAvg() {
		for(int i=0; i<Student.length;i++) {
			this.midkor = this.midkor + StudentCount[i];
			this.mideng = this.mideng + StudentCount[i];
			this.midmath = this.midmath + StudentCount[i];
		}
		System.out.println(class + "반의 국어 총점은 " + this.midkor  + "입니다.");
		System.out.println(class + "반의 영어 총점은 "  + this.mideng  + "입니다.");
		System.out.println(class + "반의 수학 총점은 "  + this.midmath  + "입니다.");
		
		System.out.println(class + "반의 국어 총점은 " + this.midkor/StudentCount.length  + "입니다.");
		System.out.println(class + "반의 영어 총점은 " + this.mideng/StudentCount.length  + "입니다.");
		System.out.println(class + "반의 수학 총점은 " + this.midmath/StudentCount.length  + "입니다.");
	}
	
	public void finalScoreSumAvg() {
		for(int i=0; i<Student.length;i++) {
			this.finalkor = this.finalkor + StudentCount[i];
			this.finaleng = this.finaleng + StudentCount[i];
			this.finalmath = this.finalmath + StudentCount[i];
		}
		System.out.println(class + "반의 국어 총점은 " + this.finalkor  + "입니다.");
		System.out.println(class + "반의 영어 총점은 "  + this.finaleng  + "입니다.");
		System.out.println(class + "반의 수학 총점은 "  + this.finalmath  + "입니다.");
		
		System.out.println(class + "반의 국어 총점은 " + this.finalkor/StudentCount.length  + "입니다.");
		System.out.println(class + "반의 영어 총점은 " + this.finaleng/StudentCount.length  + "입니다.");
		System.out.println(class + "반의 수학 총점은 " + this.finalmath/StudentCount.length  + "입니다.");
	}
	
	
}
