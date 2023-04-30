import java.util.Arrays;
import java.util.Scanner;

public class ClassRoom {
	String name;
	Student[] student = new Student[100];
	int index=0;
	int midddleScoreTotal = 0;
	int finalScoreTotal = 0;
	
	ClassRoom(String name){
		this.name = name;
	}
	
	public void addStudent() {
		System.out.println("추가할 학생정보를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("성별 ( 남자 or 여자 ) : ");
		String sex = scanner.nextLine();
		System.out.println("주소 ( 서울, 부산...) : ");
		String address = scanner.nextLine();
		this.student[this.index] = new Student(name, sex, address);
		this.index++;
		
	}
	
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 목록 출력");
		System.out.println("3. 시험 점수 출력");
		System.out.println("4. 시험 총점 출력");
		System.out.println("5. 중간고사 순위");
		String selectMenu = scanner.nextLine();
		if(selectMenu.equals("1")) {
			this.addStudent(); //a반클래스한테 addStudent를 해야하니까 this를 해줘야한다.
		}else if(selectMenu.equals("2")) {
			this.printStudents();
		}else if(selectMenu.equals("3")) {
			this.inputScore();
		}else if(selectMenu.equals("4")) {
			this.calcTotal();
		}else if(selectMenu.equals("5")) {
			this.printMiddleRank();
		}else {
			System.out.println("입력이 잘못되었습니다.");
			this.showMenu();
		}
	}
	
	public void printStudents() {
		for(int i=0; i<this.index;i++) {
			System.out.println( "" + i + ":" + student[i] );
		}
	}
	
	public void inputScore() {
		this.printStudents();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력을 원하는 학생 선택");
		String selectStudent = scanner.nextLine();
		int selectNumber = Integer.parseInt(selectStudent);
		if(this.student[selectNumber] != null) {
			this.student[selectNumber].showMenu();
		}
	}
	
	public void calcTotal() { //A반 학생 전체의 중간&기말
		this.midddleScoreTotal =0; // A반 학생(this)의 중간고사 성적
		this.finalScoreTotal = 0;
		for(int i=0; i<this.index;i++) {//student의 갯수가 아니라 인덱스(실제입력된값)만큼
			this.midddleScoreTotal = this.student[i].test[0].total;
			this.finalScoreTotal = this.student[i].test[1].total;
		}
		System.out.println(this.name +"의 중간고사 총점은" + this.midddleScoreTotal  + "입니다");
		System.out.println(this.name +"의 기말고사 총점은" + this.finalScoreTotal  + "입니다");
	};
	
	public void printMiddleRank() {
		for(int i=0; i<this.index;i++) {
			for(int j=i+1; j<this.index;j++) {
				if(this.student[i].test[0].total<this.student[j].test[0].total) {
					Student temp = this.student[i]; //순위만 나타내면 되니까 인덱스만 switch하면 됌 //int temp가 아니고 Student타입으로 맞춰줘야한다.
					this.student[i] = this.student[j];
					this.student[j] = temp;
				}
			}
		}
	}
	
	public String toString() {
		return this.name + "(" + this.index + "명)";
		
	}
}

