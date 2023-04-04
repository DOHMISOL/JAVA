import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("학생의 번호를 입력해주세요.");
		String StudentNumber = scanner.nextLine();
		
		student.math();
		student.english();
		student.korean();
		student.sum();
	}
}
