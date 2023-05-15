import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) throws IOException {
		//number combination
		System.setIn(new FileInputStream("src/input1.txt"));
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("n");
		int n = scanner.nextInt();
		System.out.println("m");
		int m = scanner.nextInt();
		System.out.println("k");
		int k = scanner.nextInt();
		
		Integer [] arr = new Integer[n];
		
		System.out.println("숫자입력");
		for(int i =0; i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int sum = 0;
		int count = 0;
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i =0; i<n ;i++) {
			sum += arr[i]*k;
			count = count + k;
			if(count == (m+1)) {
				break;
			}
		}
		System.out.println(sum);
	}
}
