
public class MainClass1 {
	public static void main(String[] args) {
		Student[] student = new Student[30];
		
		//데이터입력
		for(int i =0; i<student.length;i++) {
			//객체 생성
			student[i] = new Student();
			//데이터 입력
			student[i].inputData();
		}
		
		//계산
		int korTotal =0, engTotal = 0, mathTotal =0;
		for(int i =0; i<student.length;i++) {
			korTotal = korTotal + student[i].kor;
			engTotal = engTotal + student[i].kor;
			mathTotal = mathTotal + student[i].kor;
		}
		
		//출력
		System.out.println("국어점수 총점" + korTotal + ", 평균 : " + (korTotal /student.length));
		System.out.println("영어점수 총점" + engTotal + ", 평균 : " + (engTotal /student.length));
		System.out.println("수학점수 총점" + mathTotal + ", 평균 : " + (mathTotal /student.length));
	}
}
