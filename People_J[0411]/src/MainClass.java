import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		People [] people = new People[99999];
//		people[0] = new People();
//		people[0].address;
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<9999999;i++) {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1. 새 데이터 입력");
			System.out.println("2. 전체 데이터 출력");
			System.out.println("3. 지역별 통계");
			System.out.println("q. 종료");
			
			String menuString =scanner.nextLine();
			if(menuString.equals("q")) {
				break;
			}else if(menuString.equals("1")) {
				//입력실행
				people[index] = new People();
//					people[index].name = "홍길동";
//					people[index].address = "서울";
//					people[index].sex = "남성";
				people[index].inputData();
				index++;
			}else if(menuString.equals("2")) {
				//전체 출력
				for(int j=0; j<index;j++) {
					System.out.println(people[j].name);
					people[j].printInfo();
				}
			}else if(menuString.equals("3")) {
//				Region[] region = new Region[6];
//				region[0] = new Region();
//				region[0].name = "서울";
				Region[] region = {
					new Region("서울"), new Region("경기"),new Region("충청"),
					new Region("강원"), new Region("전라"),new Region("경상")
				};
				
				for(int j=0; j<region.length;j++) {
					region[j].calcCount(people);
				}
				String[]region = {"서울","경기","충청","전라","경상","강원"};
				int[] regionCount = new int[region.length];
				int seoul = 0, gyeonggi = 0, chungcheong = 0, jeonra = 0, gyeongsang = 0, gangwon = 0; 
				for(int j=0; j<index;j++) {
					if(people[j].adress.equals("서울")) {
						seoul++;
					}else if(people[j].adress.equals("경기")) {
						gyeonggi++;
					}else if(people[j].adress.equals("충청")) {
						chungcheong++;
					}else if(people[j].adress.equals("전라")) {
						jeonra++;
					}else if(people[j].adress.equals("경상")) {
						gyeongsang++;
					}else if(people[j].adress.equals("강원")) {
						gangwon++;
					}
				}
				System.out.println("서울 인구 수 :" + seoul);
				System.out.println("경기 인구 수 :" + gyeonggi);
				System.out.println("충청 인구 수 :" + chungcheong);
				System.out.println("전라 인구 수 :" + jeonra);
				System.out.println("경상 인구 수 :" + gyeongsang);
				System.out.println("강원 인구 수 :" + gangwon);
			}else {
				System.out.println("입력이 잘못되었습니다. 확인후 다시 입력해주세요.");
			}
			System.out.println();
			System.out.println();
		}
	} 
}
