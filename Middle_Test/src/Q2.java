import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) throws IOException {
		// 입력처리 기본
		Scanner scanner = new Scanner(new FileInputStream("src/input2.txt"));
		int N = scanner.nextInt();
		char targetChar = 'A';

		for (int i = 0; i < N; i++) {
		    Scanner scanner2 = new Scanner(new FileInputStream("src/input2.txt"));
		    int count = 0;
		    while (scanner2.hasNextLine()) {
		        String line = scanner2.nextLine();
		        for (int j = 0; j < line.length(); j++) {
		            if (line.charAt(j) == targetChar) {
		                count++;
		            }
		        }
		    }
		    System.out.println(targetChar + "가 나타난 갯수는 " + count + "입니다.");
		}
	}
}
