import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
//		Base[] b = new Base[3];
//		Base s1 = new Triangle();
//		s1.doAction();
//		b[0] = new Triangle();
//		b[0].doAction();
		
//		Base s2 = new Square();
//		s2.doAction();
//		b[1] = new Square();
//		b[1].doAction();
//		
//		Base s3 = new Circle();
//		s3.doAction();
//		b[2] = new Circle();
//		b[2].doAction();
		
//		System.out.println("----------메뉴-------------");
//		System.out.println("원하시는 메뉴를 선택해주세요.");
//		System.out.println("1. 도형선택");
//		System.out.println("2. 도형 값 출력");
//		Scanner scanner = new Scanner(System.in);
//		int inputString = scanner.nextInt();
//		int [] total = new int[10];
//		int triangle = 0;
//		int Square = 0;
//		int Circle = 0;
//		for(int i =0; i<9999;i++) {
//			if(inputString == 1) {
//				for(int j=0; j<total.length;j++) {
//					System.out.println("원하시는 도형 10개를 선택해주세요.");
//					System.out.println("1.삼각형  2. 사각형 3. 원");
//					inputString = scanner.nextInt();
//					if(inputString == 1) {
//						b[0] = new Triangle();
//						b[0].doAction();
//					}else if(inputString == 2) {
//						b[1] = new Square();
//						b[1].doAction();
//					}else if(inputString == 3) {
//						b[2] = new Circle();
//						b[2].doAction();
//					}
//				}
//			}else if(inputString ==2) {
//				System.out.println("전체 도형 값을 출력합니다.");
//				System.out.println(Arrays.toString(b));
//			}
//		}
		Base[] b = new Base[3];
		Scanner scanner = new Scanner(System.in);
		for(int i =0; i< b.length;i++) {
			System.out.println("" + i + "번째 도형을 선택해주세요.");
			System.out.println("1. 삼각형 2.사각형 3. 원");
			String inputString = scanner.nextLine();
			if(inputString.equals("1")) {
				b[i] = new Triangle();
			}else if(inputString.equals("2")) {
				b[i] = new Square();
			}else if(inputString.equals("3")) {
				b[i] = new Circle();		
			}
		}
		// 도형 선택된 것을 (배열안에 10개 선택 되어 있음) doAction
		for(int i = 0; i<b.length;i++) {
			if(b[i] == null) {
				// null 에러처리
				continue;
			}
			System.out.println("" + i + "번째 도형");
			b[i].doAction();
		}
		
		Triangle t1 = new Triangle();
		t1.test1();
		
		Base t2 = new Triangle();
		//t2.test1();
		((Triangle)t2).test1();
		
	}
}
