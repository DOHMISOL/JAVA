import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
//		1. 첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어질 때, 평균값과 중앙값을 출력하는 프로그램을 작성하시오.
//		1
//		2
//		3
//		4
//		5
//		출력예시>
//		3
//		3
		Scanner scanner = new Scanner(System.in);
		int [] value = new int[5];
		int sum = 0;
		int swap = 0;
		
		for(int i=0; i < value.length;i++) {
			int s = scanner.nextInt();
			value[i] = s;
			sum = sum + i+1;
		}
		for(int i=0; i<value.length;i++) {
			for(int j=i+1; j<value.length-1;j++) {
				if(value[i] >value[j]) {
					int tmp = value[i];
					value[i] = value[j];
					value[j] = tmp;
				}
			}
		}
		System.out.println(sum / value.length);
		System.out.println(value[value.length - 3]);
		
	}
}


