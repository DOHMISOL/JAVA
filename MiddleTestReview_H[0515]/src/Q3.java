import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) throws IOException {
		//number combination
		System.setIn(new FileInputStream("src/input3.txt"));
		Scanner scanner = new Scanner(System.in);
		
		int hang = scanner.nextInt();
		int yeal = scanner.nextInt();
		
		int [][] arr = new int[hang][yeal];
		
		for(int i=0;i<hang;i++) {
			for(int j=0;j<yeal;j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int count = scanner.nextInt();
		for(int i=0;i<count;i++) {
			int sumHang = 0;
			int sumYeal = 0;
			int wantHang = scanner.nextInt()-1;
			int wantYeal = scanner.nextInt()-1;
			for(int j=0;j<arr[0].length;j++) {
				sumHang += arr[wantHang][j];
			}
			System.out.print(sumHang);
			System.out.print(" ");
			for(int j=0;j<arr.length;j++) {
				sumYeal += arr[j][wantYeal];
			}
			System.out.print(sumYeal);
			System.out.println("");
		}
	}
}
