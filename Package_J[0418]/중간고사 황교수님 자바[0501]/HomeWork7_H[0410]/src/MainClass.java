import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N;i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i=0; i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
	}
}

