import java.util.ArrayList;

public class ClassRoom {
	String name;
	ArrayList<Student> students = new ArrayList<Student>();

	ClassRoom() {

	}

	ClassRoom(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " (" + this.students.size() + "명)";
	}
	
	ClassRoom(boolean isInput){
		if(isInput) {
			this.total();
		}
	}
	
	public void total() {
		System.out.println("반 이름: " + this.name);
		System.out.println("총 학생 수: " + students.size());
		int maxScore = -1;
		int minScore = 100;
		for(int i=0;i<students.size();i++) {
			for(int j=i+1;j<students.size();j++) {
				if(students.get(i).score > maxScore) {
					maxScore = students.get(i).score;
				}
			}
		}
		
		for(int i=0;i<students.size();i++) {
			if(maxScore ==students.get(i).score) {
				System.out.println("최고 점수 "  + "" + i + " : " + students.get(i).score);
			}
		}
		
		for(int i=0;i<students.size();i++) {
			for(int j=i+1;j<students.size();j++) {
				if(students.get(i).score < minScore) {
					minScore = students.get(i).score;
				}
			}
		}
		for(int i=0;i<students.size();i++) {
			if(minScore ==students.get(i).score) {
				System.out.println("최저 점수 "  + "" + i + " : " + students.get(i).score);
			}
		}
	}
}
