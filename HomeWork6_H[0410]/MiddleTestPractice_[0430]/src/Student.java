import java.util.Scanner;

public class Student {
	String name;
	String sex;
	String address;

	Student(String name){
		this.name = name;
	}
	
	Student(String name, String sex, String address){
		this.name = name;
		this.sex = sex;
		this.address = address;
	}
	
	
	Test [] test = { new Test("중간고사"), new Test("기말고사")};
	
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력을 원하는 시험을 선택해주세요.1.중간 2.기말");
		String selectTest = scanner.nextLine();
		int selectNumber = Integer.parseInt(selectTest);
		this.test[selectNumber].inputScore();
	}
}
