import java.util.Scanner;

public class Student {
	String name;  //반 이름
	String sex;
	String address;
	Test [] test = {new Test("중간고사"), new Test("기말고사")};
	
	
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, String sex, String address){
		this.name = name;
		this.sex = sex;
		this.address = address;
	}
	
	public String toString() {
		return this.name + "(" + this.sex + ", " + this.address + ")";
	}
	
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < this.test.length;i++) {
			System.out.println("" + i + " : " + this.test[i].name);
		}
		System.out.println("입력을 원하는 시험을 선택해주세요.");
		String selectTest = scanner.nextLine();
		int selectTestNumber = Integer.parseInt(selectTest);
		this.test[selectTestNumber].inputScore();
	}
//		
//		
//		String selectMenu = scanner.nextLine();
//		Scanner scanner = new Scanner(System.in);
//		if(selectMenu.equals("1")) {
//			System.out.println("국어점수 : ");
//			String inputScore = scanner.nextLine();
//			int kor = Integer.parseInt(inputScore);
//			System.out.println("영어점수 : ");
//			int eng = Integer.parseInt(inputScore);
//			System.out.println("수학점수 : ");
//			int math = Integer.parseInt(inputScore);
//			this.test[0] = new Test("중간고사", kor, eng, math);
//		}else if(selectMenu.equals("2")) {
//			System.out.println("국어점수 : ");
//			String inputScore = scanner.nextLine();
//			int kor = Integer.parseInt(inputScore);
//			System.out.println("영어점수 : ");
//			int eng = Integer.parseInt(inputScore);
//			System.out.println("수학점수 : ");
//			int math = Integer.parseInt(inputScore);
//			this.test[1] = new Test("기말고사", kor, eng, math);
//		}else {
//			System.out.println("입력이 잘못 되었습니다.");
//			this.showMenu();
//		}
//	}
}
