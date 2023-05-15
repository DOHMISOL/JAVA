import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q5_1 {
	public static void main(String[] args) throws IOException {
		//number combination
		System.setIn(new FileInputStream("src/input5_1.txt"));
		Scanner scanner = new Scanner(System.in);
		
		int d = scanner.nextInt();
		boolean flag = false;
		
		int [] arr = new int[d];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%d==0) {
				System.out.println(arr[i]+" ");
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println(-1);
		}
	}
}
