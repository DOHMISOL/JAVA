import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input6.txt"));
		Scanner scanner = new Scanner(System.in);

		// 첫 번째 배열 입력받기
		int n = 7;
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scanner.nextInt();
		}

		// 두 번째 배열 입력받기
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = scanner.nextInt();
		}

		// 첫 번째 배열을 오름차순으로 정렬
		Arrays.sort(arr1);

		// 두 번째 배열을 오름차순으로 정렬하되, 첫 번째 배열의 정렬 순서를 따름
		int[] sortedArr2 = new int[n];
		for (int i = 0; i < n; i++) {
			int index = findIndex(arr1, arr2[i]); // 첫 번째 배열에서 해당 값의 위치를 찾음
			sortedArr2[i] = arr2[index]; // 두 번째 배열에서 해당 위치에 있는 값을 sortedArr2에 대입
		}

		// 두 배열이 같은지 비교
		if (Arrays.equals(arr1, sortedArr2)) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
	}

	// 배열 arr에서 value의 인덱스를 찾는 함수
	public static int findIndex(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1; // value가 arr에 없는 경우 -1 리턴
	}
}
