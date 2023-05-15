import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q5_2 {
	public static void main(String[] args) throws IOException {
		// number combination
		System.setIn(new FileInputStream("src/input5_2.txt"));
		Scanner scanner = new Scanner(System.in);

		Integer[] arr1 = new Integer[6];
		int[] arr2 = new int[6];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr1, Collections.reverseOrder());

		boolean flag = true;
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] != arr2[i]) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
	}
}
