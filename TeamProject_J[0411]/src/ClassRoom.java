
public class ClassRoom {
	
	String className;
	Student[] student = new Student[100];
	int index = 0;
	String teacher;
	
	//반이름 생성
	public void setname(String name) {
		this.className = name;
	}
	
	//학생 생성 후 학생 번호, 학생 정보 입력 호출
	public void create() {
		student[index] = new Student(); //학생 생성
		student[index].setNum(index+1);
		student[index].inputData(this.className);
		index++;
	}
	public void info() {
		for(int i=0; i<index; i++) {
			student[i].printInfo(this.className);
		}
	}
}
