import java.util.Scanner;

public class Student {
	String name; // 학생 이름
	String address; //주소
	String sex;
	Scanner scanner = new Scanner(System.in);
	
	//학생 정보 입력
	public void doStudent() {
		System.out.println("이름 : ");
		this.name = scanner.nextLine();
		System.out.println("주소 : ");
		this.address = scanner.nextLine();
		System.out.println("성별 : ");
		this.sex = scanner.nextLine();
		Test test = new Test();
		test.doTest();
	};
}
