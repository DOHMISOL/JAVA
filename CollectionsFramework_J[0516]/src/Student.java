import java.util.Scanner;

public class Student {
	String name;
	int score;

	Student(){
	}
	
	Student(boolean isInput){
		if(isInput) {
			this.inputData();
		}
	}
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name : ");
		String tmp = scanner.nextLine();
		this.name = tmp;
		System.out.println("score : ");
		tmp = scanner.nextLine();
		try {
			this.score = Integer.parseInt(tmp);
		}catch(Exception e) {
			System.out.println("score i NaN");
		}
	}
	
	public void Rank(Student[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i].score < list[j].score) {
					Student tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
			System.out.println(list[i].name + "의 성적은 " + list[i].score + "입니다.");
		}
	}
	@Override
	public String toString() {
		return this.name + "(" + this.score + ")";
	}
};
