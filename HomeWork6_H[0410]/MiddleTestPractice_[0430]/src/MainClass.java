import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ClassRoom[] classRoom = { new ClassRoom("A반"), new ClassRoom("B반"), new ClassRoom("C반"), new ClassRoom("D반"),
				new ClassRoom("E반") };
		
		for(int i=0; i<99999; i++) {
			System.out.println("---------전체반목록---------");
			for(int j=0; j<classRoom.length;j++) {
				System.out.println("" + j + " : " + classRoom[j]);
			}
			System.out.println("수정할 반 번호 입력(종료 : q)");
			Scanner scanner = new Scanner(System.in);
			String selectClass = scanner.nextLine();
			if(selectClass.equals("q")) {
				break;
			}
			int selectClassNumber = Integer.parseInt(selectClass);
			classRoom[selectClassNumber].showMenu();
			System.out.println();
			System.out.println();
		}
	}
}
