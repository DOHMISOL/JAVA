import java.util.Scanner;

public class HomeWork_4 {
	public static void main(String[] args) {
		System.out.println("식사시간과 술의 유무를 알려주세요.");
		System.out.println("점심 유무 : 1. O, 2. X");
		System.out.println("술의 유무 : 3. O, 4. X");
		
		Scanner scanner = new Scanner(System.in);
		String inputString1 = scanner.nextLine();
		int inputNumber1 = Integer.parseInt(inputString1);
		String inputString2 = scanner.nextLine();
		int inputNumber2 = Integer.parseInt(inputString2);
		scanner.close();
	
		if(inputNumber1 == 1) {
			if(inputNumber2 == 3) {
				System.out.println(' ');
			}else {
				System.out.println("만들어야할 초밥의 밥알 갯수는 280개입니다.");
			}
		}
		
		if(inputNumber1 == 2) {
			if(inputNumber2 == 3) {
				System.out.println(' ');
			}else {
				System.out.println("만들어야할 초밥의 밥알 갯수는 320개입니다.");
			}
		}
			
	}
}
