import java.util.Scanner;

public class P234 {
	public static void main(String[] args) {
		//구구단 7단
//		<조건1>
//		7*1=7 + "처음"
//		7*2=14 + "처음"
//		7*3=21 + "처음"
//		<조건2>
//		7*7=49 + "완성"
//		7*8=56 + "완성"
//		7*9 = 63 + "완성"
//
//
//		i가 1~3이면 처음을 붙인다
//		i가 7~9이면 완성을 붙인다.
//
//		 결과는 &&
		for(int i=1; i<10; i++) {
			if(i > 0 && i < 4) { //(i<4)
				System.out.println("7 *" + i + "=" +(i*7)+"처음");
			}else if(i > 6 && i <= 9) {
				System.out.println("7 *" + i + "=" +(i*7)+"완성");
			}else {
			System.out.println("7 *" + i + "=" +(i*7));
		}
		
	}
//		Scanner n =new Scanner(System.in);
//		for(int i =1 ; i<=10; i++) {
//			int num = n.nextInt();
//			if(i<=3) {
//				System.out.println();
//			}else if(i <=6) {
//				
//			}
//		}
}
}