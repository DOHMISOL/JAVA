import java.util.Scanner;

public class HomeWork_2 {
	public static void main(String[] args) {
//	[문제2]사용자에게 9개의 숫자를 입력받아서 3*3의 이중 배열에 넣은 후 각행의 덧셈 합을 출력하시오.
//	조건1) 출력 시 4*4의 형식으로 출력 (4행째는 덧셈 합)
//	조건2) 데이터 출력시 정렬된 형식으로 출력 비고. 이중배열 사용법 int[][] arr = new int[4][4];비고. 
//	데이터를 정렬된 형식으로 출력하는 방법을 찾아보시오
		
		int[][] arr = new int[4][4];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("9개 숫자를 입력해주세요");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			int sum = 0;
			for(int j=0;j<3;j++) {
				sum = sum + arr[i][j];
			}
			arr[i][3] = sum;
			System.out.print((i+1) +"행의 합은 :"+ sum);
			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			int sum = 0;
			for(int j=0;j<3;j++) {
				sum = sum + arr[j][i];
				arr[3][j] = sum;
			}
			System.out.print((i+1) +"행의 합은 :"+ sum);
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}

