import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		ClassRoom classA = new ClassRoom();
		ClassRoom classB = new ClassRoom();
		ClassRoom classC = new ClassRoom();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<999999;i++) {
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 성적 입력");
			System.out.println("3. 전체 목록 출력");
			System.out.println("4. ");
			
			String inputMenu = scanner.nextLine();
			if(inputMenu.equals("q")) {
				break;
			}else if(inputMenu.equals("1")) {
				//학생정보 입력
				System.out.println("정보를 입력할 반을 입력해주세요.");
				System.out.println("1. A반 2.B반 3.C반");
				String selectClass = scanner.nextLine();
				if(selectClass.equals("1")) {
					classA.setname("A반");
					classA.create();
				}else if(selectClass.equals("2")) {
					classB.setname("B반");
					classB.create();
				}else if(selectClass.equals("3")) {
					classC.setname("C반");
					classC.create();
				}
			}else if(inputMenu.equals("2")) {
				
			}else if(inputMenu.equals("3")) {
				//전체목록 출력
				classA.info();
				classB.info();
				classC.info();
			}
			
		}
		
	}
}
