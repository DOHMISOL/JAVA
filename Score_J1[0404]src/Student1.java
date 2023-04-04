import java.util.Scanner;

public class Student1 {
	String name;
	int kor;
	int eng;
	int math;
	
	public void inputData() {
		this.inputName();
		this.inputKor();
		this.inputEng();
		this.inputMath();
	}
	
	public void inputName() {
		System.out.println("이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();
	}
	
	public void inputKor() {
		System.out.println("국어점수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.kor = Integer.parseInt(inputString);
	}
	
	public void inputEng() {
		System.out.println("영어점수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.eng = Integer.parseInt(inputString);
	}
	
	public void inputMath() {
		System.out.println("수학점수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.math = Integer.parseInt(inputString);
	}
	
	
	
	
	
	
	
	
	
}
