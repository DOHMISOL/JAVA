import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input3.txt"));
		Scanner scanner = new Scanner(System.in);

		int A;
		A = scanner.nextInt();

		int B;
		B = scanner.nextInt();
		int[][] arr = new int[A][B];
		for(int i=0;i<A;i++) {
			for(int j=0; j<B;j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int count = scanner.nextInt();
		int []answer = new int[2];
		for (int i = 0; i < count; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			for (int j = a; j<arr.length;j++) {
				for(int k=b; k<arr.length;k++) {
				int sum = 0;
				sum = sum + arr[j][k];
				answer[0] = sum;
				System.out.println(sum);
				}
			}
			for (int j = a; j<arr.length;j++) {
				int sum = 0;
				for(int k=b; k<arr.length;k++) {
				sum = sum + arr[j][k];
				answer[1] = sum;
				System.out.println(sum);
				}
			}
		}
	}
}
