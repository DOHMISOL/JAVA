import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input4.txt"));
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 테스트 케이스 수 입력

        for (int i = 0; i < N; i++) { // 각각의 테스트 케이스를 반복
            int numElements = scanner.nextInt(); // 각 테스트 케이스에 대한 요소 수 입력
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < numElements; j++) { // 행에 대한 요소들 입력
                list.add(scanner.nextInt());
            }
            Collections.sort(list); // 리스트를 오름차순으로 정렬
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println(); // 개행
        }
	}
}
