
public class J4_Loop4 {
	public static void main(String[] args) {
		//1,2,3,4,5,....+100 = 5050
		//  i : 초기값 1, 종료값, 하나씩 증가
//		int i = 1;
		int sum = 0;

//		sum = sum + i; // sum <-1
//		i++;           // i <-2
//		sum = sum + i;  // sum <-3
//		
		for(int i=1; i<=100; i++) {
			sum = sum + i;				
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3 == 0) {
				sum1 = sum1 + i;
			}
			System.out.println("3의 배수 누적합 : " + sum);
		
	}
}
}
//1~100 누적합 구하고 있습니다. 3의 배수만 누적합을 구하세요. (3,6,9,12,18...)
//1~100 누적합 중 홀수만 구하세요,(1,3,5,7,9...)