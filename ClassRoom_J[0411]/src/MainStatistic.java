import java.util.Scanner;

public class MainStatistic {
	public static void main(String[] args) {
//		a.student[0] = new Student();
//		a.student[0].doStudent();
		int indexA = 0; int indexB = 0; int indexC = 0; 
		ClassRoom a = new ClassRoom();
		ClassRoom b = new ClassRoom();
		ClassRoom c = new ClassRoom();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 학생정보입력");
		System.out.println("2. 중간기말 성적입력");
		System.out.println("3. 전체목록 출력");
		System.out.println("4. 통계출력");
		
		//1번 학생정보입력
		
		for(int i=0; i<99999;i++) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 전체목록 출력");
			System.out.println("3. 통계출력");
			int inputNum = scanner.nextInt();
			
			//1번
			if(inputNum == 1) {
				System.out.println("반을 선택해주세요. 1.A반 2. B반 3.C반  q.종료");
				int inputNum2 = scanner.nextInt();
				if (inputNum2 == 1) {
					for(int j= 0; j<100;j++) {
						a.student[j] = new Student();
						a.student[j].doStudent();
						indexA++;
						break;
				} else if(inputNum2 == 2) {
					for(int j= 0; j<100;j++) {
						b.student[j] = new Student();
						b.student[j].doStudent();
						indexB++;
						break;
				} else if(inputNum2 == 3) {
					for(int j= 0; j<100;j++) {
						c.student[j] = new Student();
						c.student[j].doStudent();
						indexC++;
						break;
				}
			//2번 전체목록 출력
			} else if(inputNum == 2) {
				for(int j= 0; j<indexA; j++) {
					if(a.student[j] ==null) {
						continue;
					}else {
						System.out.println( a.student[j].name + a.student[j].address + a.student[j].sex + a.student[j].test.total );
					}
				}
				for(int j= 0; j<indexB; j++) {
					if(b.student[j] ==null) {
						continue;
					}else {
						System.out.println( b.student[j].name + b.student[j].address + b.student[j].sex + b.student[j].test.total );
					}
				}
				for(int j= 0; j<indexC; j++) {
					if(c.student[j] ==null) {
						continue;
					}else {
						System.out.println( c.student[j].name + c.student[j].address + c.student[j].sex + c.student[j]. test.total );
					}
				}
			//3번 통계출력
			} else if(inputNum == 3) {
			
			}else { //4번 종료
				System.out.println("q");
				break;
			}
		}
	}
}
				
