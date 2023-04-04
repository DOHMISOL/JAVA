import java.util.Scanner;

public class HrManagement {
	int nameCount = 0;
	int seoulCount = 0;
	int gyenggiCount = 0;
	int gangWonCount = 0;
	int chungChungCount = 0;
	int jeonLaCount = 0;
	int gyeongSangCount = 0;
	int manCount = 0;
	int womanCount = 0;
	Scanner scanner = new Scanner(System.in);
	
	//이름입력
	public void name() {
		System.out.println("이름을 입력해주세요.");
		String inputString1 = scanner.nextLine();
		System.out.println("입력하신 이름은 " + inputString1 + "입니다");
		nameCount++;
		System.out.println("현재 인구수는 " + nameCount);
	}
	
	//주소입력
	public void address() {
		System.out.println("현재 주소지를 입력해주세요.");
		System.out.println("1. 서울 2. 경기도 3.강원도 4. 충청도 5. 전라도 6. 경상도");
		String inputString2= scanner.nextLine();
		int inputInt2 = Integer.parseInt(inputString2);
		
		if(inputInt2 == 1){
			System.out.println("입력하신 주소지는 서울입니다.");
			seoulCount++;
		}else if(inputInt2 == 2) {
			System.out.println("입력하신 주소지는 경기도입니다.");
			gyenggiCount++;
		}else if(inputInt2 == 3) {
			System.out.println("입력하신 주소지는 강원도입니다.");
			gangWonCount++;
		}else if(inputInt2 == 4) {
			System.out.println("입력하신 주소지는 충청도입니다.");
			chungChungCount++;
		}else if(inputInt2 == 5) {
			System.out.println("입력하신 주소지는 전라도입니다.");
			jeonLaCount++;
		}else if(inputInt2 == 6) {
			System.out.println("입력하신 주소지는 경상도입니다.");
			gyeongSangCount++;
		}
		System.out.println("서울 합은 " + seoulCount +" , 경기 합은 " + gyenggiCount + " , 강원 합은 " + gangWonCount + " , 충청 합은 " + chungChungCount + " , 전라도 합은 " + jeonLaCount + " , 경상도 합은 " + gyeongSangCount +"입니다.");
	}
	//성별입력
	public void sex() {
		System.out.println("귀하의 성별을 입력해주세요.");
		System.out.println("1. 남자  2. 여자");
		String inputString3 = scanner.nextLine();
		int inputInt3 = Integer.parseInt(inputString3);
		
		
		if(inputInt3 == 1){
			System.out.println("남성입니다.");
			manCount++;
		}else {
			System.out.println("여성입니다.");
			womanCount++;
		}
		System.out.println("남성 인구수는 " + manCount + "여성인구는 "+ womanCount + "입니다.");
	}
}
