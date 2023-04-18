import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ClassRoom[] classRoom = { new ClassRoom("A반"), new ClassRoom("B반"), new ClassRoom("C반"), new ClassRoom("D반"),
				new ClassRoom("E반") };
		;
//		Student[] sTemp = {new Student("홍길동","남자","서울"),new Student("둘리","남자","부산"),new Student("또치","남자","부산")};
//		classRoom[0].student = sTemp;
//		classRoom[0].addStudent();
//		classRoom[0].addStudent();
		for (int k = 0; k < 999999; k++) {
			System.out.println("--------전체 반 목록------");
			for (int i = 0; i < classRoom.length; i++) {
				System.out.println("" + i + " : " + classRoom[i]);
			}
			System.out.println("수정할 반 번호 입력 (종료 : q)");
			Scanner scanner = new Scanner(System.in);
			String selectClass = scanner.nextLine();
			if (selectClass.equals("q")) {
				break;
			}
			int selectClassNumber = Integer.parseInt(selectClass);
			classRoom[selectClassNumber].showMenu();
			System.out.println();
			System.out.println();
		}

//		for (int i = 0; i < 999999; i++) {
//			System.out.println("--------메뉴--------");
//			System.out.println("1. 반선택");
//			System.out.println("2. 학생목록 출력");
//			String inputNum = scanner.nextLine();

//			for (int j = 0; j < 99999; j++) {
//				if (inputNum.equals("1")) {
//					System.out.println("반을 선택해주세요. 1. A반 2.B반 3.C반 4.D반 5.E반 q 종료");
//					String inputNum1 = scanner.nextLine();
//					if (inputNum1.equals("q")) {
//						System.out.println("종료되었습니다.");
//						break;
//					} else if (inputNum1.equals("1")) {
//						classRoom[0].addStudent();
//					} else if (inputNum1.equals("2")) {
//						classRoom[1].addStudent();
//					} else if (inputNum1.equals("3")) {
//						classRoom[2].addStudent();
//					} else if (inputNum1.equals("4")) {
//						classRoom[3].addStudent();
//					} else if (inputNum1.equals("5")) {
//						classRoom[4].addStudent();
//					}
//				} else if (inputNum.equals("2")) {
//					System.out.println("출력하고 싶은 반을 선택해주세요. 1. A반 2.B반 3.C반 4.D반 5.E반");
//					String inputNum2 = scanner.nextLine();
//					if (inputNum2.equals("1")) {
//						System.out.println(classRoom[0]);
//					} else if (inputNum2.equals("2")) {
//						System.out.println(classRoom[1]);
//					} else if (inputNum2.equals("3")) {
//						System.out.println(classRoom[2]);
//					} else if (inputNum2.equals("4")) {
//						System.out.println(classRoom[3]);
//					} else if (inputNum2.equals("5")) {
//						System.out.println(classRoom[4]);
//					}
//				}
//			}
	}
}

