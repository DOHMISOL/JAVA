import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) throws IOException {
		//number combination
		System.setIn(new FileInputStream("src/input4.txt"));
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		
		for(int i=0;i<Integer.parseInt(line);i++) {
			String inputData = scanner.nextLine();
			String [] arr = inputData.split(" ");
			int [] intArr = new int[arr.length];
			for(int j=0;j<arr.length;j++) {
				intArr[j] = Integer.parseInt(arr[j]);
			}
			Arrays.sort(intArr);
			System.out.println(Arrays.toString(intArr));
		}
	}
}
