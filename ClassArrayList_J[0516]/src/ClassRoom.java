import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
	String name;
	int score;
	ArrayList<Student> students = new ArrayList<Student>();
	
	Student(String name, int score){
		this.name = name; 
		this.score = score; 
	}
	
	public void printStudent() {
			System.out.println("이름  : " + this.name + " " + "성적 : " + this.score);
	}
	
	public void selectClassRoom() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 번호를 선택해주세요");
		int inputNumber = scanner.nextInt();
	}
	@Override
	public String toString() {
		return this.name + "(" + this.students.size();
	}
}
