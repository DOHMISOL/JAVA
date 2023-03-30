import java.util.Scanner;

public class J2_LOOP1 {
	public static void main(String[] args) {
///////////////////////////////////////////////////////////////////////////
//		int []a = {1,2,3};
//		
//		for(int i=0; i<a.length; i++){
//			System.out.println(a[i]);
//		}
//		
//		String str[] = { "Mon", "Tue", "Wed" };
//		for (int i = 0; i < str.length; i++){
//			System.out.println(str[i]);
//			}
//
//		int[]num = new int[5];
//		String[] WeekDay = new String[7];
//		//단순히 공간만 확보하고 싶을때
//		
///////////////////////////////////////////////////////////////////////////
//
//		int[] num = new int[5]; //zero-based index
//		num[0] = 2;
//		num[1] = 3;
//		num[2] = 1;
//		num[3] = 5;
//		num[4] = 4;
//		//초기화(initialize)를 어떻게 해야하나?
//		//최소값을 담을 변수를 초기화 할때는 최대값으로 초기화를 해야한다.(Integer.MAX_VALUE)
//		//최대값을 담을 변수를 초기화 할때는 최소값으로 초기화를 해야한다.(Integer.MIN_VALUE)
//		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//		//최대, 최소 값을 출력해주세요.
//		for(int i=0;i<num.length;i++) {
//			if(num[i]< min) min = num[i];
//			if(num[i]< max) max = num[i];
//		}
//		System.out.println("Max Value is " + max);
//		System.out.println("Min Value is " + min);
//		
///////////////////////////////////////////////////////////////////////////
//		
//		int b[] = {1,2,3,4,5};
//		//배열로 되어진것을 string 문자로 변화하고 값대입
//		String ss = Arrays.toString(b);
//
//		System.out.println(ss);
//		
//		ss = ss.replace("[", "");
//		ss = ss.replace("]", "");
//		ss = ss.replace(",", "");
//		ss = ss.replace(" ", "\n");
//		System.out.println(ss);
//		//개행 println에서 ln의 뜻은 new line임. /r/n <br> <p>
//		
///////////////////////////////////////////////////////////////////////////		
	
		//1. 5개의 숫자를 사용자로부터 입력을 받아서, 최대/최소 출력
		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		for(int  i = 0; i<5 ; i++) {
			int b = s.nextInt();
			a[i] =b;		//값을 array a에 저장을 한다.	
		}
		
		int min = Integer.MAX_VALUE;
		int max  = Integer.MIN_VALUE;
		
		for(int i = 0;i<a.length;i++){
			if(a[i] < min) {
				min = a[i];
			}
			if(a[i] > max) {
				max = a[i];
			}
		System.out.println("Max Value is " + max);
		System.out.println("Min Value is " + min);
		}	
	}
				
		//2. a의 배열 {1,2,3,4,5}, String str = Arrays.toString(a); str에 조작을가합니다.[],쉼표제거, 공백제거 replace, split, trim 1 2 3 4 5
}

