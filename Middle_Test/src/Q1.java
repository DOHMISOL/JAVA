import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) throws IOException {
		//number combination
		System.setIn(new FileInputStream("src/input1.txt"));
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); // 수열의 길이
		int M = scanner.nextInt();  // 수가 더해지는 횟수
		int K = scanner.nextInt(); // 특정 숫자
		
		int [] arr = new int[N];
		for(int i=0; i<M;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int sum = 0;
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.print(arr[i]);
		    
		}
	}
}

