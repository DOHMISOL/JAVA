import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
		
		//1. 5개의 숫자를 사용자로부터 입력을 받아서, 최대/최소 출력
		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		for(int  i = 0; i<5 ; i++) {
			int b = s.nextInt();
			a[i] =b;		//값을 array a에 저장을 한다.	
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("max value is "+ max);
		System.out.println("min value is "+ min);
	}
}
