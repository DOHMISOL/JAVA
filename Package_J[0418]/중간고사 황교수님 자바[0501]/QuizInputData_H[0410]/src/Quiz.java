import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/inputAS.txt"));
		Scanner scanner = new Scanner(System.in);
		
		int T; //2행
		T = scanner.nextInt();
		int N; //3열
		
		for(int test_case = 1; test_case <= T; test_case++) {
			N = scanner.nextInt();
			for(int i=0; i<N; i++) {
				System.out.println(scanner.nextInt());
			}
		}
	}
}
