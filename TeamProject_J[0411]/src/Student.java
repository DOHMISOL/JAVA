import java.util.Scanner;

public class Student {
	
	int studentNum;
	String name;
	String address;
	String sex;
	
	Test[] test = new Test[2];
	//Test middleTest;
	//Test finalTest;
	
	public void setNum(int num) {
		// 1번학생, 2번학생
		this.studentNum = num;
	}
	
	public void inputData(String className) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.studentNum + "번째 학생의 정보를 입력해주세요.");
		System.out.println("이름 : ");
		this.name = scanner.nextLine();
		System.out.println("주소 : ");
		this.address = scanner.nextLine();
		System.out.println("성별 : ");
		this.sex = scanner.nextLine();
		test[0] = new Test();
		test[0].setCategory("중간고사");
		test[0].inputScore(className, name);
		test[1] = new Test();
		test[1].setCategory("기말고사");
		test[1].inputScore(className, name);
	}
	
	// 전체정보 출력
		public void printInfo(String className) {
			System.out.println(className + " " + this.studentNum + ". 이름 : " + 
								this.name + "주소 : " + this.address + "성별 : "
								+ this.address);
		}
	
}
